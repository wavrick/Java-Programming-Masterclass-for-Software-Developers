package com.Section5_ControlFlowStatements;

public class SumOddRange {

    public static boolean isOdd(int number){

        if ((number < 0) || (number % 2 == 0)) {
            return false;
        } else {
            return true;
        }

    }

    public static int sumOdd(int start, int end) {

        if ((start < 0) || (end < 0) || (end < start)){
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++){
            if (isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }

    public static class SimpleCalculator{

    /*  public static void main (String[] args) {


            System.out.println(getEvenDigitSum(2146));
        }
    */


        public static int getEvenDigitSum(int number) {

            if (number < 0)
                return -1;

            int sum = 0;
            int digit;

            while (number > 0){
                digit = number % 10;
                if (digit % 2 == 0)
                    sum += digit;
                number /= 10;
            }

            return sum;

        }

    }
}