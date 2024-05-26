package lesson4.homework;

/* Изменить пример с суммой чисел таким образом, чтобы рассчитывалась
   не сумма, а произведение, т.е. факториал числа.*/

public class Task9 {

    public static void main(String[] args) {
        System.out.println("Factorial: " + getFactorial());
    }

    private static long getFactorial() {
        long factorial = 1;
        int x = (int) (Math.random() * 20);
        while (x != 0) {
            factorial *= x;
            x = (int) (Math.random() * 20);
        }
        return factorial;
    }
}
