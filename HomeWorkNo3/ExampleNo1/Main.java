package ExampleNo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Книга <Высший маг>", 2, 205);
        Item item2 = new Item("Книга <Высший мир>", 1, 430);
        Item item3 = new Item("Книга <Высший путь>", 1, 500);
        Item item4 = new Item("Книга <Высший демон>", 4, 350);

        List<Item> itemList = new ArrayList<Item>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        int maxPrice = 0;
        List<Integer> price = new ArrayList<Integer>();
        for (Item item: itemList) {
            if (item.getVariety() == 1 || item.getVariety() == 2) {
                if (item.getPrice() > maxPrice) {
                    maxPrice = item.getPrice();
                }
            }
        }
        System.out.println(maxPrice);

    }
}
