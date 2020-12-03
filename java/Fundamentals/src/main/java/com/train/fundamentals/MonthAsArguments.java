package com.train.fundamentals;

import java.util.Scanner;

/*
* Main Task
* Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
* Осуществить проверку корректности ввода чисел.
* */

public class MonthAsArguments {
    public static void main( String[] args )
    {
        int integerMonth = -1;
        String stringMonth = "You are type ";
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter month number: ");
        try {
            integerMonth = Integer.parseInt(in.nextLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        switch (integerMonth) {
            case 1:
                stringMonth += "January";
                break;
            case 2:
                stringMonth += "February";
                break;
            case 3:
                stringMonth += "March";
                break;
            case 4:
                stringMonth += "April";
                break;
            case 5:
                stringMonth += "May";
                break;
            case 6:
                stringMonth += "June";
                break;
            case 7:
                stringMonth += "July";
                break;
            case 8:
                stringMonth += "August";
                break;
            case 9:
                stringMonth += "September";
                break;
            case 10:
                stringMonth += "October";
                break;
            case 11:
                stringMonth += "November";
                break;
            case 12:
                stringMonth += "December";
                break;
            case -1:
                stringMonth = "Unexpected exception occurs. Please make sure that your month has correct number.";
                break;
            default:
                stringMonth = "There is not month with number " + integerMonth;
        }

        System.out.println(stringMonth);
    }
}
