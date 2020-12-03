package com.train.fundamentals;

import java.util.Scanner;

/*
* Main Task
* Ввести целые числа как аргументы командной строки,
* подсчитать их сумму (произведение) и вывести результат на консоль.
* */

public class SumOfArguments {
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter number #1: ");
        int argument1 = Integer.parseInt(in.nextLine());
        System.out.print("Please enter number #2: ");
        int argument2 = Integer.parseInt(in.nextLine());
        System.out.print("Please enter number #3: ");
        int argument3 = Integer.parseInt(in.nextLine());

        System.out.println("Summa result: " + (argument1 + argument2 + argument3));
        System.out.println("Multiplying result: " + (argument1 * argument2 * argument3));
    }
}
