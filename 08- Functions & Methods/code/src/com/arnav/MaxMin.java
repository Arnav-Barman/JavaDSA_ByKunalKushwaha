package com.arnav;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 3 numbers :");
        int a,b,c;
        a= in.nextInt();
        b= in.nextInt();
        c= in.nextInt();
        System.out.print("Max : ");
        max(a,b,c);
        System.out.print("Min : ");
        min(a,b,c);
    }
    static void max(int a, int b, int c){
        if(a>b && a>c){
            System.out.println(a);
        }else if (b>a && b>c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
    static void min(int a, int b, int c){
        if(a<b && a<c){
            System.out.println(a);
        }else if (b<a && b<c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}
