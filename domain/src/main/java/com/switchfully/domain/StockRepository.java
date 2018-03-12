package com.switchfully.domain;

import com.google.common.collect.ImmutableMap;

public class StockRepository {

    private ImmutableMap<String, Stock> stockDb;

    public StockRepository() {
        stockDb = new ImmutableMap.Builder<String, Stock>()
                .put("AA", new Stock("AA", "AA name"))
                .put("BB", new Stock("BB", "BB name"))
                .put("CC", new Stock("CC", "CC name"))
                .build();
    }

    public Stock getStockInformation(String stockId) throws IllegalArgumentException{
        if (!stockDb.containsKey(stockId)) {
            throw new IllegalArgumentException("Stock not found in database.");
        }
        return stockDb.get(stockId);
    }

    public ImmutableMap<String, Stock> getStockDb() {
        return stockDb;
    }
}
