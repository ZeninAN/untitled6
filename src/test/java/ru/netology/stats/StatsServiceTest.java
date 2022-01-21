package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void calculateSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void calculateAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.calculateAverage(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void minSalesInMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void maxSalesInMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void belowAverage() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.belowAverage(sales);
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void aboveAverage() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.aboveAverage(sales);
        assertEquals(expected, actual);
    }
}