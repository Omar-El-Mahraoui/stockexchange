package com.switchfully.interfaces;

import java.math.BigDecimal;

public class ExternalStockInformationService {

    public BigDecimal getPriceInEuroForStock(String stockId) {
        //return new BigDecimal(RandomUtils.nextDouble(10,100) + "").setScale(2,BigDecimal.ROUND_DOWN);
        return new BigDecimal("10.50");
    }

}
