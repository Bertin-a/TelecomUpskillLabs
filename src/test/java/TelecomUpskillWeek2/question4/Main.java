package org.question4;

public class Main {
    public static void main(String[] args) {
        divide(10, 0);
    }

    static int divide(int num1, int num2) {
        int ans = 0;
        try {
            ans = num1 / num2;
        }
        catch (ArithmeticException e) {
            System.out.println("can not divide by 0");
        }
        return ans;
    }
}

