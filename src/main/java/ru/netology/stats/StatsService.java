package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageSalesPerMonth(long[] sales) {
        long sum = calculateSum(sales);
        long averageSales = sum / sales.length;
        return averageSales;
    }

    public long findBestMonth(long[] sales) {
        long currentMax = sales[0];
        long numberOfMonth = 0;
        long bestMonth = 0;
        for (long sale : sales) {
            numberOfMonth += 1;
            if (currentMax <= sale) {
                currentMax = sale;
                bestMonth = numberOfMonth;
            }
        }
        return bestMonth;
    }

    public long findWorstMonth(long[] sales) {
        long currentMin = sales[0];
        long numberOfMonth = 0;
        long worstMonth = 0;
        for (long sale : sales) {
            numberOfMonth += 1;
            if (currentMin >= sale) {
                currentMin = sale;
                worstMonth = numberOfMonth;
            }
        }
        return worstMonth;
    }

    public long findNumberOfGoodMonths(long[] sales) {
        long averageSales = averageSalesPerMonth(sales);
        long numberOfMonths = 0;
        for (long sale : sales) {
            if (sale > averageSales) {
                numberOfMonths += 1;
            }
        }
        return numberOfMonths;
    }

    public long findNumberOfBadMonths(long[] sales) {
        long averageSales = averageSalesPerMonth(sales);
        long numberOfMonths = 0;
        for (long sale : sales) {
            if (sale < averageSales) {
                numberOfMonths += 1;
            }
        }
        return numberOfMonths;
    }
}