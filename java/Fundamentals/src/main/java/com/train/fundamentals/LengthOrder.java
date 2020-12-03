package com.train.fundamentals;

import java.util.*;

/*
* Optional Task 1
* Вывести числа в порядке возрастания (убывания) значений их длины.
* */

public class LengthOrder {
    private static final int ARGUMENTS_COUNT = 5;
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);
        List<String> argumentsArray = new ArrayList<>();
        for (int i = 0; i < ARGUMENTS_COUNT; i++) {
            System.out.print("Please enter number #" + i + ": ");
            argumentsArray.add(i, in.nextLine());
        }

        argumentsArray.sort(new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return str1.length() - str2.length();
            }
        });
        System.out.println("Ascending order: " + argumentsArray.toString());
        argumentsArray.sort(new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return str2.length() - str1.length();
            }
        });
        System.out.println("Descending order: " + argumentsArray.toString());
    }
}
