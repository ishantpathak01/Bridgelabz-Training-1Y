public class ProfitAndLoss {
    public static void main(String[] args) {
        int costPr = 129;
        int sellingPr = 191;
        int profit = sellingPr - costPr;
        double profitPer = (profit * 100.0) / costPr;

        System.out.println(
            "The Cost Price is INR " + costPr + " and Selling Price is INR " + sellingPr + "\n" +
            "The Profit is INR " + profit + " and the Profit Percentage is " + profitPer
        );
    }
}
