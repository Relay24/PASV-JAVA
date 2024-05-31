package lesson5.homework;

/*Создать массив оценок произвольной длины, вывести максимальную и
минимальную оценку, её (их) номера.*/

import java.util.Arrays;
import java.util.Random;

public class Task14 {
    private static final int MAX_LENGTH_ARRAY = 100;
    private static final int MIN_LENGTH_ARRAY = 1;
    private static final int MAX_GRADE = 10;
    private static final int MIN_GRADE = 1;

    public static void main(String[] args) {
        int[] randomArray = getRandomArray();
        String maxGradeAndIndex = getMaxGradeAndIndex(randomArray);
        String mimGradeAndIndex = getMinGradeAndIndex(randomArray);
        System.out.println(maxGradeAndIndex);
        System.out.println(mimGradeAndIndex);
    }

    private static String getMinGradeAndIndex(int[] randomArray) {
        int min = randomArray[0];
        int index = randomArray[0];
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] < min) {
                min = randomArray[i];
                index = i;
            }
        }
        return "Min: " + min + " Index: " + index;
    }

    private static String getMaxGradeAndIndex(int[] randomArray) {
        int max = randomArray[0];
        int index = randomArray[0];
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] > max) {
                max = randomArray[i];
                index = i;
            }
        }
        return "Max: " + max + " Index: " + index;
    }

    private static int[] getRandomArray() {
        Random random = new Random();
        int lengthArray = Math.abs(random.nextInt(MAX_LENGTH_ARRAY - MIN_LENGTH_ARRAY) + MIN_LENGTH_ARRAY);
        int[] randomArray = new int[lengthArray];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(MAX_GRADE) + MIN_GRADE;
        }
        return randomArray;
    }
}
