package com.Section8_Arrays_Lists;

import java.util.Scanner;

public class SortedArray {

    public static int[] myArray = new int[5];
    public static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers() {
        System.out.println("Enter 5 integers numbers:\r");
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] newArray = new int[myArray.length];
        int min = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j + 1]) {
                    newArray[i] = array[j];
                }
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        getIntegers();
        printArray(myArray);
        int[] sortedArray = sortIntegers(myArray);
        for (int i = 0; i < sortedArray.length; i++){
            System.out.println(sortedArray[i]);
        }
    }

}
