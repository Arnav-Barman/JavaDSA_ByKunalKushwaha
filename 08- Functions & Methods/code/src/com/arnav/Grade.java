package com.arnav;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter marks obtained :");
        int marks = in.nextInt();
        grades(marks);
    }

    static void grades(int marks) {
    if(91<=marks && marks<=100){
        System.out.println("AA");
    }else if(81<=marks && marks<=90){
        System.out.println("AB");
    }else if(71<=marks && marks<=80){
        System.out.println("BB");
    }else if(61<=marks && marks<=70){
        System.out.println("BC");
    }else if(51<=marks && marks<=60){
        System.out.println("CD");
    }else if(41<=marks && marks<=50){
        System.out.println("DD");
    }else{
        System.out.println("Fail");
    }
    }
}
