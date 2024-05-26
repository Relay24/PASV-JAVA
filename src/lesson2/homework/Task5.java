package lesson2.homework;

/*  Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
    различны?*/

public class Task5 {
    public static void main(String[] args) {
        int number = 1234;
        int numberOne = number % 10;
        int numberTwo = (number % 100 - number % 10) / 10;
        int numberThree = (number % 1000 - number % 100) / 100;
        int numberFour = number / 1000;

        System.out.println("Number: " + number + " " + checkEqual(numberOne, numberTwo, numberThree, numberFour));
    }

    private static String checkEqual(int numberOne, int numberTwo, int numberThree, int numberFour) {
        return (numberOne == numberTwo) | (numberOne == numberThree)
                | (numberOne == numberFour) | (numberTwo == numberThree)
                | (numberTwo == numberFour) | (numberThree == numberFour) ? "Contained Equal" : "Not Contained Equal";
    }
}
