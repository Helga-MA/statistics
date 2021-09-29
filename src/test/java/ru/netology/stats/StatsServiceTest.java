package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalcSum() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calcSum(sales);

        assertEquals(expected, actual);
    }

        @Test
        void shouldCalcEverage() {
            StatsService service = new StatsService();

            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            long expected = 15;

            long actual = service.calcEverage(sales);

            assertEquals(expected, actual);

    }

    @Test
    void shouldMonthMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.calcMonthMaxSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthMinSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.calcMonthMinSales(sales);

        assertEquals(expected, actual);
    }


    @Test
    void  shouldCalcNumberMonthLessAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.calcNumberMonthLessAverage(sales);
        assertEquals(expected, actual);

    }


    @Test
    void  shouldCalcNumberMonthMoreAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.calcNumberMonthMoreAverage(sales);
        assertEquals(expected, actual);
    }
}
