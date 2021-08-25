package com.arnav;

import java.util.Scanner;

public class ProdOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = in.nextInt(); int b = in.nextInt();
        int ans = prod(a,b);
        System.out.println(a+" * "+b+" = "+ans);
    }

    static int prod(int a, int b) {
        int prod = a * b;
        return prod;
    }
}
