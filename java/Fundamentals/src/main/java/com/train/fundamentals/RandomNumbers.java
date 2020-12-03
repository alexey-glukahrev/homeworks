package com.train.fundamentals;

import java.util.Arrays;

/*
* Main Task
* Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
* */

public class RandomNumbers {
    private static final int COUNT = 5;
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 50;

    public static void main( String[] args )
    {
        int[] randomNumbersArray = new int[COUNT];
        for (int i = 0; i < COUNT; i++) {
            randomNumbersArray[i] = (int) (Math.random() * (MAX_VALUE - MIN_VALUE));
        }

        System.out.println("Random numbers: " + Arrays.toString(randomNumbersArray));

        for (int i = 0; i < COUNT; i++) {
            System.out.println("Random number #" + i + ": " + randomNumbersArray[i]);
        }
    }
}
