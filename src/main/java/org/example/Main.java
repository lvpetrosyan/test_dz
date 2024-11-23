package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>(Arrays.asList("Достоевский", "Пушкин", "Лермонтов", "Толстой", "Оруэлл"));

        List<List<String>> shelves = distributeBooks(books);

        // Выводим результат
        for (int i = 0; i < shelves.size(); i++) {
            System.out.println("Полка " + (i + 1) + ": " + shelves.get(i));
        }
    }

    public static List<List<String>> distributeBooks(List<String> books) {
        final int numberOfShelves = 5;
        Collections.sort(books);
        List<List<String>> shelves = new ArrayList<>();
        for (int i = 0; i < numberOfShelves; i++) {
            shelves.add(new ArrayList<>());
        }
        for (int i = 0; i < books.size(); i++) {
            int index = i % numberOfShelves;
            shelves.get(index).add(books.get(i));
        }
        return shelves;
    }
}