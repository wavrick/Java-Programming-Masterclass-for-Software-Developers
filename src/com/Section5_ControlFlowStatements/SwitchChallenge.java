package com.Section5_ControlFlowStatements;

import java.util.Locale;

public class SwitchChallenge {

    public static void main (String[] args) {
        char charValue;
        charValue = 'e';

        switch(charValue) {
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C':
                System.out.println("Value was C");
                break;
            case 'D':
                System.out.println("Value was D");
                break;
            case 'E':
                System.out.println("Value was E");
                break;
            default:
                System.out.println("Any other value");
                break;
        }

        String StringValue;
        StringValue = "January";

        switch(StringValue.toLowerCase()) {
            case "january":
                System.out.println("Value was January");
                break;
            default:
                System.out.println("Any other value");
                break;
        }
    }
}
