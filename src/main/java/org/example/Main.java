package org.example;

import org.example.HW1.*;

import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        Patient mine = new Patient("Ivanov", "Petr", "Sidorovich", 40);
        Patient other = new Patient("Bobrov", "Maksim", "Grigor'evich", 48);
        mine.printPatient();
        other.printPatient();

        Doctor house = new Therapist("Gregory", "House", "Wolf", 125, "Kardio", true, 4);
        Doctor talent = new Surgeon("Andrey", "Bikov", "Evgenievich", 45, "18-99 y.o. ", 8, true);
        DoctorAction newt = new Pediatrist("Newman", "Godwill", "James", 654, "2-6");
        DoctorAction neiron = new Neurologist("Dolce", "Vitto", "Angus", 56, 5, "Brain injuries", true);

        house.health();
        house.isSick();
        talent.health();
        newt.health();
        house.printInfo();
        talent.printInfo();


        //        house.printInfo();
//        talent.printInfo();
//        newt.printInfo();
//        neiron.printInfo();


    }


}
