// Problem 1480 - Running Sum of 1d Array
// runningSum[i] = sum(nums[0]...nums[i])

import java.util.Arrays;

public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        RunningSumOf1dArray sol = new RunningSumOf1dArray();

        System.out.println(Arrays.toString(sol.runningSum(new int[]{1, 2, 3, 4})));    // [1, 3, 6, 10]
        System.out.println(Arrays.toString(sol.runningSum(new int[]{1, 1, 1, 1, 1}))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(sol.runningSum(new int[]{3, 1, 2, 10, 1}))); // [3, 4, 6, 16, 17]
    }
}
