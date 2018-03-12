package com.switchfully.api;

import com.switchfully.domain.Stock;
import com.switchfully.service.StockService;

public class StockExchangeController {

    private StockService stockService;

    public StockExchangeController(StockService stockService) {
        this.stockService = stockService;
    }

    public StockDto getStock(String stockId) {
        Stock stock = stockService.getStock(stockId);
        return StockDto.transformToStockDto(stock);
    }

}
