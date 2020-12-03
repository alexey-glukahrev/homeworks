package com.train.fundamentals;

import java.util.*;

/*
*  Optional Task 1
*  Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
* */

public class AscendingOrder {
    private static final int ARGUMENTS_COUNT = 5;
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        List<String> argumentsArray = new ArrayList<>();
        for (int i = 0; i < ARGUMENTS_COUNT; i++) {
            System.out.print("Please enter number #" + i + ": ");
            argumentsArray.add(i, in.nextLine());
        }

        List<String> argumentsArrayWithAscendingOrder = new ArrayList<>();
        boolean hasFound;
        for (String each: argumentsArray) {
            hasFound = false;
            char[] charArray = each.toCharArray();
            for (int i = 0; i < charArray.length - 1; i++) {
                if ((int) charArray[i] >= (int) charArray[i + 1]) {
                    hasFound = false;
                    break;
                }
                hasFound = true;
            }
            if (hasFound) {
                argumentsArrayWithAscendingOrder.add(each);
            }
        }

        if (argumentsArrayWithAscendingOrder.size() != 0) {
            System.out.println("Ascending order argument: " + argumentsArrayWithAscendingOrder.get(0));
        } else {
            System.out.println("Ascending order list is empty");
        }

    }
}
