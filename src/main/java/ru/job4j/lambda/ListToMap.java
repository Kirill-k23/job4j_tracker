package ru.job4j.lambda;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    public static Map<String, Student> convert(List<Student> list) {
       return list.stream()
                .collect(Collectors.toMap(
                        e -> e.getSurname(),
                        Student -> Student,
                        (a, b) -> a
                ));
    }
}
