package com.train.fundamentals;

import java.util.*;

/*
* Optional Task 1
* Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
* */

public class LongestAndShortest {
    private static final int ARGUMENTS_COUNT = 5;
    public static void main( String[] args )
    {
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
        String longest = argumentsArray.get(0);
        System.out.println("Longest number: " + longest + "; length: " + longest.length());
        String shortest = argumentsArray.get(argumentsArray.size() - 1);
        System.out.println("Shortest number: " + shortest + "; length: " + shortest.length());


    }
}
