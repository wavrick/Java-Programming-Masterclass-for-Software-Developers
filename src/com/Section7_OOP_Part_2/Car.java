package com.Section7_OOP_Part_2;

public class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(int cylinders, String name) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String startEngine() {
        return "Car -> Engine Start";
    }

    public String accelerate() {
        return "Car -> accelerate";
    }

    public String brake() {
        return "Car -> break";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}
