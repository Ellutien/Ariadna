package org.example.HW1;

import java.util.Objects;

public class Therapist extends Doctor {

    public int id;
    public String profile;
    public final String robeColor = "green";
    boolean isAllowedToSignRecipies;
    public int numberOfAssistants;
    public String speciality = String.valueOf(Speciality.THERAPIST);


    public Therapist(String name, String lastName, String fathersName, int roomN, String profile, boolean isAllowedToSignRecipies, int numberOfAssistants) {
        super(name, lastName, fathersName, roomN);
        this.id = getId();
        this.profile = profile;
        this.isAllowedToSignRecipies = isAllowedToSignRecipies;
        this.numberOfAssistants = numberOfAssistants;
    }

    @Override
    public void printInfo() {
        System.out.println("\n" + "Doctor's name: " + lastName + " " + name + " " + fathersName +";\n" +
                "Doctor's speciality: " + speciality + "\n" +
                "Doctor's ID: " + id + "\n" +
                "Doctor has " + numberOfAssistants + " assistants and " + robeColor + " color of the robe;\n" +
                "Doctor's room: " + roomN + ";\n" +
                "Profile of the doctor: " + profile + ";");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Therapist therapist = (Therapist) o;
        return isAllowedToSignRecipies == therapist.isAllowedToSignRecipies && numberOfAssistants == therapist.numberOfAssistants && Objects.equals(profile, therapist.profile) && Objects.equals(robeColor, therapist.robeColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), profile, robeColor, isAllowedToSignRecipies, numberOfAssistants);
    }

    @Override
    public void health() {
        System.out.println("Померял давление.");
    }

    @Override
    public void recommend() {
        System.out.println("Можно в космос");
    }

}
