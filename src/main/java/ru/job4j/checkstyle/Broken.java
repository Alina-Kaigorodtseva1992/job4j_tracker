package ru.job4j.checkstyle;

public class Broken {
    private int sizeOfEmpty = 10;
    private String surname;
    private static final String NEW_VALUE = "";
    private String name;

      public Broken() {

    }

    void echo() {
    }

    void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    void method(int a, int b, int c) {
        a = b * c;
        System.out.println(a);
    }

}