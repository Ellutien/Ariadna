package org.example.HW1;

import java.util.Objects;

public class Pediatrist extends Doctor {

    public String kidsAge;
    public final String robeColor = "blue";
    public String speciality = String.valueOf(Speciality.PEDIATRIST);

    public Pediatrist(String name, String lastName, String fathersName, int roomN, String kidsAge) {
        super(name, lastName, fathersName, roomN);
        this.id = Doctor.id;
        this.kidsAge = kidsAge;
    }

    @Override
    public void printInfo() {
        System.out.println("Doctor's name: " + lastName + " " + name + " " + fathersName +";\n" +
                "Doctor's ID: " + id + " and " + robeColor + " color of the robe;\n" +
                "Doctor's room: " + roomN + ";\n" +
                "Profile of the doctor: " + speciality + ";" +
                "Patients of the doctor: kids of " + kidsAge + " years of age");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pediatrist that = (Pediatrist) o;
        return Objects.equals(kidsAge, that.kidsAge) && Objects.equals(robeColor, that.robeColor) && Objects.equals(speciality, that.speciality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), kidsAge, robeColor, speciality);
    }
}
