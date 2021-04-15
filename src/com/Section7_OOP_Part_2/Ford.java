package com.Section7_OOP_Part_2;

public class Ford extends Car{

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford -> Engine Start";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate";
    }

    @Override
    public String brake() {
        return "Ford -> brake";
    }

}
