// You are given an integer array expenses where expenses[i] 
// represents the money spent on the i-th day, and an integer k.
// Return the maximum total money spent in any k consecutive days.


public class MaxKDaysExpense {

    public static int maxKDaysExpense(int[] expenses, int k) {
        int n = expenses.length;

        // Step 1: Calculate first window sum
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += expenses[i];
        }

        int maxSum = windowSum;

        // Step 2: Slide the window
        for (int i = k; i < n; i++) {
            windowSum = windowSum - expenses[i - k] + expenses[i];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] expenses = {10, 20, 30, 40, 50};
        int k = 2;

        int result = maxKDaysExpense(expenses, k);
        System.out.println("Maximum expense in " + k + " consecutive days: " + result);
    }
}