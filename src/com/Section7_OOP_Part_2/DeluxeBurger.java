package com.Section7_OOP_Part_2;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe Burger", "Beef", 14.54, "White");
        super.addHamburgerAddition1("Chips",2.75);
        super.addHamburgerAddition2("Drink",1.81);
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double price) {
        //super.addHamburgerAddition1(addition1Name, price);
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double price) {
        //super.addHamburgerAddition2(addition2Name, price);
    }

    @Override
    public void addHamburgerAddition3(String addition2Name, double price) {
        //super.addHamburgerAddition3(addition2Name, price);
    }

    @Override
    public void addHamburgerAddition4(String addition2Name, double price) {
        //super.addHamburgerAddition4(addition2Name, price);
    }
}
