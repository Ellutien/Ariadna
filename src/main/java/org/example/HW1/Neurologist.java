package org.example.HW1;

import java.util.Objects;

public class Neurologist extends Doctor {

    public int experience;
    public boolean hasALittleHammer;
    public String additionalProfile;
    final String robeColor = "white";
    public String speciality = String.valueOf(Speciality.NEUROLOGIST);

    public Neurologist(String name, String lastName, String fathersName, int roomN, int experience, String additionalProfile, boolean hasALittleHammer) {
        super(name, lastName, fathersName, roomN);
        this.id = Doctor.id;
        this.experience = experience;
        this.additionalProfile = additionalProfile;
        this.hasALittleHammer = hasALittleHammer;
    }

    @Override
    public void printInfo() {
        System.out.println("\n" + "Doctor's name: " + lastName + " " + name + " " + fathersName +";\n" +
                "Doctor's ID: " + id + "\n" +
                "Doctor has " + robeColor + " color of the robe;\n" +
                "Doctor's room: " + roomN + ";\n" +
                "Speciality of the doctor: " + speciality + ";\n" +
                "Experience of the doctor: " + experience + " years and he has additional profile: " + additionalProfile + "\n" +
                "Does the doctor has a little hammer: " + hasALittleHammer );
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Neurologist that = (Neurologist) o;
        return experience == that.experience && hasALittleHammer == that.hasALittleHammer && Objects.equals(additionalProfile, that.additionalProfile) && Objects.equals(robeColor, that.robeColor) && Objects.equals(speciality, that.speciality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), experience, hasALittleHammer, additionalProfile, robeColor, speciality);
    }
}
