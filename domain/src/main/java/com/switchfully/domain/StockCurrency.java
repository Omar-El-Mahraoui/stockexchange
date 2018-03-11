package com.switchfully.domain;

public enum StockCurrency {

    EUR("Euro", "€"),
    USD("Dollar", "$"),
    GBP("Pond", "£");

    private String label;
    private String symbol;

    StockCurrency(String label, String symbol) {
        this.label = label;
        this.symbol = symbol;
    }

    public String getLabel() {
        return label;
    }

    public String getSymbol() {
        return symbol;
    }
}
