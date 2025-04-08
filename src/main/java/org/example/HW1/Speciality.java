package org.example.HW1;

public enum Speciality {


    THERAPIST("Терапевт"),
    SURGEON ("Хирург"),
    PEDIATRIST ("Педиатр"),
    NEUROLOGIST ("Невролог");
    private final String text;

    Speciality (String text){
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}

