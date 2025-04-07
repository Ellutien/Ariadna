package org.example.HW1;

public class Patient extends Human implements Action {

    int id;
    public int age;
    public String lastname;
    public String name;
    public String patronym;


    public Patient(String lastname, String name, String patronym, int age) {
        this.id = getId();
        this.lastname = lastname;
        this.name = name;
        this.patronym = patronym;
        this.age = age;
    }

    public void printPatient() {
        System.out.println("\n" + "Patient: " + lastname + " " + name + " " + patronym +"\n" +
                "Age: " + age + " years" + "\n" +
                "Patient id: " + Human.id + "\n");
    }

    @Override
    public void receivePatients() {

    }

    @Override
    public void sendForCure() {

    }

    @Override
    public void isSick() {

    }
}
