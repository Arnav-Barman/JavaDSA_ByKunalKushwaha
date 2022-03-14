package com.arnav;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
        System.out.print("for Day: ");
        int day = in.nextInt();
        switch (day){
            case 1,2,3,4,5-> System.out.println("Weekday");
            case 6,7->{
                System.out.println("Weekend");
                System.out.println("YAY !");
            }
        } //if the code is taking more than one line, add it in curly braces
        System.out.print("For Month:");
        int month = in.nextInt();
        switch (month){
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("Enter valid number");

        }
        }


    }


