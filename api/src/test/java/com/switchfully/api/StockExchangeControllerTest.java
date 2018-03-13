package com.switchfully.api;

import com.switchfully.domain.Stock;
import com.switchfully.domain.StockCurrency;
import com.switchfully.domain.StockPrice;
import com.switchfully.domain.StockRepository;
import com.switchfully.interfaces.ExternalStockInformationService;
import com.switchfully.service.StockService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class StockExchangeControllerTest {

    @Test
    void getStock_givenAValidStockId_thenReturnTheStockDto() {
        StockExchangeController stockExchangeController =
                new StockExchangeController(new StockService(StockRepository.getInstance(), new ExternalStockInformationService()));

        StockPrice price = new StockPrice(new BigDecimal("10.50"), StockCurrency.EUR);
        Stock stock = new Stock("AA", "AA name");
        stock.setPrice(price);
        StockDto stockDto = StockDto.transformToStockDto(stock);

        assertThat(stockExchangeController.getStock("AA"))
                .isEqualTo(stockDto);
    }

}