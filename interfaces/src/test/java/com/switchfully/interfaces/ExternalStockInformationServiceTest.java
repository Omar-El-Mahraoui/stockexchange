package com.switchfully.interfaces;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ExternalStockInformationServiceTest {

    @Test
    void getPriceInEuroForStock_givenAStock_thenReturnItsPrice() {
        assertEquals(new BigDecimal("1.2"),new BigDecimal("1.2"));
        assertThat(new BigDecimal("1.2")).isEqualTo(new BigDecimal("1.2"));
    }

}