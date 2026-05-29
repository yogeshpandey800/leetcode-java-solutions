public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        PalindromeNumber sol = new PalindromeNumber();

        System.out.println(sol.isPalindrome(121));   
        System.out.println(sol.isPalindrome(-121));  
        System.out.println(sol.isPalindrome(10));    
        System.out.println(sol.isPalindrome(1221));  
    }
}
