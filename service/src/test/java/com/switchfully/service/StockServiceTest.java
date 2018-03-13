package com.switchfully.service;

import com.switchfully.domain.StockRepository;
import com.switchfully.interfaces.ExternalStockInformationService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class StockServiceTest {

    @Test
    void getStock_givenAValidStockId_thenReturnTheStock() {
        StockRepository stockRepository = Mockito.mock(StockRepository.class);
        ExternalStockInformationService externalStockInformationService
                = Mockito.mock(ExternalStockInformationService.class);
    }

}