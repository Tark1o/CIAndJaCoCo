package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void findSecondMax() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {
                13, 11, 14, 15, 12, 10, 12, 5, 6, 2, 2, 4, 8, 9, 1, 3
        };
        long expected = 15;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);

    }


}