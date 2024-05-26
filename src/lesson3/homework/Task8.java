package lesson3.homework;

/*  Имеется целове число(задать с помощью Random rand=new Random();
    int x = rand.nextInt()).
    Это число – количесво денег в рублях. Вывести это число,добавив к
    нему слово «рублей» в правильном падеже.*/

import java.util.Random;

public class Task8 {

    public static void main(String[] args) {
        Random random = new Random();
        int rubles = Math.abs(random.nextInt());
        System.out.println(rubles + getTextRubles(rubles));
    }

    private static String getTextRubles(int rubles) {
        String result = " Рублей";
        if (rubles % 100 > 10 && rubles % 100 < 21) {
            result = " Рублей";
        } else {
            result = switch (rubles % 10) {
                case 1 -> " Рубль";
                case 2, 3, 4 -> " Рубля";
                default -> " Рублей";
            };
        }
        return result;
    }

}

