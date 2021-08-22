package com.arnav;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the number of terms of the sequence to be printed :");
        int n = in.nextInt();
        int a=0,b=1;
        System.out.println();
        if(n==1){
            System.out.print("0");
        }
        else{
            System.out.print("0 1");
        for (int i = 0; i < n-2; i++) {
            int temp =b;
            b=a+b;
            a=temp;
            System.out.print(" "+b);
        }
        }
    }
}
