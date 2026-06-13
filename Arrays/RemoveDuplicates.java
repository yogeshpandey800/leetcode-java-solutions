// Problem 26 - Remove Duplicates from Sorted Array

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int index = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[index] != nums[i]) {
                index++;
                nums[index] = nums[i];
            }
        }

        return index + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicates sol = new RemoveDuplicates();

        int[] nums = {1, 1, 2, 3, 3, 4};
        System.out.println(sol.removeDuplicates(nums)); // 4
    }
}
