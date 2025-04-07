package org.example;

import org.example.HW1.*;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        Patient mine = new Patient("Ivanov", "Petr", "Sidorovich", 40);
        Patient other = new Patient("Bobrov", "Maksim", "Grigor'evich", 48);
        mine.printPatient();
        other.printPatient();

        Therapist house = new Therapist("Gregory", "House", "Wolf", 125, "Kardio", true, 4);
        Surgeon talent = new Surgeon("Andrey", "Bikov", "Evgenievich", 45, "18-99 y.o. ", 8);
        Pediatrist newt = new Pediatrist("Newman", "Godwill", "James", 654, "2-6");
        Neurologist neiron = new Neurologist("Dolce", "Vitto", "Angus", 56, 5, "Brain injuries", true);

        house.printInfo();
        talent.printInfo();
        newt.printInfo();
        neiron.printInfo();


    }


}
