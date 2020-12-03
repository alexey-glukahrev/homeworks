package com.train.fundamentals;

import java.util.*;

/*
* Optional Task 1
* Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
 * */

public class LessThanAverage {
    private static final int ARGUMENTS_COUNT = 5;
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        List<String> argumentsArray = new ArrayList<>();
        for (int i = 0; i < ARGUMENTS_COUNT; i++) {
            System.out.print("Please enter number #" + i + ": ");
            argumentsArray.add(i, in.nextLine());
        }

        int sum = 0;
        for (String each: argumentsArray) {
            sum += each.length();
        }
        int average = sum / argumentsArray.size();

        StringBuilder sbLess = new StringBuilder("List of numbers that have length less than average: ");
        StringBuilder sbMore = new StringBuilder("List of numbers that have length more than average: ");
        for (String each: argumentsArray) {
            if (each.length() < average) {
                sbLess.append(each).append(" (length: ").append(each.length()).append("); ");
            } else if (each.length() > average) {
                sbMore.append(each).append(" (length: ").append(each.length()).append("); ");
            }
        }
        String lessStringToPrint = sbLess.toString();
        if (lessStringToPrint.endsWith("; ")) {
            sbLess.deleteCharAt(sbLess.lastIndexOf("; "));
            lessStringToPrint = sbLess.toString();
        }
        System.out.println(lessStringToPrint);

        String moreStringToPrint = sbMore.toString();
        if (moreStringToPrint.endsWith("; ")) {
            sbMore.deleteCharAt(sbMore.lastIndexOf("; "));
            moreStringToPrint = sbMore.toString();
        }
        System.out.println(moreStringToPrint);

    }
}
