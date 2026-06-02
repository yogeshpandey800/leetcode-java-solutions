// problem 66 -> add one to the number represented as array of digits

import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length -1; i>=0; i--){
            if(digits[i]<9){
                digits[i] += 1;
                return digits;
            }else{
                digits[i] = 0;
            }
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        PlusOne sol = new PlusOne();

        System.out.println(Arrays.toString(sol.plusOne(new int[]{1, 2, 3})));     // [1, 2, 4]
        System.out.println(Arrays.toString(sol.plusOne(new int[]{4, 3, 2, 1}))); // [4, 3, 2, 2]
        System.out.println(Arrays.toString(sol.plusOne(new int[]{9})));           // [1, 0]
        System.out.println(Arrays.toString(sol.plusOne(new int[]{9, 9, 9})));    // [1, 0, 0, 0]
    }
}
