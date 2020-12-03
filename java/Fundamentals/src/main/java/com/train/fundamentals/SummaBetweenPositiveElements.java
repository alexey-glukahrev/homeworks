package com.train.fundamentals;

import java.util.*;

/*
 * Optional Task 2
 * Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки
 * */

public class SummaBetweenPositiveElements {

    private static final int MAX_VALUE = 100500;

    public static void main(String[] args) {
        System.out.print("Please enter matrix dimension: ");
        Scanner in = new Scanner(System.in);
        int dimension = Integer.parseInt(in.nextLine());

        Random random = new Random();
        int sign;
        int matrixElement;
        Integer[][] matrix = new Integer[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                sign = random.nextInt(MAX_VALUE) < (MAX_VALUE / 2) ? -1 : 1;
                matrixElement = random.nextInt(MAX_VALUE) * sign;
                matrix[i][j] = matrixElement;
            }
        }

        Integer[] arrayOfSum = new Integer[dimension];
        for (int i = 0; i < dimension; i++) {
            int firstPositiveNumberIndex = -1;
            int secondPositiveNumberIndex = -1;
            for (int j = 0; j < dimension; j++) {
                int summa = 0;
                if (matrix[i][j] > 0) {
                    if (firstPositiveNumberIndex == -1) {
                        firstPositiveNumberIndex = j;
                    } else if (secondPositiveNumberIndex == -1) {
                        secondPositiveNumberIndex = j;
                    } else {
                        if (secondPositiveNumberIndex - firstPositiveNumberIndex > 1) {
                            for (int k = firstPositiveNumberIndex + 1; k < secondPositiveNumberIndex; k++) {
                                summa += matrix[i][k];
                            }
                        }
                        arrayOfSum[i] = summa;
                        break;
                    }
                }
            }
        }

        System.out.println("Initial matrix" + Arrays.deepToString(matrix));
        System.out.println("List of summa" + Arrays.toString(arrayOfSum));
    }
}
