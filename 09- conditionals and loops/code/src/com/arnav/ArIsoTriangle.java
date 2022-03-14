package com.arnav;
import java.util.Scanner;
import java.lang.Math;
public class ArIsoTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of equal sides :");
        float a = in.nextFloat();
        System.out.print("Enter length of unequal side :");
        float b = in.nextFloat();
        float ar= (float)((b/2)*(Math.sqrt((a*a)-((b*b)/4))));
        System.out.println("Area : "+ar);

    }
}
