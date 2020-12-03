package com.train.fundamentals;

import java.util.*;

/*
 * Optional Task 2
 * Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).
 * */

public class SortKColumnOfMatrix {

    private static final int MAX_VALUE = 100500;

    public static void main(String[] args) {
        System.out.print("Please enter matrix dimension: ");
        Scanner in = new Scanner(System.in);
        int dimension = Integer.parseInt(in.nextLine());
        int columnK = (dimension - 1) / 2;

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

        Integer[] columnKValues = Arrays.stream(matrix).map(arr -> arr[columnK]).toArray(Integer[]::new);
        Integer[] columnKValuesSorted = columnKValues.clone();
        Arrays.sort(columnKValuesSorted);
        Integer[][] matrixSorted = new Integer[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            int index = 0;
            for (int j = 0; j < dimension; j++) {
                if (columnKValuesSorted[i].equals(columnKValues[j])) {
                    index = j;
                    break;
                }
            }
            matrixSorted[i] = matrix[index];
        }

        System.out.println("Initial matrix" + Arrays.deepToString(matrix));
        System.out.println("Sorted matrix by " + columnK + " column: " + Arrays.deepToString(matrixSorted));

    }

}
