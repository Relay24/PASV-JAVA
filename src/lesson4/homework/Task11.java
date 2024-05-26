package lesson4.homework;

/* Имеется целое число, определить является ли это число простым, т.е.
делится без остатка только на 1 и себя.*/

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = scanner.nextInt();
        String result = checkPrimeNumber(number) ? "Prime Number" : "Not Prime Number";
        System.out.println(result);
    }

    private static boolean checkPrimeNumber(int number) {
        boolean flag = true;
        int maxNumber = (int) Math.sqrt(number);
        for (int i = 2; i <= maxNumber; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
