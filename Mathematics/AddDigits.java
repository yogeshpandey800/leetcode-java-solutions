// Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

public class AddDigits {
    public int addDigits(int num) {
        while(num>9){
            int sum = 0;

            while(num>0){
                int digit = num%10;
                sum = sum+digit;
                num = num/10;
            }
            num = sum;
        }
        return num;
    }

    public static void main(String[] args) {
        AddDigits sol = new AddDigits();

        System.out.println(sol.addDigits(38));  // 3+8=11 → 1+1=2
        System.out.println(sol.addDigits(0));   // 0
        System.out.println(sol.addDigits(9));   // 9
        System.out.println(sol.addDigits(99));  // 9+9=18 → 1+8=9
    }
}
