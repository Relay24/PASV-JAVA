package lesson4.homework;

/* Имеется целое число, определить является ли это число простым, т.е.
делится без остатка только на 1 и себя.*/

    /*
    @Pavlo FIXME: Решение верно, но нужно учесть следующее:
            1. Важно закрыть Scanner после его использования, чтобы освободить ресурсы, методом scanner.close();
            2. метод checkPrimeNumber возвращает true для всех чисел, меньше 2, включая отрицательные числа и ноль, что некорректно
    */

    /*Fixed*/

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = scanner.nextInt();
        String result = checkPrimeNumber(number) ? "Prime Number" : "Not Prime Number";
        System.out.println(result);
        scanner.close();
    }

    private static boolean checkPrimeNumber(int number) {
        boolean flag = true;
        if (number < 2) {
            flag = false;
        } else {
            int maxNumber = (int) Math.sqrt(number);
            for (int i = 2; i <= maxNumber; i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}
