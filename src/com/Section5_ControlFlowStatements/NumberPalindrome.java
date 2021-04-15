package com.Section5_ControlFlowStatements;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        if (number < 0) {
            number -= (number + number);
        }

        int reverse = 0;
        int auxNumber = number;

        while (auxNumber > 0 ){

            int lastDigit = auxNumber % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            auxNumber /= 10;

        }

        if (reverse == number) {
            return true;
        } else {
            return false;
        }

    }
}
