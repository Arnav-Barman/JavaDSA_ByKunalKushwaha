package com.arnav;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter a number to check whether it is Even or Odd: ");
        int n= in.nextInt();
        if(n%2==0){
            System.out.println("The number "+n+" is an Even number!");
        }
        else{
            System.out.println("The number "+n+" is an Odd number!");
        }
    }
}
