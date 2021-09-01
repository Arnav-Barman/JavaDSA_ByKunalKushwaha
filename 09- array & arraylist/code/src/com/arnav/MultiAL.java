package com.arnav;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        //adding elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt()); // adding elements in the ArrayList present at index i
            }
        }

        //output
        System.out.println(list);
    }
}
