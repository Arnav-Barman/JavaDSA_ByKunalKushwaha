package com.arnav;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number :");
        int pal = in.nextInt();
        palin(pal);
    }

    static void palin(int pal) {
        int temp=pal;
        int rev=0;
        while (temp>0) {
            rev=(rev*10)+(temp%10);
            temp/=10;
        }
        if (pal == rev){
            System.out.println(pal+" is a palindrome number");
        }else{
            System.out.println(pal+" is not a palindrome number");
        }
    }
}
