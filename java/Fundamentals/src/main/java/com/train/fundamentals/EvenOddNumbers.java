package com.train.fundamentals;

import java.util.*;

/*
*  Optional Task 1
*  Найти количество чисел, содержащих только четные цифры,
*  а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.
* */

public class EvenOddNumbers {
    private static final int ARGUMENTS_COUNT = 5;
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        List<String> argumentsArray = new ArrayList<>();
        for (int i = 0; i < ARGUMENTS_COUNT; i++) {
            System.out.print("Please enter number #" + i + ": ");
            argumentsArray.add(i, in.nextLine());
        }

        List<String> argumentsArrayEvenOnly = new ArrayList<>();
        boolean hasFound;
        for (String each: argumentsArray) {
            hasFound = false;
            for (char character: each.toCharArray()) {
                if (!isEvenNumber((int)character)) {
                    hasFound = false;
                    break;
                }
                hasFound = true;
            }
            if (hasFound) {
                argumentsArrayEvenOnly.add(each);
            }
        }

        int oddCount;
        int evenCount;
        List<String> argumentsArrayWithEqualsOddAndEven = new ArrayList<>();
        List<String> argumentsArrayOddOnly = new ArrayList<>();
        for (String each: argumentsArray) {
            if (!argumentsArrayEvenOnly.contains(each)) {
                argumentsArrayOddOnly.add(each);
            }
        }
        for (String each: argumentsArrayOddOnly) {
            oddCount = evenCount = 0;
            for (char character: each.toCharArray()) {
                if(isEvenNumber(character)) {
                    evenCount += 1;
                } else {
                    oddCount += 1;
                }
            }
            if (evenCount == oddCount) {
                argumentsArrayWithEqualsOddAndEven.add(each);
            }
        }

        System.out.println("Arguments with even numbers only: " + argumentsArrayEvenOnly.toString());
        System.out.println("Arguments with equal count of odd and even numbers: "
                + argumentsArrayWithEqualsOddAndEven.toString());
    }

    public static boolean isEvenNumber(int arg) {
        return arg % 2 == 0;
    }
}
