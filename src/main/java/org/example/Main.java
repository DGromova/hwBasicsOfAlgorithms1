package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        repositoryMethods();
    }

    public static void repositoryMethods() {
        StringListImpl stringListImpl = new StringListImpl();

        stringListImpl.add("test1");
        stringListImpl.add("test2");
        stringListImpl.add("test3");
        stringListImpl.add("test4");
        stringListImpl.add("test5");

        System.out.println(Arrays.toString(stringListImpl.toArray()));

        stringListImpl.remove(3);

        System.out.println(Arrays.toString(stringListImpl.toArray()));

        stringListImpl.clear();

        System.out.println(stringListImpl.size());
    }
}