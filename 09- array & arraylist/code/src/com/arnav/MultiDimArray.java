package com.arnav;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //2d array
        int [][] arr = {
                {0,1,2}, //0th index
                {3,4}, //1st index
                {5,6,7,8,9} //2nd index
        };
                //= new int [2][]; // defining the number of rows is mandatory
        //input
        int[][] ar = new int[3][1];
        for (int i = 0; i < ar.length; i++) { //i  is for rows
            for (int j = 0; j < ar[i].length ;j++) { //j  is for columns
                ar[i][j] = in.nextInt();
            }
        }


        System.out.println(Arrays.toString(arr[0]));
        for (int i = 0; i < ar.length; i++) {
            System.out.println(Arrays.toString(ar[i]));
        }
        /*      enhanced for loop
        for(int[] i : ar){
        System.out.println(Arrays.toString(ar[i]));
        }
        */
    }
}
