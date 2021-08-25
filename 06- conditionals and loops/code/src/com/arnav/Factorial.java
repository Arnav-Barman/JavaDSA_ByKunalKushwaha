package com.arnav;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number whose factorial is to be calculated: ");
        int n = in.nextInt();
        int prod=1;
        for (int i = 1; i <= n; i++) {
            prod*=i;
        }
        System.out.println("The factorial of "+n+" would be "+prod);
    }
}
