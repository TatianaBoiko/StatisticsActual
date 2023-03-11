package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {
    StatsService StatsService = new StatsService();

    @Test
    void calculateSumm() {
        int[] deals = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSumm = 180;
        int summ = StatsService.sumCalculate(deals);
        assertEquals(expectedSumm, summ);

    }

    @Test
    void calculateAverage() {
        long expectedAverage = 15;
        int[] deals = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long average = StatsService.averageCalculate(deals);
        assertEquals(expectedAverage, average);

    }

    @Test
    void calculateMaxDealsIndex() {
        int[] deals = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxDealsIndex = 8;
        int MaxDealsIndex = StatsService.maxDealsIndex(deals);
        assertEquals(expectedMaxDealsIndex, MaxDealsIndex);
    }

    @Test
    void calculateMinDealsIndex() {
        int[] deals = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinDealsIndex = 9;
        int MinDealsIndex = StatsService.minDealsIndex(deals);
        assertEquals(expectedMinDealsIndex, expectedMinDealsIndex);

    }

    @Test
    void calculateBelowAverage() {

        int[] deals = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedBelowAverage = 5;
        int belowAverage = StatsService.belowAverage(deals);
        assertEquals(expectedBelowAverage, belowAverage);

    }

    @Test
    void calculateAboveAverage() {

        int[] deals = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAboveAverage = 5;
        int aboveAverage = StatsService.aboveAverage(deals);
        assertEquals(expectedAboveAverage, aboveAverage);

    }
}



