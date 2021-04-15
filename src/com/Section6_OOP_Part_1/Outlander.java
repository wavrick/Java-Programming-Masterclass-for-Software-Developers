package com.Section6_OOP_Part_1;

/**
 * Created by dev on 8/3/15.
 */
public class Outlander extends Cars {
    private int roadServiceMonths;

    public Outlander(int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
}
