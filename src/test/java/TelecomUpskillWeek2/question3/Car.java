package org.question3;

public class Car extends Vehicle{
    public Car(String make, String model, String year) {
        super(make, model, year);
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public String getYear(){
        return year;
    }

    @Override
    public void accelerate() {
        System.out.println("Vrom vrom");
    }
    public void printDetails(){
        System.out.println("Your car is," + getModel());
        System.out.println("Your car make," + getMake());
        System.out.println("The year your car was made is," + getYear());
    }

}
