// Total Waviness of Numbers in Range I
// A digit is wavy if it is strictly greater or smaller than both its neighbors
// Return total waviness of all numbers from num1 to num2

public class TotalWavinessOfNumbersInRangeI {
    public int totalWaviness(int num1, int num2) {
        int ans = 0;
        for(int i = num1; i<=num2; i++){
            ans = ans + waviness(i);
        }
        return ans;

    }

    private int waviness(int x) {
        char[] digits = String.valueOf(x).toCharArray();
        int count = 0;

        for (int i = 1; i < digits.length - 1; i++) {
            if (digits[i] > digits[i-1] && digits[i] > digits[i+1] || digits[i] < digits[i-1] && digits[i] < digits[i+1]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        TotalWavinessOfNumbersInRangeI sol = new TotalWavinessOfNumbersInRangeI();

        System.out.println(sol.totalWaviness(1, 100));    // small range
        System.out.println(sol.totalWaviness(120, 130));  // 121,131 are wavy
        System.out.println(sol.totalWaviness(1, 10));     // single digit numbers, waviness = 0
    }
}
