package org.KataOCP;

import org.junit.jupiter.api.Test;

public class SistemasDescuentosTest {
    @Test
    public void SistemDiscount(){
        FixedAmountDiscount fixedAmountDiscount = new FixedAmountDiscount(200);
        PercentageDiscount percentageDiscount = new PercentageDiscount(20.0);
        SeasonalDiscount seasonalDiscount = new SeasonalDiscount();
        double resultDiscount = percentageDiscount.applyDiscount(100);
        double resultDiscontFixed = fixedAmountDiscount.applyDiscount(30);
        double resultSeasonalDiscount = seasonalDiscount.applyDiscount(100);
        System.out.println("El descuento de por porcentaje fue aplicado: " + resultDiscount);
        System.out.println("El descuento fijo fue aplicado: " +resultDiscontFixed);
        System.out.println("El descuento de invierno fue aplicado: " + resultSeasonalDiscount);
    }

}
