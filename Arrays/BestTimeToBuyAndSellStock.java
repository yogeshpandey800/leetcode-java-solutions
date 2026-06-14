// Problem 121 - Best Time to Buy and Sell Stock

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int price : prices) {
            minPrice = Math.min(price, minPrice);
            int profit = price - minPrice;
            maxProfit = Math.max(profit, maxProfit);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock sol = new BestTimeToBuyAndSellStock();

        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(sol.maxProfit(prices)); // 5
    }
}
