package com.arnav;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>(5);//we can have more elements in the list than mentioned in initialCapacity
        //adding elements
        list.add(68);
        list.add(69);
        list.add(70);
        list.add(71);
        list.add(72);
        list.add(73);

        System.out.println(list.contains(96)); // to check whether 96 is present in the list or not
        list.set(0, 96);//to replace the element of list at 0th index
        list.remove(2);// to remove obj at mentioned index
        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        //get item at a specified index
        System.out.println(list.get(8));

        //output
        System.out.println(list);
    }
}
