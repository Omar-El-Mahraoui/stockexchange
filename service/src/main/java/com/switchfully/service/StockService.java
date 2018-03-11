package com.switchfully.service;

import com.switchfully.domain.Stock;
import com.switchfully.domain.StockRepository;

public class StockService {

    private StockRepository stockRepository;

    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public Stock getStock(String stockId) {
        stockRepository.getStockInformation(stockId);
    }

}
