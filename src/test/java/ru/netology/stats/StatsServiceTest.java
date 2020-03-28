package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    public long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSum() {

        StatsService service = new StatsService();

        long expected = 180;

        long actual = service.calculateSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void averageSalesPerMonth() {

        StatsService service = new StatsService();

        long expected = 15;

        long actual = service.averageSalesPerMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    void findBestMonth() {

        StatsService service = new StatsService();

        long expected = 8;

        long actual = service.findBestMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    void findWorstMonth() {

        StatsService service = new StatsService();

        long expected = 9;

        long actual = service.findWorstMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    void findNumberOfGoodMonths() {

        StatsService service = new StatsService();

        long expected = 5;

        long actual = service.findNumberOfGoodMonths(sales);

        assertEquals(expected, actual);
    }

    @Test
    void findNumberOfBadMonths() {

        StatsService service = new StatsService();

        long expected = 5;

        long actual = service.findNumberOfBadMonths(sales);

        assertEquals(expected, actual);
    }
}