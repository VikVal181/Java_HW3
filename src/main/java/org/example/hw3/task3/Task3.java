package org.example.hw3.task3;

import org.example.hw3.task3.model.Items;

import java.util.ArrayList;
import java.util.List;
public class Task3 {
    public static void main(String[] args) {
        Items item = new Items("asddaasf", "Asdfkl", 1234, 1990, 352);
        Items item2 = new Items("erykjh", "Ucdfr", 432, 2009, 181);
        Items item3 = new Items("xcvlio", "Csad", 7453, 2011, 199);
        Items item4 = new Items("djsks", "Qmntry", 439, 2013, 39);
        Items item5 = new Items("dsui cx", "Iklmcx", 1213, 2009, 621);
        Items item6 = new Items("ewsdcx", "Tjcadt", 972, 2016, 424);

        List<Items> itemsList = new ArrayList<>();
        itemsList.add(item);
        itemsList.add(item2);
        itemsList.add(item3);
        itemsList.add(item4);
        itemsList.add(item5);
        itemsList.add(item6);

        List<String> books = new ArrayList<>();

        for (Items value : itemsList) {
            if (isPrime(value.getPages())
                    && value.getAuthor().toLowerCase().contains("a")
                    && value.getYear() >= 2010) {
                books.add(value.getTitle());
            }
        }

        System.out.println("Список книг: " + books);
    }

    public static boolean isPrime(int n) {
        if (n > 1)
        {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
        else {
            return false;
        }
    }
}