package com.arnav;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Naam bata:");
        String naam = in.next();
    String greet = myGreet(naam);
    String greet1 = myGreet("bhai");
    System.out.println(greet + ",   " + greet1);
    }
    static String myGreet(String name) {
        return("Hello " + name);
    }
}
