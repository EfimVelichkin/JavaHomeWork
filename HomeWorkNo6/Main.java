package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("Lenovo", 8, 256, "Windows", "Black"));
        laptops.add(new Laptop("HP", 16, 512, "Windows", "Silver"));
        laptops.add(new Laptop("Dell", 8, 512, "Linux", "Black"));

        Map<Integer, Object> filters = new HashMap<>();
        filters.put(1, 8); // ОЗУ >= 8
        filters.put(2, 256); // Объем ЖД >= 256
        filters.put(3, "Windows"); // Операционная система = Windows

        filterLaptops(laptops, filters);
    }

    public static void filterLaptops(Set<Laptop> laptops, Map<Integer, Object> filters) {
        for (Laptop laptop : laptops) {
            boolean passFilter = true;
            for (Map.Entry<Integer, Object> entry : filters.entrySet()) {
                int filterType = entry.getKey();
                Object filterValue = entry.getValue();

                switch (filterType) {
                    case 1:
                        if (laptop.getRam() < (int) filterValue) {
                            passFilter = false;
                        }
                        break;
                    case 2:
                        if (laptop.getStorage() < (int) filterValue) {
                            passFilter = false;
                        }
                        break;
                    case 3:
                        if (!laptop.getOs().equals(filterValue)) {
                            passFilter = false;
                        }
                        break;
                    // Добавьте дополнительные кейсы для других критериев фильтрации
                }
            }

            if (passFilter) {
                System.out.println("Ноутбук проходит по условиям фильтра: " + laptop.getBrand());
            }
        }
    }
}