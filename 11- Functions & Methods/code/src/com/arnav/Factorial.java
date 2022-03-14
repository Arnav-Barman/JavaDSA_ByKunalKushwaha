package com.arnav;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int fac = in.nextInt();
        factorial(fac);
    }
    static void factorial(int fac) {
        int facto = 1;
        for (int i = 1; i <= fac; i++) {
            facto*=i;
        }
        System.out.println("Factorial of "+fac+" = "+facto);
    }
}
