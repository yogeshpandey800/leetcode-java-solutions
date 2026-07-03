// Problem 169 - Majority Element (Boyer-Moore Voting Algorithm)

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        MajorityElement sol = new MajorityElement();

        int[] nums = {3, 2, 3};
        System.out.println(sol.majorityElement(nums)); // 3

        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(sol.majorityElement(nums2)); // 2
    }
}
