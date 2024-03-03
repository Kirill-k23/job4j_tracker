package ru.job4j.kiss.fool;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FoolTest {
    @Test
    void correct() {
        assertThat(Fool.getAnswer(9)).isEqualTo("Fizz");
        assertThat(Fool.getAnswer(27)).isEqualTo("Fizz");
    }
}