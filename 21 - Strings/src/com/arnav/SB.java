package com.arnav;

public class SB {
    public static void main(String[] args){
        StringBuilder abc = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            abc.append(ch);
        }
        System.out.println(abc.toString());
    }
}