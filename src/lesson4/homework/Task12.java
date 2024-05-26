package lesson4.homework;

/* Найдите сумму первых n целых чисел, которые делятся на 3.*/

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = scanner.nextInt();
        System.out.println("Sum: " + getSum(n));
    }

    private static long getSum(int n) {
        long sum = 0;
        if (n >= 3) {
            for (int i = 3; i <= n; i += 3) {
                sum += i;
            }
        }
        return sum;
    }
}
