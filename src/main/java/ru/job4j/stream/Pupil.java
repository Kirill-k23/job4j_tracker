package ru.job4j.stream;

import java.util.List;

public record Pupil(String name, List<Subject> subjects) {
    @Override
    public String name() {
        return name;
    }

    @Override
    public List<Subject> subjects() {
        return subjects;
    }
}
