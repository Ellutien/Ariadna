package org.example.HW1;

public class Patient implements Action {

    private static int id = 0;
    public int age;
    public String lastname;
    public String name;
    public String patronym;

    public int getId() {
        return id;
    }

    public Patient(String lastname, String name, String patronym, int age) {
        id++;
        this.lastname = lastname;
        this.name = name;
        this.patronym = patronym;
        this.age = age;
        this.id = getId();
    }

    public void printPatient() {
        System.out.println("\n" + "Patient: " + lastname + " " + name + " " + patronym +"\n" +
                "Age: " + age + " years" + "\n" +
                "Patient id: " + getId() + "\n");
    }
}
