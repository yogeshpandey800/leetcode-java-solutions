// Problem 27 - Remove Element
// Remove all occurrences of val in-place and return the new length

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        RemoveElement sol = new RemoveElement();

        int[] nums1 = {3, 2, 2, 3};
        System.out.println(sol.removeElement(nums1, 3)); // 2

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(sol.removeElement(nums2, 2)); // 5
    }
}
