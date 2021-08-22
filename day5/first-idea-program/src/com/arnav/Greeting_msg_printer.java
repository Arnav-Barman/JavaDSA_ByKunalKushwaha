package com.arnav;

import java.util.Scanner;

public class Greeting_msg_printer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = in.next();
        System.out.println("Hello "+name+", Welcome to the DSA course!");
    }
}
