package org.example.HW1;

public class Patient implements Action {

    public static int id = 0;
    public int age;
    public String lastname;
    public String name;
    public String patronym;

    public int getId() {
        return id;
    }
}
