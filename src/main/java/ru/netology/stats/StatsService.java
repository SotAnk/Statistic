package ru.netology.stats;

public class StatsService {

    public int calculateTotal(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int findAverage(int[] sales) {
        return calculateTotal(sales) / sales.length;
    }

    public int findMaxMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int findMinMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int findMoreAverage(int[] sales) {
        int findAverage = findAverage(sales);
        int moreAve = 0;
        for (int sale : sales) {
            if (sale > findAverage) {
                moreAve++;
            }
        }
        return moreAve;
    }

    public int findLessAverage(int[] sales) {
        int findAverage = findAverage(sales);
        int moreAve = 0;
        for (int sale : sales) {
            if (sale < findAverage) {
                moreAve++;
            }
        }
        return moreAve;
    }
}


