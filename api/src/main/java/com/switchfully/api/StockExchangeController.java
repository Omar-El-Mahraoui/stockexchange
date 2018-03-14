package com.switchfully.api;

import com.switchfully.domain.Stock;
import com.switchfully.service.StockService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import javax.inject.Named;

@ResponseBody
@RequestMapping("/stocks")
@Named
public class StockExchangeController {

    private StockService stockService;

    @Inject
    public StockExchangeController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping("/{stockId}")
    public StockDto getStock(@PathVariable String stockId) {
        Stock stock = stockService.getStock(stockId);
        return StockDto.transformToStockDto(stock);
    }

}
