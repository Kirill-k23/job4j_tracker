package ru.job4j.oop;

public class Student {
    public void music() {
        System.out.println("Tra tra tra");
        System.out.println("I belive I can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
    }
}
