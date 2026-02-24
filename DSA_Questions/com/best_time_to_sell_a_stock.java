package DSA_Questions.com;
public class best_time_to_sell_a_stock {
    public static void main(String [] args) {
        static void int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // update the minimum price so far
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // calculate profit and update maxProfit
            }
        }

        return maxProfit;
    }

}
