package ru.job4j.ex;

public class FindEl {
    static String[] a = {"a", "b", "c", "d"};
    static String b = "b";

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        for (int index = 0; index < value.length; index++) {
            if (key.equals(value[index])) {
                return index;
            }

        }
        throw new ElementNotFoundException("Element not found");
    }

    public static void main(String[] args) {
        try {
            indexOf(a, b);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
