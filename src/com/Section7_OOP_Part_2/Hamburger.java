package com.Section7_OOP_Part_2;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;


    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.println(name + " hamburger on a " + breadRollType + " roll with " + meat + " , price is " + price);
    }

    public void addHamburgerAddition1(String addition1Name, double price) {
        this.addition1Name = addition1Name;
        this.addition1Price = price;
        System.out.println("Added " + addition1Name + " for an extra " + price);
    }

    public void addHamburgerAddition2(String addition2Name, double price) {
        this.addition2Name = addition2Name;
        this.addition2Price = price;
        System.out.println("Added " + addition1Name + " for an extra " + price);
    }

    public void addHamburgerAddition3(String addition2Name, double price) {
        this.addition3Name = addition2Name;
        this.addition3Price = price;
        System.out.println("Added " + addition1Name + " for an extra " + price);
    }

    public void addHamburgerAddition4(String addition2Name, double price) {
        this.addition4Name = addition2Name;
        this.addition4Price = price;
        System.out.println("Added " + addition1Name + " for an extra " + price);
    }

    public double itemizeHamburger() {
        return this.price + this.addition1Price +
                this.addition2Price + this.addition3Price + this.addition4Price;
    }
}
