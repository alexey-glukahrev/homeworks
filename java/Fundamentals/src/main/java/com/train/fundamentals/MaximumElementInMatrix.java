package com.train.fundamentals;

import java.util.*;

/*
 * Optional Task 2
 * Найти максимальный элемент в матрице и удалить из матрицы все строки и столбцы, его содержащие
 * */

public class MaximumElementInMatrix {

    private static final int MAX_VALUE = 100500;

    public static void main(String[] args) {
        System.out.print("Please enter matrix dimension: ");
        Scanner in = new Scanner(System.in);
        int dimension = Integer.parseInt(in.nextLine());

        Random random = new Random();
        int sign;
        int matrixElement;
        List<List<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < dimension; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < dimension; j++) {
                sign = random.nextInt(MAX_VALUE) < (MAX_VALUE / 2) ? -1 : 1;
                matrixElement = random.nextInt(MAX_VALUE) * sign;
                row.add(j, matrixElement);
            }
            matrix.add(i, row);
        }
        System.out.println("Initial matrix" + matrix);

        int rowOfMaxElement = -1;
        int columnOfMaxElement = -1;
        int maxElement = 0;
        for (List<Integer> row: matrix) {
            for (Integer element: row) {
                if (element > maxElement) {
                    maxElement = element;
                    rowOfMaxElement = matrix.indexOf(row);
                    columnOfMaxElement = row.indexOf(element);
                }
            }
        }
        List<List<Integer>> matrixWithoutMaxElement = new ArrayList<>(matrix);
        for (List<Integer> row: matrix) {
            row.remove(columnOfMaxElement);
        }
        matrixWithoutMaxElement.remove(rowOfMaxElement);

        System.out.println("Matrix without row and column that contains max element" + matrixWithoutMaxElement);
    }
}
