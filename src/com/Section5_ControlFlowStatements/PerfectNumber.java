package com.Section5_ControlFlowStatements;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum  == number)
            return true;
        else
            return false;

    }
}
