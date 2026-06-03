// Problem 1920 - Build Array from Permutation
// Given array nums where nums[i] is in range [0, n-1]
// Return ans where ans[i] = nums[nums[i]]

import java.util.Arrays;

public class BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        BuildArrayFromPermutation sol = new BuildArrayFromPermutation();

        System.out.println(Arrays.toString(sol.buildArray(new int[]{0, 2, 1, 5, 3, 4}))); // [0, 1, 2, 4, 5, 3]
        System.out.println(Arrays.toString(sol.buildArray(new int[]{5, 0, 1, 2, 3, 4}))); // [4, 5, 0, 1, 2, 3]
    }
}
