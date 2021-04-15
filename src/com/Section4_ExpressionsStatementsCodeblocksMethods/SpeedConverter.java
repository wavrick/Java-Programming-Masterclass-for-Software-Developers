package com.Section4_ExpressionsStatementsCodeblocksMethods;

public class SpeedConverter {

    public static long toMilesPerHour(double kilomentersPerHour){
        if (kilomentersPerHour < 0) {
            return -1;
        }

        return Math.round(kilomentersPerHour / 1.609);
    }

    public static void printConversion(double kilomentersPerHour){

        if (kilomentersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPeHour = toMilesPerHour(kilomentersPerHour);
            System.out.println(kilomentersPerHour +
                    " km/h = " + milesPeHour + " mi/h");
        }

    }

}
