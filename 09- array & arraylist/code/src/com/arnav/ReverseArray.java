package com.arnav;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr= {1,69,71,2,45,63,99};
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr) {
        int s=0,e=arr.length-1;
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            e--;s++;
        }
    }
}
