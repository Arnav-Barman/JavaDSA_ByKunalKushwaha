package com.arnav;

import java.util.Scanner;

public class ArCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        float rad = in.nextFloat();
        float ar = (float) (rad*(3.14));
        System.out.println("The area of the circle is "+ar);
    }
}
