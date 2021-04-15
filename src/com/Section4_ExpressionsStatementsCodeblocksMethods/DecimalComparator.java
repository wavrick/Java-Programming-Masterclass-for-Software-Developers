package com.Section4_ExpressionsStatementsCodeblocksMethods;


public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double num1, double num2){

        int a = (int) (num1 * 1000);
        int b = (int) (num2 * 1000);

        return (a == b);
    }

}



