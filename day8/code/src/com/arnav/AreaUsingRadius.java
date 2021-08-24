package com.arnav;

import java.util.Scanner;

public class AreaUsingRadius {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        float rad = in.nextFloat();
        area(rad);
        circ(rad);
    }

    static void circ(float rad) {
        float cir = (float) (2*rad*(22.0/7));
        System.out.println("Circumference = "+cir);
    }

    static void area(float rad) {
    float ar = (float) (rad*rad*(22.0/7));
        System.out.println("Area = "+ar);
    }
}
