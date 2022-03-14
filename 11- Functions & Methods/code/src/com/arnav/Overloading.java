package com.arnav;

public class Overloading {
    public static void main(String[] args) {
        fun(8);
        fun("#60DaysOfDSA");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String great){
        System.out.println(great);
    }
}
