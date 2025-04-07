package org.example.HW1;

import java.util.Objects;

public class Doctor implements Action {

    public static int id;
    public String lastName;
    public String name;
    public String fathersName;
    public int roomN;

    public int getId() {
        return id;
    }

    public Doctor(String name, String lastName, String fathersName, int roomN) {
        id++;
        this.name = name;
        this.lastName = lastName;
        this.fathersName = fathersName;
        this.roomN = roomN;
    }

    public void printInfo() {
        System.out.println("\n" + "Doctor's name: " + lastName + " " + name + fathersName +";\n" +
                "Doctor's ID: " + id + ";\n" +
                "Doctor's room: " + roomN + ";");

    }

    public static void main(String[] args) {
        Doctor newt = new Doctor("Gregory", "House", "Wolf", 1);
        newt.printInfo();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return roomN == doctor.roomN && Objects.equals(lastName, doctor.lastName) && Objects.equals(name, doctor.name) && Objects.equals(fathersName, doctor.fathersName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, name, fathersName, roomN);
    }
}
