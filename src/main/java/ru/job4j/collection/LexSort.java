package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] leftSp = left.split(". ");
        String[] rightSp = right.split(". ");
        return Integer.compare(Integer.parseInt(leftSp[0]), Integer.parseInt(rightSp[0]));
    }
}
