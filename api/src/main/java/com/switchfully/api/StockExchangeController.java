package com.switchfully.api;

public class StockExchangeController {

    public StockDto getStock(String stockId) {
        stockService.getStock(stockId);
    }

}
