package org.example.hw3.task2;

import org.example.hw3.task2.model.Items;

import java.util.ArrayList;
import java.util.List;
public class Task2 {
    public static void main(String[] args) {
        Items items = new Items("safa", "RF", 100, 1234, 1);
        Items items2 = new Items("xask", "ED", 134, 1435, 2);
        Items items3 = new Items("vsry", "DD", 354, 4323, 1);
        Items items4 = new Items("bffd", "WS", 567, 1324, 2);
        Items items5 = new Items("dgre", "DD", 863, 7544, 3);
        Items items6 = new Items("vsвы", "ЦУ", 354, 1234, 1);

        List<Items> itemsList = new ArrayList<>();
        itemsList.add(items);
        itemsList.add(items2);
        itemsList.add(items3);
        itemsList.add(items4);
        itemsList.add(items5);
        itemsList.add(items6);

        Integer searchSort = 1;
        Integer minPrice = 0;
        List<String> product = new ArrayList<>();
        for (int i = 0; i < itemsList.size(); i++) {
            if (itemsList.get(i).getSort().equals(searchSort)) {
                if (minPrice == 0) {
                    minPrice = itemsList.get(i).getPrice();
                    product.add(itemsList.get(i).getName());
                }
                else {
                    if (itemsList.get(i).getPrice() < minPrice){
                        minPrice = itemsList.get(i).getPrice();
                        product.clear();
                        product.add(itemsList.get(i).getName());
                    } else if (itemsList.get(i).getPrice().equals(minPrice)) {
                        product.add(itemsList.get(i).getName());
                    }
                }
            }
        }

        System.out.println("Список товаров: " + product + " , с минимальной ценой: " + minPrice);
    }
}
