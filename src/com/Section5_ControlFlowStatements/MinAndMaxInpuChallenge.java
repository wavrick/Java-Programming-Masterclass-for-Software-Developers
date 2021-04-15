package com.Section5_ControlFlowStatements;

import java.util.Scanner;

public class MinAndMaxInpuChallenge {

    public static void main(String[] args){

        int min = 0;
        int max = 0;
        int aux;
        boolean flag = true;

        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.println("Enter a Number:");
            Boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                aux = scanner.nextInt();

                if (flag) {
                    min = aux;
                    max = aux;
                    flag = false;
                }

                if (aux < min)
                    min = aux;
                if (aux > max)
                    max = aux;
            } else {
                System.out.println("Invalid Number!!!");
                break;
            }

            scanner.nextLine();
        }


        System.out.println("Minimum Number: " + min + " Maximum Number: " + max);
        scanner.close();

    }
}
