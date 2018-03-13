package com.switchfully.api;

import com.switchfully.domain.Stock;
import com.switchfully.domain.StockCurrency;
import com.switchfully.domain.StockPrice;

import java.math.BigDecimal;
import java.util.StringJoiner;

public class StockDto {

    private String id;
    private String name;
    private StockPrice price;

    private StockDto(Stock stock) {
        this.id = stock.getId();
        this.name = stock.getName();
        if (stock.getPrice() == null) {
            this.price = new StockPrice(new BigDecimal("0"), StockCurrency.EUR);
        } else {
            this.price = stock.getPrice();
        }
    }

    static StockDto transformToStockDto(Stock stock) {
        if (stock.getPrice() == null) {
            stock.setPrice(new StockPrice(new BigDecimal("0"), StockCurrency.EUR));
        }
        return new StockDto(stock);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public StockPrice getPrice() {
        return price;
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner("\n");
        stringJoiner.add(String.format("ID: %s", id));
        stringJoiner.add(String.format("name: %s", name));
        stringJoiner.add(String.format("price: %s", price.getPrice().toString() + price.getCurrency().getLabel()));
        return stringJoiner.toString();
    }
}
