package lesson5.homework;

/*Создать последовательность случайных чисел, найти и вывести наибольшее из них*/

import java.util.Arrays;
import java.util.Random;

public class Task13 {
    private static final int MAX_LENGTH_ARRAY = 10;
    private static final int MIN_LENGTH_ARRAY = 1;

    public static void main(String[] args) {
        int[] randomArray = getRandomArray();
        int maxValue = getMaxValue(randomArray);
        System.out.println("Max: " + maxValue);
    }

    private static int getMaxValue(int[] randomArray) {
        int max = randomArray[0];
        for (int j : randomArray) {
            max = Math.max(j, max);
        }
        return max;
    }

    private static int[] getRandomArray() {
        Random random = new Random();
        int lengthArray = random.nextInt(MAX_LENGTH_ARRAY - MIN_LENGTH_ARRAY) + MIN_LENGTH_ARRAY;
        int[] randomArray = new int[lengthArray];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt();
        }
        return randomArray;
    }
}
