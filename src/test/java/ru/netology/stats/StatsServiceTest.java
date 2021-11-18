package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldcalculateTotal() {
        StatsService service = new StatsService();

        int[] enterpriseSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateTotal(enterpriseSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldfindAverage() {
        StatsService service = new StatsService();

        int[] enterpriseSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.findAverage(enterpriseSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldcalculateMax() {
        StatsService service = new StatsService();

        int[] enterpriseSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.findMaxMonth(enterpriseSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldcalculateMin() {
        StatsService service = new StatsService();

        int[] enterpriseSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.findMinMonth(enterpriseSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldfindMoreAverage() {
        StatsService service = new StatsService();

        int[] enterpriseSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.findMoreAverage(enterpriseSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldfindLessAverage() {
        StatsService service = new StatsService();

        int[] enterpriseSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.findLessAverage(enterpriseSales);

        assertEquals(expected, actual);
    }

}