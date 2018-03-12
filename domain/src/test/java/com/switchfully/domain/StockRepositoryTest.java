package com.switchfully.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class StockRepositoryTest {

    @Test
    void getStockDb_ifCalled_thenReturnTheDb() {
        assertThat(StockRepository.getInstance().getStockDb())
                .containsKeys("AA", "BB", "CC");
    }

}