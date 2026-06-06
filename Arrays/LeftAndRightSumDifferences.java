// Problem 2574 - Left and Right Sum Differences
// Return answer array where answer[i] = |leftSum[i] - rightSum[i]|
// leftSum[i] = sum of all elements to the left of index i
// rightSum[i] = sum of all elements to the right of index i

import java.util.Arrays;

public class LeftAndRightSumDifferences {
    public int[] leftRightDifference(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        int leftSum = 0;
        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int rightSum = total - nums[i] - leftSum;
            answer[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        LeftAndRightSumDifferences sol = new LeftAndRightSumDifferences();

        int[] nums = {10, 4, 8, 3};
        int[] result = sol.leftRightDifference(nums);
        System.out.println(Arrays.toString(result));
    }
}
