package com.switchfully.service;

import com.switchfully.domain.Stock;
import com.switchfully.domain.StockCurrency;
import com.switchfully.domain.StockPrice;
import com.switchfully.domain.StockRepository;
import com.switchfully.interfaces.ExternalStockInformationService;

public class StockService {

    private StockRepository stockRepository;
    private ExternalStockInformationService externalStockInformationService;

    public StockService(StockRepository stockRepository, ExternalStockInformationService externalStockInformationService) {
        this.stockRepository = stockRepository;
        this.externalStockInformationService = externalStockInformationService;
    }

    public Stock getStock(String stockId) {
        try {
            Stock stock = stockRepository.getStockInformation(stockId);
            stock.setPrice(new StockPrice(externalStockInformationService.getPriceInEuroForStock(stockId)
                    , StockCurrency.EUR));
            return stock;
        } catch (IllegalArgumentException e) {
            return new Stock("UNKNOWN","DOES NOT EXIST");
        }
    }

}
