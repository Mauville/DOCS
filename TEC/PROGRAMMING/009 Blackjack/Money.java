class Money {
    public static double payout(double bet, double funds, double multiplier) {
        double newfunds = bet * multiplier;
        return newfunds;
    }
    public static double bet(double bet, double funds) {
        double newfunds = funds - bet;
        return newfunds;
    }
}	
