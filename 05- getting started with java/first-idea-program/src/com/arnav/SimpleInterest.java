package com.arnav;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Simple Interest Calculator \n Enter P:");
        float p = in.nextFloat();
        System.out.print("Enter R:");
        float r = in.nextFloat();
        System.out.print("Enter T:");
        float t = in.nextFloat();
        float si= p*r*t/100;
        float tot=si+p;
        System.out.println("The SI on the given principal for the mentioned rate and time would be: "+ si+" & toal amount would be : "+tot);
    }
}
