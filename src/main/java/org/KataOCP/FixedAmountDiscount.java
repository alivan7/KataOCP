package org.KataOCP;

public class FixedAmountDiscount implements Discount{
    private final double fixedAmount;
    public FixedAmountDiscount(double fixedAmount){
        this.fixedAmount = fixedAmount;
    }
    @Override
    public double applyDiscount(double amount) {
        double result =this.fixedAmount - amount;
        return result;


    }
}
