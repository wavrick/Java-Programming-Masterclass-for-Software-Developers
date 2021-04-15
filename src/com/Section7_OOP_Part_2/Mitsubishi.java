package com.Section7_OOP_Part_2;

public class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> Engine Start";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake";
    }
}
