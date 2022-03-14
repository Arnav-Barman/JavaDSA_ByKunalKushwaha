package com.arnav;

import java.util.Scanner;

public class PythaTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 3 numbers :");
        int a = in.nextInt();int b = in.nextInt();int c = in.nextInt();
        isTriplet(a,b,c);
    }

    static void isTriplet(int a, int b, int c) {
        if((((a*a) + (b*b)) == (c*c)) ||((a*a) == ((b*b) + (c*c))) ||(((a*a) + (c*c)) == (b*b))){
            System.out.println("The entered triplet is pythagorean");
        }else{
            System.out.println("The entered triplet is not pythagorean");
        }
    }
}
