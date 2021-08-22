package com.arnav;

import java.util.Scanner;
import java.lang.Math;

public class PowerJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = (int) Math.pow(n1,n2);
        System.out.println(n3);
    }
}
