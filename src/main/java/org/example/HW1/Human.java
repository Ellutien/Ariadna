package org.example.HW1;

public class Human {

    static int id = 0;

    public int id() {
        id++;
        return id;
    }

    public static int getId() {
        return id;
    }
}
