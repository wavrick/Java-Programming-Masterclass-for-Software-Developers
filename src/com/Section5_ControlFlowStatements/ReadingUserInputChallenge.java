package com.Section5_ControlFlowStatements;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {

        int sum = 0;
        int count = 1;
        Scanner scanner = new Scanner(System.in);
        int numberInput;


        while (count <= 10) {
            System.out.println("Enter number #" + count);
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                numberInput = scanner.nextInt();
                sum += numberInput;
                count++;
            } else {
                System.out.println("Invalid Number Entered:");
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Total Sum = " + sum);

    }
}
