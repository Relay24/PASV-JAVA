package lesson3.homework;

/*  Создайте число. Определите, является ли число трехзначным. Определите,
    является ли его последняя цифра семеркой. Определите, является ли число четным.*/

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(getCountNumber(number));
        System.out.println(numberSeven(number));
        System.out.println(numberEvenOdd(number));
    }

    private static String numberEvenOdd(int number) {
        return number % 2 == 0 ? "Even number" : "Odd number";
    }

    private static String numberSeven(int number) {
        return number % 10 == 7 ? "Last number is 7" : "Last number is not 7";
    }

    private static String getCountNumber(int number) {
        return number > 99 && number < 1000 ? "Three digit number" : "Not three digit number";
    }
}


