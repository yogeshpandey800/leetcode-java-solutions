public class ReverseInteger {
    public int reverse(int x) {

        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;

            if(reversed > Integer.MAX_VALUE / 10 || reversed < Integer.MIN_VALUE / 10){
                return 0;
            }

            reversed = reversed*10 + digit;
            x = x/10;
        }

        return reversed;
        
    }

    public static void main(String[] args) {
        ReverseInteger sol = new ReverseInteger();

        System.out.println(sol.reverse(123));        // 321
        System.out.println(sol.reverse(-123));       // -321
        System.out.println(sol.reverse(120));        // 21
        System.out.println(sol.reverse(1534236469)); // 0 (overflow)
    }
}
