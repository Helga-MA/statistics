package ru.netology.stats;

public class StatsService {

    public long calcSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }


    public long calcEverage(long[] sales) {
        long sum = calcSum(sales);

        return sum / sales.length;
    }


    public long calcMonthMaxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long calcMonthMinSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    public long calcNumberMonthLessAverage(long[] sales) {
        long lowSales = 0;
        long average = calcEverage(sales);
        for (long sale : sales) {
            if (sale < average) {
                lowSales = lowSales + 1;
            }
        }
        return lowSales;
    }


    public long calcNumberMonthMoreAverage(long[] sales) {
        long highSales = 0;
        long average = calcEverage(sales);
        for (long sale : sales) {
            if (sale > average) {
                highSales = highSales + 1;
            }
        }
        return  highSales;
    }
}