package lesson9.homework;

/*Имеется строка с текстом. Вывести текст, составленный из последних букв
всех слов.*/

public class Task20 {
    public static void main(String[] args) {
        String str = " Имеется строка с текстом. Вывести текст, составленный      из последних букв всех слов.    ";
        String newText = getNewText(str);
        System.out.println(newText);
    }

    private static String getNewText(String text) {
        String[] splitText = text.trim().split("[?!:;,.\\s]");
        String newText = "";
        for (String str : splitText) {
            if (!str.isBlank()) {
                newText = newText.concat(str.trim().substring(str.length()-1));
            }
        }
        return newText;
    }
}
