package com.EpamTest;

import java.util.Scanner;

public class Converter {
    // 1st commit
    public static String convertBinaryToDecimal(String num) {
        int r = 0;
        for (int i = 0, j = num.length() - 1; j >= 0; i++, j--) {
            int b = num.charAt(j) - '0';
            int p = 1;
            for (int k = 0; k < i; k++) {
                p *= 2;
            }
            r += p * b;
        }
        num = "";
        while (r > 0) {
            num += r % 10;
            r /= 10;
        }
        return reverseString(num);
    }

    public static String convertDecimalToBinary(String num) {
        int r = 0;
        for (int i = 0; i < num.length(); i++) {
            int j = num.length() - 1 - i;
            int b = num.charAt(j) - '0';
            int p = 1;
            for (int k = 0; k < i; k++) {
                p *= 10;
            }
            r += p * b;
        }
        num = "";
        while (r > 0) {
            num += r % 2;
            r /= 2;
        }
        return reverseString(num);
    }

    public static String reverseString(String str) {
        String result = "";
        // Store result in reverse order into the

        for (int i = str.length()-1; i >-1; i--)
            result += str.charAt(i);

       return result;
    }

    public static void convertNumber(int sourceBase, int targetBase, String number) {
        switch (sourceBase) {
            case 2:
                switch (targetBase) {
                    case 10:
                        // 1st commit
                        System.out.println("Output: " + convertBinaryToDecimal(number));
                        break;
                    case 2:
                        System.err.println("Invalid target base!");
                        break;
                    default:
                        System.err.println("Unsupported base!");
                }
                break;
            case 10:
                switch (targetBase) {
                    case 2:
                        System.out.println("Output: " + convertDecimalToBinary(number));
                        break;
                    case 10:
                        System.err.println("Invalid target base!");
                        break;
                    default:
                        System.err.println("Unsupported base!");
                }
                break;
            default:
                System.err.println("Unsupported base!");
        }
    }


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

        convertNumber(n1, n2, tmp);
    }

}
