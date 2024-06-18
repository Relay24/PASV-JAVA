package lesson9.homework;

/*Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
общее их количество.*/

public class Task18 {
    public static void main(String[] args) {
        String str = ". Test text: is there 4, punctuation marks here or not.";
        int countPunctuationMarks = getCountPunctuationMarks(str);
        System.out.println(countPunctuationMarks);
    }

    private static int getCountPunctuationMarks(String text) {
        return text.replaceAll("[^\\p{Punct}]", "").length();
    }
}
