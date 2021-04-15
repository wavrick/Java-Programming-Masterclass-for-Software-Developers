package com.Section5_ControlFlowStatements;

public class NumberToWords {

    public static void main (String[] args) {
        numberToWords(201);
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
           return -1;
        }

        int sum = 0;

        do {
            sum ++;
            number /= 10;

        } while (number > 0);
        return sum;

    }

    public static int reverse(int number) {

        boolean isNegative = false;

        if (number < 0) {
            isNegative = true;
            number -= number + number;
        }

        int returnNumber = 0;
        int lastDigit;

        while (number > 0) {
            lastDigit = number % 10;
            number /= 10;
            returnNumber = (returnNumber * 10) + lastDigit;
        }
        if (isNegative)
            return -returnNumber;
        else
            return returnNumber;
    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            number = reverse(number);
            int numberOfDigits = getDigitCount(number);

            for (int i = 0; i < numberOfDigits; i++) {
                int lastDigit = number % 10;
                number /= 10;

                switch (lastDigit){
                    case 0:
                        System.out.print("Zero ");
                        break;
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    case 9:
                        System.out.print("Nine ");
                        break;
                    default:
                        break;
                }

            }

        }

    }
}
