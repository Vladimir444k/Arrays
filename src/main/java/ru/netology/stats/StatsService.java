package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public long sumSales(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long averageSales(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    public long salesBelowAverage(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                count++;
            }
        }
        return count;
    }

    public long salesAboveAverage(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale > averageSales(sales)) {
                count++;
            }
        }
        return count;
    }

}
