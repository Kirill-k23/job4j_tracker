package ru.job4j.encapsulation;

import java.time.LocalDate;
import java.util.Date;

public class Student {
    private String name;
    private int group;
    private LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(int year, int month, int day) {
        this.data = LocalDate.of(2015, 9, 1);
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
