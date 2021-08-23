package com.arnav;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Addition();
    }

    static void Addition(){
        Scanner in = new Scanner(System.in);
        System.out.print("Num 1 = ");
        int n1= in.nextInt();
        System.out.print("Num 2 = ");
        int n2= in.nextInt();
        int sum= n1+n2;
        System.out.print("Sum = "+sum);
    }

}
