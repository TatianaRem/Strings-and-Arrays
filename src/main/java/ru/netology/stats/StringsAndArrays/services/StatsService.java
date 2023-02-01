package ru.netology.stats.StringsAndArrays.services;

public class StatsService {
    public int sumAllSales(int[] sales) {
        int sumSales = 0;
        for (int s : sales) {
            sumSales += s;
        }
        return sumSales;
    }


    public int averageSalesPerMonth(int[] sales) {
        int sumSales = 0;
        for (int s : sales) {
            sumSales += s;
        }
        return sumSales / 12;
    }

    public int maxSales(int[] sales) {
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

    public int minSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int calcMonthsBelowAverage(int[] sales) {
        int average = averageSalesPerMonth(sales);
        int monthsUnderAverageSale = 0;
        for (int sale : sales) {
            if (sale > average) {
                monthsUnderAverageSale++;
            }
        }
        return monthsUnderAverageSale;
    }

    public int numberOfMonthAboveAverage(int[] sales) {
        int averageSale = averageSalesPerMonth(sales);
        int monthsAboveAverageSale = 0;
        for (int sale : sales) {
            if (sale < averageSale) {
                monthsAboveAverageSale++;
            }
        }
        return monthsAboveAverageSale;
    }
}

