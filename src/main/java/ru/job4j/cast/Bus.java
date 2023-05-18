package ru.job4j.cast;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Move by highway");
    }

    @Override
    public void engine() {
        System.out.println(getClass().getSimpleName() + " Engine - Diesel motor");
    }
}
