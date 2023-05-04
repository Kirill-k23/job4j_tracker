package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    public void whenMax4To6Then6() {
        int first = 4;
        int second = 6;
        int expected = 6;
        int result = Max.max(first, second);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To2To6Then6() {
        int first = 1;
        int second = 2;
        int third = 6;
        int expected = 6;
        int result = Max.max(first, second, third);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To5To6To9Then7() {
        int first = 7;
        int second = 5;
        int third = 6;
        int fourth = 9;
        int expected = 9;
        int result = Max.max(first, second, third, fourth);
        assertThat(result).isEqualTo(expected);
    }
}