package org.KataOCP;

import org.junit.jupiter.api.Test;

public class SistemasDescuentosTest {
    @Test
    public void SistemDiscount(){
        FixedAmountDiscount fixedAmountDiscount = new FixedAmountDiscount(200);
        PercentageDiscount percentageDiscount = new PercentageDiscount(20.0);
        double resultDiscount = percentageDiscount.applyDiscount(100);
        double resultDiscontFixed = fixedAmountDiscount.applyDiscount(30);
        System.out.println(resultDiscount);
        System.out.println(resultDiscontFixed);
    }

}
