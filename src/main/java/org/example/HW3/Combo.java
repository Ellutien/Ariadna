package org.example.HW3;

import java.util.ArrayList;
import java.util.List;

public class Combo implements PokerCombos{
    int numberOfCubes;
    int[] combo;
    String comboName;

    public Combo(int numberOfCubes, int[] combo, String comboName) {
        this.numberOfCubes = numberOfCubes;
        this.combo = combo;
        this.comboName = comboName;
    }

    @Override
    public String getCombo() {
        return "";
    }
}
