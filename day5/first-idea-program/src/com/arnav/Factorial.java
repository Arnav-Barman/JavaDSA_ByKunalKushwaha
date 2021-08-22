package com.arnav;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter a number to find its factorial : ");
        int n = in.nextInt();
        int fac=1;
        for (int i = 1; i <=n ; i++) {
            fac*=i;
        }
        System.out.println("The factorial of "+n+" is : "+fac);
    }
}
