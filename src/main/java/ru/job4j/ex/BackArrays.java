package ru.job4j.ex;

import java.util.Arrays;

public class BackArrays {
    public static void main(String[] args) {
        String[] names = {"Petr", "Ivan", "Nik", "Vasya"};
        int middle = names.length / 2;
        for (int index = 0; index < middle; index++) {
            String temp = names[index];
            names[index] = names[names.length / 2 - index];
            names[names.length / 2 - index] = temp;
        }
        System.out.println(Arrays.toString(names));
    }
}
