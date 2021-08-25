package com.arnav;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp=n;
        int x=0;
        while(temp>0){
            x=(x*10)+(temp%10);
            temp/=10;
        }
        if(x==n){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
