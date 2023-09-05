package leetcode;
import java.util.*;

public class CowboySheriff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String targetWord = "sheriff";

        // Создаем массивы для подсчета букв
        int[] sLetterCount = new int[26];
        int[] targetLetterCount = new int[26];

        // Заполняем массивы
        for (char c : s.toCharArray()) {
            sLetterCount[c - 'a']++;
        }
        for (char c : targetWord.toCharArray()) {
            targetLetterCount[c - 'a']++;
        }

        // Инициализируем минимальное количество слов "sheriff" как максимальное возможное значение
        int minSheriffWords = Integer.MAX_VALUE;

        // Находим минимальное количество слов "sheriff" на основе букв
        for (char c : targetWord.toCharArray()) {
            int letterCountInS = sLetterCount[c - 'a'];
            int letterCountInTarget = targetLetterCount[c - 'a'];

            if (letterCountInTarget > 0) {
                minSheriffWords = Math.min(minSheriffWords, letterCountInS / letterCountInTarget);
            }
        }

        System.out.println(minSheriffWords);
    }
}
