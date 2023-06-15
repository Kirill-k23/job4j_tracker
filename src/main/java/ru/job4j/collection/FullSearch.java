package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public static HashSet<String> extractNumber(List<Tasks> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Tasks task : list) {
            numbers.add(task.getNumber());
        }
        return numbers;
    }
}
