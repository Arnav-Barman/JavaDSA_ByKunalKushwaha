package com.arnav;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][2];
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = in.nextInt();
            }
        }
        for (int[] x : arr) {
            System.out.println(Arrays.toString(x));
        }
    }
}