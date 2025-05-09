package org.KataOCP;

import org.junit.jupiter.api.Test;

public class SistemasDescuentosTest {
    @Test
    public void SistemDiscount(){
        FixedAmountDiscount fixedAmountDiscount = new FixedAmountDiscount();
        PercentageDiscount percentageDiscount = new PercentageDiscount();
        fixedAmountDiscount.applyDiscount(100);
    }

}
