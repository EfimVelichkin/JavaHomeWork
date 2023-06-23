package org.example;

import java.util.HashMap;
import java.util.*;
import java.util.Map;

public class ExampleNo3 {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList(
                "Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов",
                "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина",
                "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников",
                "Петр Петин", "Иван Ежов"
        );

        Map<String, Integer> nameCount = new HashMap<>();
        for (String employee : employees) {
            String name = employee.split(" ")[0];
            nameCount.put(name, nameCount.getOrDefault(name, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedNames = new ArrayList<>(nameCount.entrySet());
        sortedNames.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

        for (Map.Entry<String, Integer> entry : sortedNames) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}
