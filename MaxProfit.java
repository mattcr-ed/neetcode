public class MaxProfit {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{6, 3, 7, 1}));
    }

    private static int maxProfit(int[] prices) {
        //Start at 1st price, check against every other day for max profit
        //Iterate through array checking forward, if new max price, do that
        int mProfit = 0;
        for (int dPrice : prices) {
            for (int fPrice : prices) {
                if (fPrice - dPrice > mProfit) {
                    mProfit = fPrice - dPrice;
                }
            }
        }
        return mProfit;
    }
}
