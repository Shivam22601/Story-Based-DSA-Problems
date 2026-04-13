public class countSubarrays {
    public static int countSubarrays(int[] arr, int k) {
        int left = 0;
        int sum = 0;
        int count = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            count += (right - left + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int k = 4;
        System.out.println(countSubarrays(arr, k)); // Output: 4
    }
}