package ru.job4j.tracker;

import java.time.LocalDateTime;

public class Item {
    private int id;
    private String name;
    private LocalDateTime created = LocalDateTime.now();

    public Item() {

    }

    public Item(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Item(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Номер " + id);
        System.out.println("Имя " + name);
        System.out.println();
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Item reloadFirst = new Item();
        reloadFirst.printInfo();
        Item reloadSecond = new Item("Kirill", 25);
        reloadSecond.printInfo();
        Item reloadThird = new Item("Vitaliy");
        reloadThird.printInfo();
    }
}