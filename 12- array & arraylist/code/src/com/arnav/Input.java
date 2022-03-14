package com.arnav;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //array of primitives
        int[] arr = new int[5];
        arr[0]=00;
        arr[1]=01;
        arr[2]=02;
        arr[3]=03;
        arr[4]=04;
        System.out.println(arr[2]);
        int[] ar = new int[5];

        for (int i = 0; i < ar.length; i++) {
            ar[i]= in.nextInt();
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
        System.out.println(" ");
//        int[] a = new a[5];
//        for(int x : a){//for every element in array, print the element
//            System.out.println(num+" "); //num represents element of the array
//        }

        //array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));
        //modification
        str[1]="one";
        System.out.println(Arrays.toString(str));
    }
}
