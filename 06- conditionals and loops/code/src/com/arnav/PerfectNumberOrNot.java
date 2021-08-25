package com.arnav;

import java.util.Scanner;

public class PerfectNumberOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=0, i=1;
        while(i<n){
            if(n%i==0){
                sum+=i;
            }
            i++;
        }
        if(sum==n){
            System.out.println("Perfect");
        }else{
            System.out.println("Not Perfect");
        }
    }
}
