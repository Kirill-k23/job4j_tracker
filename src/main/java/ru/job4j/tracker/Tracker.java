package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                return items[index];
            }
        }
        return null;
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        int count = 0;
        for (int index = 0; index < size; index++) {
            if (key.equals(items[index].getName())) {
                rsl[count] = items[index];
                count++;
            }
        }
        return Arrays.copyOf(rsl, count);
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }
}