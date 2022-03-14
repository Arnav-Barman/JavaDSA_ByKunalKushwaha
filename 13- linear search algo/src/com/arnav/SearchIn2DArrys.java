package com.arnav;

import java.util.Arrays;

public class SearchIn2DArrys {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{9,18,5},{6,7,14}};
        int target=18;
        System.out.println(Arrays.toString(LinSearchin2D(arr,target)));
        System.out.println(max(arr));

    }
    static int[] LinSearchin2D(int[][] arr,int target){
        for (int row = 0; row <arr.length ; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if(arr[row][column]==target){
                return new int[]{row, column};
                }
            }
        }
        return null;
    }
    static int max(int[][] arr){
        int max=arr[0][0];
        for (int row = 0; row <arr.length ; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if(arr[row][column]>max){
                    max=arr[row][column];
                }
            }
        }
        return max;
    }
}
