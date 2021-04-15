package com.Section4_ExpressionsStatementsCodeblocksMethods;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int megabyte = 1024;
            int wholeNumber = kiloBytes / megabyte;
            int rest = kiloBytes % megabyte;

            System.out.println(kiloBytes + " KB = " + wholeNumber + " MB and " +
                    rest + " KB");
        }

    }

}