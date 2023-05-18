package ru.job4j.cast;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Fly by sky");
    }

    @Override
    public void engine() {
        System.out.println(getClass().getSimpleName() + " Engine - jet engine");
    }
}
