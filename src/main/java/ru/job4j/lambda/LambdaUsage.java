package ru.job4j.lambda;

import java.util.*;

public class LambdaUsage {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("eeeee", "a", "ccc", "dddd", "bb");
        Comparator<String> comparator = (o1, o2) -> {
            System.out.println("compare - " + o1.length() + " : " + o2.length());
            return Integer.compare(o1.length(), o2.length());
        };
        strings.sort(comparator);
        for (String str : strings) {
            System.out.println(str);
        }
    }

}
