package ru.job4j.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Move by rail");
    }

    @Override
    public void engine() {
        System.out.println(getClass().getSimpleName() + " Engine - electric motor");
    }
}
