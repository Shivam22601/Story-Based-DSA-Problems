// You are working on an inventory system for an e-commerce warehouse. Products are stored in a sorted array based on product IDs.

// Due to bulk entries, the same product ID may appear multiple times.

// 👉 Your task is to find:

// The first occurrence (start index)
// The last occurrence (end index)

// of a given target product ID.

// If the product is not found, return [-1, -1].

import java.util.*;
public class searchRange{
    public int[] searchRange(int[] nums, int target){
        int first = findfirst(nums, target);
        int last = findlast(nums, target);
        return new int[] {first, last};
    }
    private int findfirst(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        int ans = -1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                ans = mid;
                right = mid - 1; // Continue searching in the left half
            } else if(nums[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
    private int findlast(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        int ans = -1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                ans = mid;
                left = mid + 1; // Continue searching in the right half
            } else if(nums[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
public static void main(String[] args) {
    searchRange sr = new searchRange();
    int[] nums = {1, 2, 2, 3, 4, 5, 5, 5, 6};
    int target = 5;
    int[] result = sr.searchRange(nums, target);
    System.out.println("First and Last Occurrence of " + target + ": " + Arrays.toString(result));
}
}