package org.question3;

public class Bike extends Vehicle{
    public Bike(String make, String model, String year){
        super(make,model,year);
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
        System.out.println("clin clin");
    }
    public void printDetails(){
        System.out.println("Your bike is," + getModel());
        System.out.println("Your bike make," + getMake());
        System.out.println("The year your Bike was made is," + getYear());
    }
}
