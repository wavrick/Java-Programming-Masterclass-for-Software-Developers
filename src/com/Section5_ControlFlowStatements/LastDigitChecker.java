package com.Section5_ControlFlowStatements;

public class LastDigitChecker {

    public static boolean isValid(int number) {

        if ((number >= 10) && (number <= 1000))
            return true;
        else
            return false;
    }

    public static boolean hasSameLastDigit (int a, int b, int c) {

        if ((!isValid(a)) || (!isValid(b)) || (!isValid(c))) {
            return false;
        }

        int lastDigitA = a % 10;
        int lastDigitB = b % 10;;
        int lastDigitC = c % 10;;

        if ((lastDigitA == lastDigitB) || (lastDigitA == lastDigitC) || (lastDigitB == lastDigitC)){
            return true;
        } else
            return false;

    }

}
