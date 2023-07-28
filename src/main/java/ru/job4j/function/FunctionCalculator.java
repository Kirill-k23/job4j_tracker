package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionCalculator {
    public List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> fun = new ArrayList<>();
        for (double i = start; i < end; i++) {
            fun.add(func.apply(i));
        }
        return fun;
    }
}
