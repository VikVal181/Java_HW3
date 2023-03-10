package org.example.hw3.task1;

import org.example.hw3.task1.model.Items;

import java.util.ArrayList;
import java.util.List;
public class Task1 {
    public static void main(String[] args) {
        Items items = new Items("qwe высший", 1332, 3);
        Items items2 = new Items("qwe1 высший", 124, 1);
        Items items3 = new Items("qwe2", 324, 2);
        Items items4 = new Items("qweс высший", 452, 2);
        Items items5 = new Items("arf", 234, 1);

        List<Items> itemsList = new ArrayList<>();
        itemsList.add(items);
        itemsList.add(items2);
        itemsList.add(items3);
        itemsList.add(items4);
        itemsList.add(items5);
        System.out.println(itemsList);

        int maxPrice = 0;
        for (Items value : itemsList) {
            if (value.getName().contains("высший") && value.getSort() <= 2
                    && value.getPrice() > maxPrice) {
                maxPrice = value.getPrice();
            }
        }

        System.out.println("Наибольшая цена товара: " + maxPrice);

    }
}