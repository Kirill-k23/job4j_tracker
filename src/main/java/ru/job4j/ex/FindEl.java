package ru.job4j.ex;

public class FindEl {

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        for (int index = 0; index < value.length; index++) {
            if (key.equals(value[index])) {
                return index;
            }

        }
        throw new ElementNotFoundException("Element not found");
    }

    public static void main(String[] args) {
         String[] a = {"a", "b", "c", "d"};
         String b = "b";
        try {
            indexOf(a, b);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
