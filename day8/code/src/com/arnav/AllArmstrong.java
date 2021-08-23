package com.arnav;


public class AllArmstrong {
    public static void main(String[] args) {

        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)){
            System.out.print(i+" ");
            }

        }


    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum=0;
        while(n>0){
            int rem = n%10;
            n/=10;
            sum+=rem*rem*rem;
        }

        return sum==original;
    }
}
