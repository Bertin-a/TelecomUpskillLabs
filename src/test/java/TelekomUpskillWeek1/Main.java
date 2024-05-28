package org.example;

public class Main {
    public static void main(String[] args) {
        int bankBalance;
        bankBalance = 500;
        bankBalance += 250;
        bankBalance -= 100;
        System.out.println(bankBalance);

        System.out.println("Value in C: " + calculateCelsius());

        System.out.println("Value in F: " + calculateFahrenheit());

        printNameDetails("Bertina", "Ayuure");

        compareAge();
        switchStatementForAge();
        loopToTen();
        printSquare();
        loopBackwards();

    }

    //Question 1
    static double calculateCelsius() {
        double fahrenheit;
        fahrenheit = 50;
        double celsius;
        celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    //Question 1
    static double calculateFahrenheit() {
        double fahrenheit;
        double celsius = 10;
        fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }

    //Question 2
    static void printNameDetails(String firstName, String lastName) {
        String fullname = firstName + " " + lastName;
        System.out.println("Hello my name is " + fullname);
        int lengthOfFirstName = firstName.length();
        int lengthOfLastName = lastName.length();
        System.out.println("There are " + lengthOfFirstName + " in my first name and " + lengthOfLastName + " in my last name");

    }

    //Question 3 (1)

    static void compareAge() {
        int age = 10;

        if (age < 18) {
            System.out.println("You are a minor");
        } else {
            System.out.println("You are an adult");
        }

    }

    //QUESTION 3 (2)

    static void switchStatementForAge() {
        int age = 10;

        switch (age) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("You are a child.");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                System.out.println("You are a teenager.");
                break;
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                System.out.println("You are an adult.");
                break;
            default:
                if (age >= 60) {
                    System.out.println("You are a senior citizen.");
                } else {
                    System.out.println("Invalid age.");
                }
        }

    }

    //QUESTION 3 (3)
    static void loopToTen() {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }

    //  QUESTION 3 (4)

    static void printSquare() {
        int width = 30;
        int length = 30;
        int i;
        int j;

        for (i = 1; i <= width; i++) {
            System.out.println();
            for (j = 1; j <= length; j++) {
                System.out.print("* ");
            }

        }


    }
    // QUESTION 5 (4)

    static void loopBackwards(){
        System.out.println();
        int val;
        for (val = 10; val > 0; val--){
            System.out.println(val);
        }
    }

}

