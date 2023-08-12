package ru.job4j.stream;

public record Tuple(String name, double score) {
    @Override
    public String name() {
        return name;
    }

    public double score() {
        return score;
    }
}
