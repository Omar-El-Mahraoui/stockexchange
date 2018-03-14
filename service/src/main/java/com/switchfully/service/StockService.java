package com.switchfully.service;

import com.switchfully.domain.Stock;
import com.switchfully.domain.StockCurrency;
import com.switchfully.domain.StockPrice;
import com.switchfully.domain.StockRepository;
import com.switchfully.interfaces.ExternalStockInformationService;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class StockService {

    private ExternalStockInformationService externalStockInformationService;

    @Inject
    public StockService(ExternalStockInformationService externalStockInformationService) {
        this.externalStockInformationService = externalStockInformationService;
    }

    public Stock getStock(String stockId) {
        try {
            Stock stock = StockRepository.getInstance().getStockInformation(stockId);
            stock.setPrice(new StockPrice(externalStockInformationService.getPriceInEuroForStock(stockId)
                    , StockCurrency.EUR));
            return stock;
        } catch (IllegalArgumentException e) {
            return new Stock("UNKNOWN","DOES NOT EXIST");
        }
    }

}
