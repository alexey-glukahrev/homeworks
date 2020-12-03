package com.train.fundamentals;

import java.util.Scanner;

/*
* Main Task
* Отобразить в окне консоли аргументы командной строки в обратном порядке.
* */

public class ReverseArguments {
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter argument #1: ");
        String argument1 = in.nextLine();
        System.out.print("Please enter argument #2: ");
        String argument2 = in.nextLine();
        System.out.print("Please enter argument #3: ");
        String argument3 = in.nextLine();
        System.out.print("Please enter argument #4: ");
        String argument4 = in.nextLine();
        System.out.print("Please enter argument #5: ");
        String argument5 = in.nextLine();
        System.out.println("Arguments in reversed order:");
        System.out.println(argument5 + "; " + argument4 + "; " + argument3 + "; " + argument2 + "; " + argument1);
    }
}
