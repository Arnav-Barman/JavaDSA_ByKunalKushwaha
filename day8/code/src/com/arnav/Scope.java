package com.arnav;

public class Scope {
    public static void main(String[] args) {
    int a=1,b=2;
        {
            //int a =0; this is wrong as the var a has already eben declared outside the block
            a=0;
            int c=1;
            //the vars declared outside the block can only be modified/initialised and not declared again in the block, while the vars that are declared within the block can only be accessed inside the block
            System.out.println(a+" "+b+" "+c);
        }
        System.out.println(a+" "+b+" "/*+c*/); // c can not be accessed here as it was declared within the block

    }
}
