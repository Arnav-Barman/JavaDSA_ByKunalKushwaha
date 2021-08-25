package com.arnav;

import java.util.Scanner;

public class RupeeTo$ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter currency in ₹:");
        float Rupee = in.nextFloat();
        float $ = (float) (Rupee/(74.3));
        System.out.println("₹"+Rupee+" = "+$+"$");
    }
}
