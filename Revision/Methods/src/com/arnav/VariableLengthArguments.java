package com.arnav;

import java.util.Arrays;

public class VariableLengthArguments {
    public static void main(String[] args){
    fun(1,2,3,4,5,6,6,77);
    fun(6,5,"second fun method","concept used here","is function overloading");
    }
    static void fun(int ...v){ //variable length args, can be >= 0
        System.out.println(Arrays.toString(v));
    }
    static void fun(int a, int b, String ...v){ // ...v must always be at the end
        System.out.println(a+" "+b+" "+ Arrays.toString(v));
    }
}
