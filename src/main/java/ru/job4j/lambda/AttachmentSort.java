package ru.job4j.lambda;

import java.util.*;

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image", 100),
                new Attachment("image", 34),
                new Attachment("image", 13)
        );
        Collections.sort(attachments, new Comparator<Attachment>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                return Integer.compare(o1.getSize(), o2.getSize());
            }
        });
        System.out.println(attachments);
        Collections.sort(attachments, new Comparator<Attachment>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(attachments);
    }
}
