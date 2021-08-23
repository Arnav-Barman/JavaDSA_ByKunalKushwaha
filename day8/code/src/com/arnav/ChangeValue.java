package com.arnav;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {0,2,3,4,5};
        change (arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
    nums[0]=1; //if you make any change to the object via this ref var, then the same obj will change
    }
}
