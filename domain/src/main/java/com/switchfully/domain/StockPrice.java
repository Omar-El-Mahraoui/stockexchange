package com.switchfully.domain;

import java.math.BigDecimal;
import java.util.Objects;

public class StockPrice {

    private BigDecimal price;
    private StockCurrency currency;

    public StockPrice(BigDecimal price, StockCurrency currency) {
        this.price = price;
        this.currency = currency;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public StockCurrency getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return price.toString() + currency.getLabel();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockPrice that = (StockPrice) o;
        return Objects.equals(price, that.price) &&
                currency == that.currency;
    }

    @Override
    public int hashCode() {

        return Objects.hash(price, currency);
    }
}
