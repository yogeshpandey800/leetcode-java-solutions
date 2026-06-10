// Problem 35 - Search Insert Position

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        SearchInsertPosition sol = new SearchInsertPosition();

        int[] nums = {1, 3, 5, 6};
        System.out.println(sol.searchInsert(nums, 5)); // 2
        System.out.println(sol.searchInsert(nums, 2)); // 1
        System.out.println(sol.searchInsert(nums, 7)); // 4
    }
}
