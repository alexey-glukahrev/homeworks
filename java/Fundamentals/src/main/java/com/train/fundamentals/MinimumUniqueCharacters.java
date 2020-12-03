package com.train.fundamentals;

import java.util.*;

/*
*  Optional Task 1
*  Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.
* */

public class MinimumUniqueCharacters {
    private static final int ARGUMENTS_COUNT = 5;
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        List<String> argumentsArray = new ArrayList<>();
        for (int i = 0; i < ARGUMENTS_COUNT; i++) {
            System.out.print("Please enter number #" + i + ": ");
            argumentsArray.add(i, in.nextLine());
        }

        List<String> argumentsArrayWithoutRepeats = new ArrayList<>();
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < argumentsArray.size(); i++) {
            charSet.clear();
            for (char c : argumentsArray.get(i).toCharArray()) {
                charSet.add(c);
            }
            StringBuilder sb = new StringBuilder();
            for (Character character : charSet) {
                sb.append(character);
            }
            argumentsArrayWithoutRepeats.add(i, sb.toString());
        }

        int minLength = argumentsArrayWithoutRepeats.get(0).length();
        int indexOfMinLength = 0;
        for (String each : argumentsArrayWithoutRepeats) {
            if (each.length() < minLength) {
                minLength = each.length();
                indexOfMinLength = argumentsArrayWithoutRepeats.indexOf(each);
            }
        }

        System.out.println("The number with minimum of unique characters: "
                + argumentsArray.get(indexOfMinLength));
    }
}
