package org.example.HW1;

import java.util.Objects;

public class Surgeon extends Doctor {

    public String patientsByAge;
    public final String robeColor = "yellow";
    boolean haveSurgeryAssistant;
    public int yearsOfExp;
    public String speciality = String.valueOf(Speciality.SURGEON);

    public Surgeon(String name, String lastName, String fathersName, int roomN, String patientsByAge, int yearsOfExp) {
        super(name, lastName, fathersName, roomN);
        this.patientsByAge = patientsByAge;
        this.haveSurgeryAssistant = haveSurgeryAssistant;
        this.yearsOfExp = yearsOfExp;
        this.id = Doctor.id;
    }

    @Override
    public void printInfo() {
        System.out.println("\n" + "Doctor's name: " + lastName + " " + name + " " + fathersName +";\n" +
                "Doctor's ID: " + id + "\n" +
                "Doctor has " + robeColor + " color of the robe;\n" +
                "Doctor's room: " + roomN + ";\n" +
                "Profile of the doctor: " + speciality + ";\n" +
                "Experience of the doctor: " + yearsOfExp + " years with " + patientsByAge + " patients");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Surgeon surgeon = (Surgeon) o;
        return haveSurgeryAssistant == surgeon.haveSurgeryAssistant && yearsOfExp == surgeon.yearsOfExp && Objects.equals(patientsByAge, surgeon.patientsByAge) && Objects.equals(robeColor, surgeon.robeColor) && Objects.equals(speciality, surgeon.speciality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), patientsByAge, robeColor, haveSurgeryAssistant, yearsOfExp, speciality);
    }
}
