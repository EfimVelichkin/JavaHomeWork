package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExampleNo2 {
    public static void main(String[] args) {
        String text = "Россия идет вперед всей планеты. Планета — это не Россия.";
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = text.toLowerCase().replaceAll("[^a-zа-яё\\s]", "").split("\\s+");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = scanner.nextLine();

        for (String w : words) {
            if (w.equals(word.toLowerCase())) {
                wordCount.put(w, wordCount.getOrDefault(w, 0) + 1);
            }
        }
        System.out.println(word + " - " + wordCount.getOrDefault(word.toLowerCase(), 0));
    }
}
