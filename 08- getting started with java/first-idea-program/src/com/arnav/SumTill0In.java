package com.arnav;

import java.util.Scanner;

public class SumTill0In {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int sum=-1;
        int n=1;
        while(n!=0){
            sum+=n;
            n=in.nextInt();
        }
        System.out.println("Sum = "+sum);
    }
}
