package org.question3;

public class Main {
    public static void main(String[] args) {
        Car obj1 = new Car("Toyota", "m1", "2021");
        obj1.printDetails();
        obj1.accelerate();

        Bike obj2 = new Bike("Yamaha","m2", "2022");
        obj2.printDetails();
        obj2.accelerate();
    }

}
