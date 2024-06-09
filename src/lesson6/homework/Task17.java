package lesson6.homework;

/*Создать двухмерный квадратный массив, и заполнить его «бабочкой»*/

import java.util.Arrays;

public class Task17 {
    public static void main(String[] args) {
        int sizeMatrix = 7;
        int[][] matrix = getButterflyMatrix(sizeMatrix);
        printMatrix(matrix);
    }

    private static int[][] getButterflyMatrix(int sizeMatrix) {
        int[][] matrix = new int[sizeMatrix][sizeMatrix];
        for (int i = 0; i <= matrix.length / 2; i++) {
            for (int j = i; j < matrix[i].length - i; j++) {
                matrix[i][j] = 1;
            }
        }
        for (int i = matrix.length - 1; i >= matrix.length / 2; i--) {
            for (int j = matrix.length - i - 1; j <= i; j++) {
                matrix[i][j] = 1;
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] line : matrix) {
            System.out.println(Arrays.toString(line));
        }
    }
}
