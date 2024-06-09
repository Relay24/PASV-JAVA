package lesson5.homework;

/*Создать массив, заполнить его случайными элементами, распечатать,
перевернуть, и снова распечатать (при переворачивании нежелательно создавать
еще один массив).*/

import java.util.Random;

public class Task15 {
    private static final int MAX_LENGTH_ARRAY = 10;
    private static final int MIN_LENGTH_ARRAY = 1;

    public static void main(String[] args) {
        int[] randomArray = getRandomArray();
        printArray(randomArray);
        int[] reversedArray = getReversArray(randomArray);
        printArray(reversedArray);
    }

    private static int[] getReversArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index: " + i + " Value: " + array[i]);
        }
    }

    private static int[] getRandomArray() {
        Random random = new Random();
        int lengthArray = Math.abs(random.nextInt(MAX_LENGTH_ARRAY - MIN_LENGTH_ARRAY) + MIN_LENGTH_ARRAY);
        int[] randomArray = new int[lengthArray];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt();
        }
        return randomArray;
    }
}

