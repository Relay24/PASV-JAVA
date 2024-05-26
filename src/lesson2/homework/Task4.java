package lesson2.homework;

/*  Определить число, полученное выписыванием в обратном порядке цифр
    любого 4-х значного натурального числа n.*/

public class Task4 {
    public static void main(String[] args) {
        int number = 1234;
        System.out.println(number);
        System.out.println(revers(number));
    }

    private static int revers(int number) {
        int numberOne = number % 10 * 1000;
        int numberTwo = (number % 100 - number % 10) * 10;
        int numberThree = (number % 1000 - number % 100) / 10;
        int numberFour = number / 1000;
        return numberOne + numberTwo + numberThree + numberFour;
    }
}
