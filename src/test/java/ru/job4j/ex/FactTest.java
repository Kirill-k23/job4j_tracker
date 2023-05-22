package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactTest {
    @Test
    public void whenException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Fact().calc(-3);
                }
        );
        assertThat(exception.getMessage()).isEqualTo("N could no be less than 0");
    }

    @Test
    public void whenNotException() {
        int n = 6;
        int expected = 720;
        int result = new Fact().calc(n);
        assertThat(result).isEqualTo(expected);
    }

}