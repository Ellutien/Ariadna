package org.example.HW1;

public class Patient extends Human implements Action {

    public int patientId;
    public int age;
    public String lastname;
    public String name;
    public String patronym;

    public Patient(String lastname, String name, String patronym, int age) {
        super();
        this.patientId = getId();
        this.lastname = lastname;
        this.name = name;
        this.patronym = patronym;
        this.age = age;
    }

    @Override
    public void printPatient() {
        System.out.println("\n" + "Patient: " + lastname + " " + name + " " + patronym +"\n" +
                "Age: " + age + " years" + "\n" +
                "Patient id: " + patientId + "\n");
    }

    @Override
    public void isSick() {
        System.out.println("Я же пациент, конечно болею!");
    }
}
