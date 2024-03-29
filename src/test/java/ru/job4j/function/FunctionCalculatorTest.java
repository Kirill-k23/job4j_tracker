package ru.job4j.function;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FunctionCalculatorTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(5, 8, x -> x * 2 + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result).containsAll(expected);
    }

    @Test
    public void whenQuadFunctionThenQuadResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(3, 6, x -> Math.pow(x, 2) + 3);
        List<Double> expected = Arrays.asList(12D, 19D, 28D);
        assertThat(result).containsAll(expected);
    }

    @Test
    public void whenExpFunctionThenExpResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(2, 6, x -> Math.pow(2, x) - 2);
        List<Double> expected = Arrays.asList(2D, 6D, 14D, 30D);
        assertThat(result).containsAll(expected);
    }

}