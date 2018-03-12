package com.switchfully.domain;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class StockRepository {

    private static Map<String, Stock> stockDb = new ImmutableMap.Builder<String, Stock>()
                                                    .put("AA", new Stock("AA", "AA name"))
                                                    .put("BB", new Stock("BB", "BB name"))
                                                    .put("CC", new Stock("CC", "CC name"))
                                                    .build();

    private StockRepository() { }

    public static StockRepository getInstance() { return new StockRepository(); }

    public Stock getStockInformation(String stockId) throws IllegalArgumentException{
        if (!stockDb.containsKey(stockId)) {
            throw new IllegalArgumentException("Stock not found in database.");
        }
        return stockDb.get(stockId);
    }

    public Map<String, Stock> getStockDb() {
        return stockDb;
    }
}
