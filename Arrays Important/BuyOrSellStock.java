/* You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Input: prices = [7,1,5,3,6,4]
Output: 5 */

public class BuyOrSellStock {
    public static void main(String[] args) {
        int arr[] = new int[] { 7, 1, 5, 3, 6, 4 };
        // bfs(arr);
        int ans = maxProfit(arr);
        System.out.println(ans);
    }

    private static void bfs(int[] arr) {
        // this solution will check for the every possibility of buy and selling and
        // take O(n^2) TC

        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                max = ((arr[i] - arr[j]) * -1) > max ? ((arr[i] - arr[j]) * -1) : max;
            }
        }

        System.out.println(max);
    }

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                int temp_Profit = prices[i] - min;
                if (temp_Profit > profit) {
                    profit = temp_Profit;
                }
            }
        }
        return profit;
    }
}
