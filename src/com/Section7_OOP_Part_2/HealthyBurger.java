package com.Section7_OOP_Part_2;

public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meet, double price) {
        super("Healthy Burger", meet, price, "Brown rye roll");
    }

    public void addHealthyAddition1(String healthyExtra1Name, double price) {
        this.healthyExtra1Name = healthyExtra1Name;
        this. healthyExtra1Price = price;
        System.out.println("Added " + healthyExtra1Name + " for an extra " + price);
    }

    public void addHealthyAddition2(String healthyExtra2Name, double price) {
        this.healthyExtra1Name = healthyExtra2Name;
        this. healthyExtra2Price = price;
        System.out.println("Added " + healthyExtra2Name + " for an extra " + price);
    }

    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger() + this. healthyExtra1Price + healthyExtra2Price;
    }
}
