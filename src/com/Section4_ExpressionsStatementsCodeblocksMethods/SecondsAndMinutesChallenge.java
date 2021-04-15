package com.Section4_ExpressionsStatementsCodeblocksMethods;

public class SecondsAndMinutesChallenge {

    public static String getDurationString(long minutes, long seconds) {

        if ((minutes) < 0 || ((seconds < 0) || (seconds > 59))) {
            return "Invalid Value";
        } else {

            long hours = minutes / 60;
            long restOfMinutes = minutes - (hours * 60); // restOfMinutes = minutes % 60
            return (hours + "h " + restOfMinutes + "m " + seconds + "s");
        }
    }
        public static String getDurationString(long seconds) {

        if (seconds < 0) {
            return "Invalid Value";
        } else {

            long minutes = seconds / 60;
            long restOfSeconds = seconds - (minutes * 60); // restOfSeconds = seconds % 60
            return getDurationString(minutes,restOfSeconds);
        }
    }

}
