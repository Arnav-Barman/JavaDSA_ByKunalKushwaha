package com.arnav;

import java.util.Scanner;

public class ArRectangle {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the Rectangle:");
    float l = in.nextFloat();
        System.out.print("Enter the breadth of the Rectangle: ");
    float b = in.nextFloat();
    float ar= l*b;
        System.out.print("The area of rectangle is "+ar);
    }
}
