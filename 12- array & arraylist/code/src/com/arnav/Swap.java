package com.arnav;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i, int i1) {
//        using a temp variable
//        int temp=arr[i];
//        arr[i]=arr[i1];
//        arr[i1]=temp;

//        without using temp
        arr[i]=arr[i]+arr[i1];
        arr[i1]=arr[i]-arr[i1];
        arr[i]=arr[i]-arr[i1];
    }
}
