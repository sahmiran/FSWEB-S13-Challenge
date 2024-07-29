package org.example.enums;

public enum Plan {
    BASIC("basicPlan1",19.99);

    private String name;
    private double price;

    Plan(String  name, double price){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
