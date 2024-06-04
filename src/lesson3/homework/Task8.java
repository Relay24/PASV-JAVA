package lesson3.homework;

/*  Имеется целове число(задать с помощью Random rand=new Random();
    int x = rand.nextInt()).
    Это число – количесво денег в рублях. Вывести это число,добавив к
    нему слово «рублей» в правильном падеже.*/

    /*
    @Pavlo FIXME: Решение не верно для чисел 11-14
    */

/* Решение верное во всем диапозоне 11-20 имя заканчивается на Рублей
11 - Рублей
12 - Рублей
13 - Рублей
....
20 - Рублей
Отвечает за это этот участок кода:
    if (rubles % 100 > 10 && rubles % 100 < 21) {
        result = " Рублей";
    }
*/
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

