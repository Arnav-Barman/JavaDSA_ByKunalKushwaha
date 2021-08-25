package com.arnav;

public class Shadowing {
    static int x=20; //x will be available to everything inside the Shadowing block{} , it has been made static so that it can be used with other blocks of code as well
    public static void main(String[] args) {
        System.out.println(x); // prints 20
        int x = 10;
        /*
        if we would have done this
        int x;
        System.out.println(x); //this would have given us an error as the initialisation was not done.. scope begins after initialisation
        x=10;
         */
        System.out.println(x); //prints 10
        //shadowing means that if we declare a var which has the same name as that of the higher one... the lower var overlaps the higher one in the respective code block and the higher level one is shadowed
        again();
    }

    static void again() {
        System.out.println(x); // prints 20
    }
}
