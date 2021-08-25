package com.arnav;

import java.util.Scanner;

public class ArTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the base of triangle :");
        float l = in.nextFloat();
        System.out.print("Enter the height of the triangle : ");
        float h = in.nextFloat();
        float ar= (float)((l*h)/2);
        System.out.print("The area of triangle : "+ar);
    }
}
