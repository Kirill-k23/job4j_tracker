package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ItemTest {
    @Test
    public void whenItemAscByNameTest() {
        List<Item> items = Arrays.asList(
                new Item("Two"),
                new Item("One"),
                new Item("Three")

        );
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item("One"),
                new Item("Three"),
                new Item("Two")
        );
        assertThat(items).isEqualTo(expected);
    }

    @Test
    public void whenItemDescByName() {
        List<Item> items = Arrays.asList(
                new Item("One"),
                new Item("Three"),
                new Item("Two")
        );
        Collections.sort(items, new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item("One"),
                new Item("Three"),
                new Item("Two")
        );
        assertThat(items).isEqualTo(expected);
    }
}