package org.example.HW1;

public interface Action {
    void receivePatients();
    void sendForCure();
    void isSick();
    default void print(String string){

    }

}
