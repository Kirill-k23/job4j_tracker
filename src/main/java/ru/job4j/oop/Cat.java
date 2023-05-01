package ru.job4j.oop;

public class Cat {
    public String sound() {
        String voise = " may-may";
        return voise;
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        String say = peppy.sound();
        System.out.println("Peppy says" + say);
    }
}
