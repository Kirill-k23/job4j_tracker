package ru.job4j.pojo;

public class Book {
    private String name;
    private int pages;

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book(String name, int pages) {
        this.pages = pages;
        this.name = name;
    }
}
