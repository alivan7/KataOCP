package org.KataOCP;

public class SeasonalDiscount implements Discount{
    private final int summerDiscount = 30;

    @Override
    public double applyDiscount(double amount) {
            return amount - (amount * summerDiscount / 100);
    }
}
