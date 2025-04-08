package org.example.HW1;

import java.util.Objects;

public class Doctor implements DoctorAction {

    static int doctorId = 0;
    protected String lastName;
    protected String name;
    protected String fathersName;
    protected int roomN;

    public int getId() {
        return doctorId;
    }

    public Doctor(String name, String lastName, String fathersName, int roomN) {
        doctorId++;
        this.name = name;
        this.lastName = lastName;
        this.fathersName = fathersName;
        this.roomN = roomN;
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

    public void printInfo() {
        System.out.println("\n" + "Doctor's name: " + lastName + " " + name + fathersName +";\n" +
                "Doctor's ID: " + doctorId + ";\n" +
                "Doctor's room: " + roomN + ";");
    }

    @Override
    public void health() {
    }

    @Override
    public void recommend() {
    }
}
