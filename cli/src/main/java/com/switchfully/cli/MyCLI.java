package com.switchfully.cli;

import com.switchfully.api.StockExchangeController;
import com.switchfully.domain.StockRepository;
import com.switchfully.interfaces.ExternalStockInformationService;
import com.switchfully.service.StockService;

public class MyCLI {

    public static void main(String[] args) {
        if (args.length == 1) {
            StockExchangeController stockExchangeController =
                    new StockExchangeController(new StockService(StockRepository.getInstance()
                                                    , new ExternalStockInformationService()));
            System.out.println(stockExchangeController.getStock(args[0]));
        }
    }

}
