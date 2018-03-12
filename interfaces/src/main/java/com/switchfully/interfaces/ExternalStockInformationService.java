package com.switchfully.interfaces;

import org.apache.commons.lang3.RandomUtils;

import java.math.BigDecimal;

public class ExternalStockInformationService {

    public BigDecimal getPriceInEuroForStock(String stockId) {
        return new BigDecimal(RandomUtils.nextDouble(10,100) + "").setScale(2,BigDecimal.ROUND_DOWN);
    }


}
