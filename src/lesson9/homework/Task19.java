package lesson9.homework;

/*Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
учесть, что слова могут разделяться несколькими пробелами, в начале и конце
текста также могут быть пробелы, но могут и отсутствовать.*/

public class Task19 {
    public static void main(String[] args) {
        String str = " Имеется строка    с текстом. Подсчитать    количество слов в тексте.    ";
        int countWords = getCountWords(str);
        System.out.println(countWords);
    }

    private static int getCountWords(String text) {
        return text.isBlank() ? 0 : text.trim().split("\\s+").length;
    }
}
