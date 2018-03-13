package com.switchfully.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;


class StockRepositoryTest {

    @Test
    void getStockDb_ifCalled_thenReturnTheDb() {
        assertThat(StockRepository.getInstance().getStockDb())
                .containsOnlyKeys("AA", "BB", "CC");
        assertThat(StockRepository.getInstance().getStockDb())
                .containsValues(new Stock("AA", "AA name")
                                , new Stock("BB", "BB name")
                                , new Stock("CC", "CC name"));
    }

    @Test
    void getStockInformation_givenAStockIdThatIsPresentInDb_thenReturnThisStock() {
        //given
        StockRepository stockRepository = StockRepository.getInstance();
        String stockId = "AA";
        Stock expectedResult = new Stock("AA", "AA name");

        //when
        Stock actualResult = stockRepository.getStockInformation(stockId);

        //then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void getStockInformation_givenAStockIdThatIsNotPresentInDb_thenThrowException() {
        //given
        StockRepository stockRepository = StockRepository.getInstance();
        String stockId = "A";

        //then
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()->stockRepository.getStockInformation(stockId))
                .withMessage("Stock not found in database.");
    }

}