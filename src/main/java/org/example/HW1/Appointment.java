package org.example.HW1;

public class Appointment {

    public static int id = 0;
    public int patientId;
    public int doctorId;

    public int getId() {
        return id;
    }

    public Appointment(int patientId, int doctorId) {
        id++;
        this.patientId = patientId;
        this.doctorId = doctorId;
    }
}
