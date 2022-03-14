package com.arnav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Hello, World!");
	System.out.print("Enter a random number:");
	Scanner input =new Scanner(System.in);
	int random = input.nextInt();
	System.out.println("Random number: "+random);
	System.out.print("Enter random2: ");
    int r2d2 = input.nextInt();
    int sum=random+r2d2;
        System.out.println("Sum = "+sum);
    }
}
