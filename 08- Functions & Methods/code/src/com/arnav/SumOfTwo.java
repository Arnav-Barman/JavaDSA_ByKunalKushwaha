package com.arnav;

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = in.nextInt(); int b = in.nextInt();
        int ans = sum(a,b);
        System.out.println(a+" + "+b+" = "+ans);
    }

    static int sum(int a, int b) {
    int sum = a + b;
    return sum;
    }
}
