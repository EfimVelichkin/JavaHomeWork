package ExampleNo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Фрукты", "ОАЭ",5.0 ,32500, 1);
        Item item2 = new Item("Книги по биологии", "Нидерланды",2.0 ,8250, 4);
        Item item3 = new Item("Металл", "Россия",2.5 ,52500, 3);
        Item item4 = new Item("Оборудование", "Китай",20.0 ,4250, 2);
        Item item5 = new Item("Книги по информатике", "США",3.2 ,2000, 4);
        Item item6 = new Item("Овощи", "Англия",4.4 ,2005, 1);
        List<Item> item_list = new ArrayList<>();
        item_list.add(item1);
        item_list.add(item2);
        item_list.add(item3);
        item_list.add(item4);
        item_list.add(item5);
        item_list.add(item6);
        int MinPrice = Integer.MAX_VALUE;
        String itemName = "";
        System.out.print("Введите сорт: ");
        Scanner scanner = new Scanner(System.in);
        Integer searchVariety = scanner.nextInt();
        for (Item item : item_list) {
            if (item.getVariety() == searchVariety) {
                if (item.getPrice() < MinPrice) {
                    MinPrice = item.getPrice();
                    itemName = item.getName();
                }
            }
        }
        System.out.println(MinPrice);
        System.out.println(itemName);
    }
}
