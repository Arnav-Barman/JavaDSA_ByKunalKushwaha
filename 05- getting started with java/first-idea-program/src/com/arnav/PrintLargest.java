package com.arnav;

import java.util.Scanner;

public class PrintLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = in.nextInt();
        System.out.print("Enter Second number: ");
        int n2 = in.nextInt();
        if(n1>n2){
            System.out.println(n1+" is the Largest");
        }
        else{
            System.out.println(n2+" is the Largest");
        }

    }
}
