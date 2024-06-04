package lesson4.homework;

/* Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).*/

    /*
    @Pavlo FIXME: Решение не верно.
               метод getFactorial фактически вычисляет произведение чисел от 10 до 15,
               а не факториалы каждого числа в этом диапазоне по отдельности
    */

    /*Fixed*/

public class Task10 {
    public static void main(String[] args) {
        int startNumber = 10;
        int endNumber = 15;
        for (int number = startNumber; number <= endNumber ; number++) {
            System.out.println("Factorial: " + number + " = " + getFactorial(number));
        }
    }

    private static long getFactorial(int number) {
        long factorial = 1;
        int count = 1;
        while (count <= number) {
            factorial *= number;
            count++;
        }
        return factorial;
    }
}
