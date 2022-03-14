package com.arnav;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7,8,9,10);
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));// this way we can store any number of elements while calling fun() in the variable arguments ...v
    }
}
