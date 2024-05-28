package org.question5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Area obj = new Area();
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("Enter the breath of rectangle to calculate");
            try {
                double Breath = input.nextDouble();
                obj.setBreath(Breath);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Only accepts numbers");
                input.nextLine();
            }
        }
        while (true) {

            System.out.println("Enter the length of rectangle to calculate");
            try {
                double Length = input.nextDouble();
                obj.setLength(Length);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Only accepts numbers");
                input.nextLine();
            }
        }

        System.out.println("The area is : " + obj.returnArea());
        input.close();

    }
}
