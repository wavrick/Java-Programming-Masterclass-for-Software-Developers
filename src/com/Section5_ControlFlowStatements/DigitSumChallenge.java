package com.Section5_ControlFlowStatements;

public class DigitSumChallenge {


    public static void main (String args[]){

        System.out.println("125 sum = " + sumDigit(125));
    }

    public static int sumDigit(int number){

        if (number < 10){
            return -1;
        }

        int count = 0;
        int leastNumber;

        while (number > 0) {

            leastNumber = number % 10;
            count += leastNumber;
            number /= 10;

        }
        return count;
    }
}
