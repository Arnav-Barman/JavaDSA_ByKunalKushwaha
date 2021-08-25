package com.arnav;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temp in cel :");
        float cel =input.nextFloat();
        float dec = (cel * 9/5)+32;
        System.out.println(dec);

    }
}
