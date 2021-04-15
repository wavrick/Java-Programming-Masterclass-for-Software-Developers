package com.Section4_ExpressionsStatementsCodeblocksMethods;

public class MethodOverloadingChallenge {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            return -1;
        } else {
            return ((feet * 12) + inches) * 2.54;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (inches < 0) {
            return -1;
        } else {
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            return calcFeetAndInchesToCentimeters(feet,remainingInches);
        }
    }
}
