package com.train.fundamentals;

import java.util.*;
import java.util.stream.Collectors;

/*
*  Optional Task 1
*  Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
* */

public class UniqueNumbers {
    private static final int ARGUMENTS_COUNT = 5;
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        List<String> argumentsArray = new ArrayList<>();
        for (int i = 0; i < ARGUMENTS_COUNT; i++) {
            System.out.print("Please enter number #" + i + ": ");
            argumentsArray.add(i, in.nextLine());
        }

        List<String> argumentsArrayUniqueOnly = new ArrayList<>();
        Set<Character> characterSet;
        for (String each: argumentsArray) {
            characterSet = each.chars().mapToObj(e->(char)e).collect(Collectors.toSet());
            StringBuilder sb = new StringBuilder();
            for (Character character: characterSet) {
                sb.append(character);
            }
            if (sb.toString().equals(each)) {
                argumentsArrayUniqueOnly.add(each);
            }
        }

        if (argumentsArrayUniqueOnly.size() == 0) {
            System.out.println("There is not arguments that contains unique numbers only");
        } else {
            System.out.println("Arguments that contains unique numbers only: " + argumentsArrayUniqueOnly.toString());
        }

    }
}
