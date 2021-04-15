package com.Section5_ControlFlowStatements;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){

        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 0;
        }

        int count = 0;
        int lastNumber = 0;
        int firstNumber = 0;

        do {
            count++;
            if (count == 1){
                lastNumber = number % 10;
                continue;
            }
            firstNumber = number % 10;
            number /= 10;

        } while (number > 0);
        return lastNumber + firstNumber;

    }
}
