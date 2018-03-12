package com.switchfully.api;

import com.switchfully.domain.Stock;

public class StockDto {

    private Stock stock;

    public StockDto(Stock stock) {
        this.stock = stock;
    }

    public static StockDto transformToStockDto(Stock stock) {
        return new StockDto(stock);
    }

}
