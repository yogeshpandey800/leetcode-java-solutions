// Problem 2161 - Partition Array According to Given Pivot

import java.util.Arrays;

public class PivotArray {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] answer = new int[n];
        int indx = 0;

        for (int num : nums) {
            if (num < pivot) {
                answer[indx] = num;
                indx++;
            }
        }

        for (int num : nums) {
            if (num == pivot) {
                answer[indx] = num;
                indx++;
            }
        }

        for (int num : nums) {
            if (num > pivot) {
                answer[indx] = num;
                indx++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        PivotArray sol = new PivotArray();

        int[] nums = {9, 12, 5, 10, 14, 3, 10};
        int[] result = sol.pivotArray(nums, 10);
        System.out.println(Arrays.toString(result));
    }
}
