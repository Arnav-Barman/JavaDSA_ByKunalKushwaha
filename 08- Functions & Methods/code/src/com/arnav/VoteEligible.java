package com.arnav;

import javax.security.sasl.SaslServer;
import java.util.Scanner;

public class VoteEligible {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter age:");
        int age = in.nextInt();
        isEligible(age);
    }
    static void isEligible(int age) {
    if(age>=18){
        System.out.println("Eligible to vote!");
    }else{
        System.out.println("Not eligible to vote!");
    }

    }
}
