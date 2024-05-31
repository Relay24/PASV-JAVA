package lesson5.homework;

/*Определите сумму элементов одномерного массива, расположенных между
минимальным и максимальным значениями. */

/*Неопределенность если все элементы равны в массиве или массив длинной 1*/

import java.util.Random;

public class Task16 {
    private static final int MAX_LENGTH_ARRAY = 10;
    private static final int MIN_LENGTH_ARRAY = 1;

    public static void main(String[] args) {
        int[] randomArray = getRandomArray();
        int indexOfMin = getIndexOfMin(randomArray);
        int indexOfMax = getIndexOfMax(randomArray);

        System.out.println("Min index: " + indexOfMin);
        System.out.println("Max index: " + indexOfMax);

        int sum = getSum(indexOfMin, indexOfMax, randomArray);
        System.out.println(sum);
    }

    private static int getSum(int indexOfMin, int indexOfMax, int[] randomArray) {
        int startIndex = Math.min(indexOfMin, indexOfMax);
        int endIndex = Math.max(indexOfMin, indexOfMax);
        int sum = 0;
        for (int i = startIndex; i < endIndex; i++) {
            sum += randomArray[i];
        }
        return sum;
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

    private static int getIndexOfMin(int[] randomArray) {
        int min = randomArray[0];
        int index = randomArray[0];
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] < min) {
                min = randomArray[i];
                index = i;
            }
        }
        return index;
    }

    private static int getIndexOfMax(int[] randomArray) {
        int max = randomArray[0];
        int index = randomArray[0];
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] > max) {
                max = randomArray[i];
                index = i;
            }
        }
        return index;
    }
}
