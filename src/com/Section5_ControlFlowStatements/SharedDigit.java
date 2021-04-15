package com.Section5_ControlFlowStatements;

public class SharedDigit {

    public static void main (String[] args) {
        System.out.println(hasSharedDigit(19,99));
    }

    public static boolean hasSharedDigit(int a, int b) {

        if ((a < 10) || ( a > 99) || (b < 10) || (b > 99))
            return false;

        int leastDigitA, leastDigitB;
        int OriginalBValue = b;
        while (a > 0) {
            leastDigitA = a % 10;
            a /= 10;
            while (b > 0) {
                leastDigitB = b % 10;
                b /= 10;
                if (leastDigitA == leastDigitB) {
                    return true;
                }
            }
            b = OriginalBValue;
        }
        return false;
    }

}
