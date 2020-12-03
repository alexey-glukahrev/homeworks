package com.train.fundamentals;

import java.util.Scanner;

/*
* Main Task
* Приветствовать любого пользователя при вводе его имени через командную строку.
* */

public class Greeting {
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String str = in.nextLine();
        System.out.println( "Welcome " + str );
    }
}
