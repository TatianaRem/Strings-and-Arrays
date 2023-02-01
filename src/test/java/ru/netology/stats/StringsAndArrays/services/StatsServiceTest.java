package ru.netology.stats.StringsAndArrays.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindSumAllSales() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedSumSales = 180;
        int actualSumSales = service.sumAllSales(sales);

        Assertions.assertEquals(expectedSumSales, actualSumSales);
    }

    @Test
    public void shouldFindAverageSalesPerMonth() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedAverageSale = 15;
        int actualSumSales = service.averageSalesPerMonth(sales);

        Assertions.assertEquals(expectedAverageSale, actualSumSales);
    }

    @Test
    public void shouldFindNumberOfMonthWithMaxSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxDay = 8;
        int actualMaxDay = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxDay, actualMaxDay);

    }

    @Test
    public void shouldFindNumberOfMonthWithMinSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 9;
        int actualMinMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void shouldFindNumberOfMonthUnderAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumberOfMonth = 5;
        int actualMonthUnderAverageSale = service.numberOfMonthAboveAverage(sales);

        Assertions.assertEquals(expectedNumberOfMonth, actualMonthUnderAverageSale);
    }

    @Test
    public void shouldFindNumberOfMonthAboveAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumberOfMonth = 5;
        int actualMonthUnderAverageSale = service.numberOfMonthAboveAverage(sales);

        Assertions.assertEquals(expectedNumberOfMonth, actualMonthUnderAverageSale);
    }
}
