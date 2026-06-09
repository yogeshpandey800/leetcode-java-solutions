// Max Total Value - find k * (max - min) of the array
// Easy Java Solution - Maximum Total Subarray Value I
// 3689. Maximum Total Subarray Value I
public class MaxTotalValue {
    public long maxTotalValue(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return 1L * k * (max - min);
    }

    public static void main(String[] args) {
        MaxTotalValue sol = new MaxTotalValue();

        int[] nums = {1, 5, 3, 9, 2};
        int k = 3;
        System.out.println(sol.maxTotalValue(nums, k)); // 3 * (9-1) = 24
    }
}
