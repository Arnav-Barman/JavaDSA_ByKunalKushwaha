package com.arnav;

public class MaxInRange {
    public static void main(String[] args) {
        int[] arr= {1,69,71,2,45,63,99,24};
        System.out.println(maxInRange(arr, 2, 5));
    }

    static int maxInRange(int[] arr, int start, int end) {
        if (arr == null) {
            return -1;
        }
        if (end<start){
            return -1;
        }
        int max=arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
