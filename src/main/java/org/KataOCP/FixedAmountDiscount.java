package org.KataOCP;

public class FixedAmountDiscount implements Discount{

    double fixedAmount = 10;
    @Override
    public void applyDiscount(double amount) {
        double result =amount -this.fixedAmount  ;
        System.out.println("El monto : "+amount +"aplicando el descuento de: "+this.fixedAmount +"es: "+ result);
    }
}
