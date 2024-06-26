package lesson4.homework;

/* Изменить пример с суммой чисел таким образом, чтобы рассчитывалась
   не сумма, а произведение, т.е. факториал числа.*/

    /*
    @Pavlo FIXME: Решение не верно.
               Код код генерирует новое случайное число на каждом шаге цикла,
               что не соответствует стандартному определению факториала.
               Чтобы правильно рассчитать факториал, вам нужно сначала
               определить число x, а затем последовательно умножать числа от 1 до x
    */

    /*Fixed*/
public class Task9 {

    public static void main(String[] args) {
        int x = (int) (Math.random() * 20);
        System.out.println("Factorial " + x + " = " + getFactorial(x));
    }

    private static long getFactorial(int x) {
        long factorial = 1;
        int count = 1;
        while (count <= x) {
            factorial *= x;
            count++;
        }
        return factorial;
    }
}
