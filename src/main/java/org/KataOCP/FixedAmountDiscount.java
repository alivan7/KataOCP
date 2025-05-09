package org.KataOCP;

public class FixedAmountDiscount implements Discount{

    double fixedAmount = 10;
    @Override
    public double applyDiscount(double amount) {
        double result =amount -this.fixedAmount  ;
        return result;

    }
}
