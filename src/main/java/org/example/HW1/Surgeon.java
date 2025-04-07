package org.example.HW1;

import java.util.Objects;

public class Surgeon extends Doctor implements DoctorAction{
    public int id;
    public String patientsByAge;
    public final String robeColor = "yellow";
    boolean haveSurgeryAssistant;
    public int yearsOfExp;
    public String speciality = String.valueOf(Speciality.SURGEON);

    public Surgeon(String name, String lastName, String fathersName, int roomN, String patientsByAge, int yearsOfExp, boolean haveSurgeryAssistant) {
        super(name, lastName, fathersName, roomN);
        this.id = getId();
        this.patientsByAge = patientsByAge;
        this.haveSurgeryAssistant = haveSurgeryAssistant;
        this.yearsOfExp = yearsOfExp;
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
        return haveSurgeryAssistant == surgeon.haveSurgeryAssistant && yearsOfExp == surgeon.yearsOfExp && Objects.equals(patientsByAge, surgeon.patientsByAge)
                && Objects.equals(robeColor, surgeon.robeColor) && Objects.equals(speciality, surgeon.speciality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), patientsByAge, robeColor, haveSurgeryAssistant, yearsOfExp, speciality);
    }

    @Override
    public void health() {
        System.out.println("Я все разрезал, посмотрел и сшил обратно!");
    }

    @Override
    public void recommend() {
        System.out.println("Болит одна нога прыгай на другой");
    }
}
