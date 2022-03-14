package com.arnav;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,69,71,2,45,63,99,24};
        max(arr);
    }

    static void max(int[] arr) {
        if(arr.length==0){
            System.out.println(-1);
        }
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>temp){
                temp = arr[i];
            }
        }
        System.out.println("Max number in the array is "+temp);
    }
}
