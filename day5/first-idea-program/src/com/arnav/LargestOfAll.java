package com.arnav;

import java.util.Scanner;

public class LargestOfAll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers:");
        int temp=0;
        int n=1;
        while(n!=0){
            if(temp<n){
                temp=n;
            }
            n=in.nextInt();
        }
        System.out.println("Largest number entered "+temp);
    }
}
