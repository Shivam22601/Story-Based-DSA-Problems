import java.util.*;

public class subarraySum {
    public static int[] subarraySum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        // Important: handle case when subarray starts from index 0
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (map.containsKey(sum - target)) {
                return new int[]{map.get(sum - target) + 1, i};
            }

            map.put(sum, i);
        }

        return new int[]{-1, -1}; // not found
    }

    public static void main(String[] args) {
        int[] transactions = {100, -50, 200, -100, 50, 150};
        int target = 150;

        int[] res = subarraySum(transactions, target);
        System.out.println("Start: " + res[0] + " End: " + res[1]);
    }
}