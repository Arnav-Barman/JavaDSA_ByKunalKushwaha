package com.arnav;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s1 = in.nextInt();
        int s2 = in.nextInt();
        switch (s1){
            case 1-> System.out.println("switch1 case1");
            case 2-> System.out.println("switch1 case2");
            case 3->{
                switch (s2) {
                    case 1 -> System.out.println("switch2 case1");
                    case 2 -> System.out.println("switch2 case2");
                    default -> System.out.println("Enter correct value");
                }
            }
            default -> System.out.println("Enter correct value");
        }
    }
}
