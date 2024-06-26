package lesson4.homework;

/* Найдите сумму первых n целых чисел, которые делятся на 3.*/

import java.util.Scanner;

    /*
    @Pavlo FIXME: Решение верно
            Факультативно: Важно закрывать Scanner после его использования, чтобы освободить ресурсы, методом scanner.close();
    */

    /*Fixed*/

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Count Numbers: ");
        int countNumbers = scanner.nextInt();
        System.out.println("Sum: " + getSum(countNumbers));
        scanner.close();
    }

    private static long getSum(int countNumbers) {
        long sum = 0;
        int counter = 0;
        int nextNumber = 3;
        if (countNumbers > 0) {
            do {
                sum += nextNumber;
                counter++;
                nextNumber += 3;
            } while (countNumbers > counter);
        }
        return sum;
    }
}
