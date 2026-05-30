// Minimum Element After Replacement With Digit Sum



public class MinElement {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;

        for (int num : nums) {
            int sum = 0;

            while (num > 0) {
                sum = sum + num % 10;
                num = num / 10;
            }

            min = Math.min(min, sum);
        }

        return min;
    }

    public static void main(String[] args) {
        MinElement sol = new MinElement();

        System.out.println(sol.minElement(new int[]{10, 12, 13, 14}));   // 1 (digit sum of 10 = 1)
        System.out.println(sol.minElement(new int[]{1, 2, 3, 4}));       // 1
        System.out.println(sol.minElement(new int[]{999, 19, 55}));      // 10 (digit sum of 19 = 10)
        System.out.println(sol.minElement(new int[]{100, 200, 300}));    // 1
    }
}
