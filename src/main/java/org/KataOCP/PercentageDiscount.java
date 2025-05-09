package org.KataOCP;

public class PercentageDiscount implements Discount{
    private final double percentage;

    public PercentageDiscount(double percentage){
        this.percentage = percentage;
    }


    @Override
    public double applyDiscount(double amount) {
        return amount - ((amount* this.percentage)/100);

    }
}
