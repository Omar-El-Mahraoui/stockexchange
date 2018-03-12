package com.switchfully.api;

import com.switchfully.domain.Stock;

import java.util.Objects;
import java.util.StringJoiner;

public class StockDto {

    private Stock stock;

    public StockDto(Stock stock) {
        this.stock = stock;
    }

    public static StockDto transformToStockDto(Stock stock) {
        return new StockDto(stock);
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner("\n");
        stringJoiner.add(String.format("ID: %s", stock.getId()));
        stringJoiner.add(String.format("name: %s", stock.getName()));
        stringJoiner.add(String.format("price: %s", stock.getPrice() != null ? stock.getPrice().getPrice().toString() +
                " " + stock.getPrice().getCurrency().getLabel() : "UNKNOWN"));

        return stringJoiner.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockDto stockDto = (StockDto) o;
        return Objects.equals(stock, stockDto.stock);
    }

    @Override
    public int hashCode() {

        return Objects.hash(stock);
    }
}
