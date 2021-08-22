package com.arnav;

import java.util.Scanner;

public class AvgOfNInputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n:");
        int n= in.nextInt();
        int x;
        float sum=0;
        for (int i = 0; i < n; i++) {
            x=in.nextInt();
            sum+=x;
        }
        sum = sum/n;
        System.out.println("Average = "+sum);
    }
}
