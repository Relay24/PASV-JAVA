package lesson4.homework;

/* Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).*/

public class Task10 {
    public static void main(String[] args) {
        int startNumber = 10;
        int endNumber = 15;
        System.out.println("Factorial: " + getFactorial(startNumber, endNumber));
    }

    private static long getFactorial(int startNumber, int endNumber) {
        long factorial = 1;
        while (startNumber <= endNumber) {
            factorial *= startNumber;
            startNumber++;
        }
        return factorial;
    }
}
