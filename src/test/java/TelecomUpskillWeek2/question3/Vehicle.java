package org.question3;

public abstract class Vehicle {

    protected String make;
    protected String model;
    protected String year;

    public Vehicle(String make, String model, String year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }


    public abstract void accelerate();

}
