package lesson3.homework;

/*  Имеется прямоугольное отверстие размерами a и b,определить,можно ли его
    полностью закрыть круглой картонкой радиусом r.*/

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Side A: ");
        int sideA = scanner.nextInt();
        System.out.println("Side B: ");
        int sideB = scanner.nextInt();
        System.out.println("Radius r: ");
        int radiusR = scanner.nextInt();

        System.out.println(getResultCaver(radiusR, sideA, sideB));
    }

    private static String getResultCaver(int radiusR, int sideA, int sideB) {
        return radiusR >= Math.sqrt((double) (sideA * sideA + sideB * sideB) / 2) ? "Впишется" : "Не впишится";
    }

}
