package ru.job4j.encapsulation;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setData(2015, 9, 1);
        student.setGroup(7);
        student.setName(" Kleyn Kirill Garikovich ");
        System.out.println(student.getData() + student.getName() + student.getGroup());
    }
}
