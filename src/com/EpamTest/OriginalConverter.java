package com.EpamTest;
import java.util.Scanner;

/**
 * Binary-Decimal number converter.
 * Converts numbers between binary and decimal notation.
 */
class OriginalConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Source base: ");
        String tmp = scanner.nextLine();
        int n1 = Integer.parseInt(tmp);
        System.out.println("Target base: ");
        tmp = scanner.nextLine();
        int n2 = Integer.parseInt(tmp);
        System.out.println("Number to convert: ");
        tmp = scanner.nextLine();
        switch (n1) {
            case 2:
                switch (n2) {
                    case 10:
                        int r = 0;
                        for (int i = 0, j = tmp.length() - 1; j >= 0; i++, j--) {
                            int b = tmp.charAt(j) - '0';
                            int p = 1;
                            for (int k = 0; k < i; k++) {
                                p *= 2;
                            }
                            r += p * b;
                        }
                        tmp = "";
                        while (r > 0) {
                            tmp += r % 10;
                            r /= 10;
                        }
                        System.out.println("Output: " + tmp);
                        break;
                    case 2:
                        System.err.println("Invalid target base!");
                        break;
                    default: System.err.println("Unsupported base!");
                }
                break;
            case 10:
                switch (n2) {
                    case 2:
                        int r = 0;
                        for (int i = 0; i < tmp.length(); i++) {
                            int j = tmp.length() - 1 - i;
                            int b = tmp.charAt(j) - '0';
                            int p = 1;
                            for (int k = 0; k < i; k++) {
                                p *= 10;
                            }
                            r += p * b;
                        }
                        tmp = "";
                        while (r > 0) {
                            tmp += r % 2;
                            r /= 2;
                        }
                        break;
                    case 10:
                        System.err.println("Invalid target base!");
                        break;
                    default: System.err.println("Unsupported base!");
                }
                System.out.println("Output: " + tmp);
                break;
            default: System.err.println("Unsupported base!");
        }
    }

}