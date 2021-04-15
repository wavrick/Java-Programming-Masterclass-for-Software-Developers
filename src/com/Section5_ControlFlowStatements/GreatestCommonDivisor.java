package com.Section5_ControlFlowStatements;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int firstNumber, int secondNumber) {

        if ((firstNumber < 10) || (secondNumber < 10))
            return -1;

        int lagestPositiveInt = 0;
        for (int i = 1; ((i <= firstNumber) || (i <= secondNumber)); i++){
            if ((firstNumber % i == 0) && (secondNumber % i == 0)){
                lagestPositiveInt = i;
            }
        }
        return lagestPositiveInt;
    }
}