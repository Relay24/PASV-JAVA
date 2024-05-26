package lesson2.homework;

/* Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
    А) минут + секунд,
    В) часов + минут + секунд,
    С) дней + часов + минут + секунд,
    D) недель + дней + часов + минут + секунд.
    по аналогии с примером выше.*/

public class Task3 {

    private static final int totalSec = 4500;

    public static void main(String[] args) {
        System.out.println(getMinSec(totalSec));
        System.out.println(getHourMinSec(totalSec));
        System.out.println(getDayHourMinSec(totalSec));
        System.out.println(getWeekDayHourMinSec(totalSec));
    }

    public static String getMinSec(int sec) {
        return totalSec + "Sec = " + getMinutes(sec) + " Min " + getSecond(sec) + " Sec";
    }

    public static String getHourMinSec(int sec) {
        int hours = getHours(sec);
        return totalSec + "Sec = " + hours + " Hours " + (getMinutes(sec) - (hours * 60)) + " Min " + getSecond(sec) + " Sec";
    }

    public static String getDayHourMinSec(int sec) {
        int days = getDays(sec);
        int hours = getHours(sec);
        return totalSec + "Sec = " + days + " Days " + (hours - days * 24) + " Hours " + (getMinutes(sec) - (hours * 60)) + " Min " + getSecond(sec) + " Sec";
    }

    public static String getWeekDayHourMinSec(int sec) {
        int days = getDays(sec);
        int hours = getHours(sec);
        int weeks = getWeeks(sec);
        return totalSec + "Sec = " + weeks + " Weeks " + (days - weeks * days) + " Days " + (hours - days * 24) + " Hours " + (getMinutes(sec) - (hours * 60)) + " Min " + getSecond(sec) + " Sec";
    }

    private static int getHours(int sec) {
        return getMinutes(sec) / 60;
    }

    private static int getMinutes(int sec) {
        return sec / 60;
    }

    private static int getSecond(int sec) {
        return sec % 60;
    }

    private static int getDays(int sec) {
        return getHours(sec) / 24;
    }

    private static int getWeeks(int sec) {
        return getDays(sec) / 7;
    }

}