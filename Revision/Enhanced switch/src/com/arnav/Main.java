package com.arnav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter choice number (b/w 1 to 5): ");
        int choice = in.nextInt();
        //older syntax for switch case
        switch(choice){
            case 1:
                System.out.println("Choice 1");
                break;
            case 2:
                System.out.println("Choice 2");
                break;
            case 3:
                System.out.println("Choice 3");
                break;
            case 4:
                System.out.println("Choice 4");
                break;
            case 5:
                System.out.println("Choice 5");
                break;
            default:
                System.out.println("Arrey oo, padh le upar kya likha tha...");
        }
        System.out.print("Chalo ek aur choice di: ");
        int choice2 = in.nextInt();
        //latest switch case syntax
        switch (choice2) {
            case 1 -> {System.out.println("Choice 1");
            System.out.println("Ab theek");}
            case 2 -> System.out.println("Choice 2");
            case 3 -> System.out.println("Choice 3");
            case 4 -> System.out.println("Choice 4");
            case 5 -> System.out.println("Choice 5");
            default -> System.out.println("Arrey oo, padh le upar kya likha tha...");
        }
    }
}
