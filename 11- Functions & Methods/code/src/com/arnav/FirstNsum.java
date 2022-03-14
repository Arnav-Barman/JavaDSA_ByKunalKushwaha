package com.arnav;

import java.util.Scanner;

public class FirstNsum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of terms:");
        int n = in.nextInt();
        sum(n);
    }

    static void sum(int n) {
    int sum= (n*(n+1))/2;
        System.out.println("Sum = "+sum);
    }
}
