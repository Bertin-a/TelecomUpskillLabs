package org.question1;

public class Main {
    public static void main(String[] args) {
        Circle obj = new Circle(4);
        System.out.println("Area of the circle is: " + obj.calculateArea());
        System.out.println("Perimeter of the circle is: " + obj.calculatePerimeter());

        Rectangle obj1 = new Rectangle(2, 5);
        System.out.println("Area of Rectangle is: " + obj1.calculateArea());
        System.out.println("Perimeter of Rectangle is: " + obj1.calculatePerimeter());


    }
}