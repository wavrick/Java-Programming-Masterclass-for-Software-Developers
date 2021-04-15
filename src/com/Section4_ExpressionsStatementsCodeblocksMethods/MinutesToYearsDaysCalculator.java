package com.Section4_ExpressionsStatementsCodeblocksMethods;

public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {

            Long years = minutes / 525600L;
            Long days = (minutes % 525600L) / 1440;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }

    }
}