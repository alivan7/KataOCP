package org.KataOCP;

import org.junit.jupiter.api.Test;

public class SistemasDescuentosTest {
    @Test
    public void SistemDiscount(){
        FixedAmountDiscount fixedAmountDiscount = new FixedAmountDiscount();
        PercentageDiscount percentageDiscount = new PercentageDiscount(20.0);
        double resultDiscount = percentageDiscount.applyDiscount(100);
        System.out.println(resultDiscount);
    }

}
