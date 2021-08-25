package com.arnav;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number :");
        int a = in.nextInt();
        isEven(a);
    }

    static void isEven(int a) {
    if (a%2==0){
        System.out.println(a+" is Even");
    }else{
        System.out.println(a+" is Odd");
    }
    }
}
