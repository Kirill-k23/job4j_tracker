package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("Clean code", 240);
        Book second = new Book("Forrest Gump", 340);
        Book third = new Book("Green mile", 400);
        Book fourth = new Book("Full metal jacket", 500);
        Book[] lib = new Book[4];
        lib[0] = first;
        lib[1] = second;
        lib[2] = third;
        lib[3] = fourth;
        for (int index = 0; index < lib.length; index++) {
            Book li = lib[index];
            System.out.println(li.getName() + " - " + li.getPages());
        }
        System.out.println();
        Book temp = lib[0];
        lib[0] = lib[3];
        lib[3] = temp;
        for (int index = 0; index < lib.length; index++) {
            Book li = lib[index];
            System.out.println(li.getName() + " - " + li.getPages());
        }
        System.out.println();
        System.out.println("Show only Clean code");
        for (int index = 0; index < lib.length; index++) {
            Book li = lib[index];
            if (li.getName() == "Clean code") {
                System.out.println(li.getName() + " - " + li.getPages());
            }
        }
    }
}
