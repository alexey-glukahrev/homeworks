package com.train.fundamentals;

import java.util.*;

/*
 * Optional Task 2
 * Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.
 * */

public class MaximumIncreasingElements {

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

        List<List<Integer>> increasingElementsMatrix = new ArrayList<>();
        for (int i = 0; i < dimension; i++) {
            List<Integer> increasingElements = new ArrayList<>();
            for (int j = 0; j < dimension - 1; j++) {
                if (matrix[i][j] < matrix[i][j + 1]) {
                    increasingElements.add(matrix[i][j]);
                    increasingElements.add(matrix[i][j + 1]);
                } else {
                    increasingElementsMatrix.add(removeDuplicates(increasingElements));
                    increasingElements = new ArrayList<>();
                }
            }
        }
        for (int j = 0; j < dimension; j++) {
            List<Integer> increasingElements = new ArrayList<>();
            for (int i = 0; i < dimension - 1; i++) {
                if (matrix[i][j] < matrix[i + 1][j]) {
                    increasingElements.add(matrix[i][j]);
                    increasingElements.add(matrix[i + 1][j]);
                } else {
                    increasingElementsMatrix.add(removeDuplicates(increasingElements));
                    increasingElements = new ArrayList<>();
                }
            }
        }

        int biggestLength = 0;
        List<Integer> longestIncreasingArray = new ArrayList<>();
        for (List<Integer> each: increasingElementsMatrix) {
            if (each.size() > biggestLength) {
                biggestLength = each.size();
                longestIncreasingArray = each;
            }
        }
        System.out.println("Initial matrix" + Arrays.deepToString(matrix));
        System.out.println(increasingElementsMatrix);
        System.out.println("Longest increasing array: " + longestIncreasingArray);
    }

    private static List<Integer> removeDuplicates(List<Integer> arg) {
        List<Integer> returnValue = new ArrayList<>(arg);
        for (int i = 0; i < arg.size() - 1; i++) {
            if (arg.get(i).equals(arg.get(i + 1))) {
                returnValue.remove(arg.get(i));
            }
        }
        return returnValue;
    }

}
