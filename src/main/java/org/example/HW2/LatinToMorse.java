package org.example.HW2;

import java.util.HashMap;
import java.util.Map;

public class LatinToMorse {
    public static String latinToMorseCode(String str) {
        Map<Character, String> morseCode = new HashMap<>();
        morseCode.put('A', "•—");
        morseCode.put('B', "—•••");
        morseCode.put('C', "•—•—");
        morseCode.put('D', "—••");
        morseCode.put('E', "•");
        morseCode.put('F', "••—•");
        morseCode.put('G', "——•");
        morseCode.put('H', "••••");
        morseCode.put('I', "••");
        morseCode.put('J', "•———");
        morseCode.put('K', "—•—");
        morseCode.put('L', "•—••");
        morseCode.put('M', "——");
        morseCode.put('N', "—•");
        morseCode.put('O', "———");
        morseCode.put('P', "•——•");
        morseCode.put('Q', "——•—");
        morseCode.put('R', "•—•");
        morseCode.put('S', "•••");
        morseCode.put('T', "—");
        morseCode.put('U', "••—");
        morseCode.put('V', "•••—");
        morseCode.put('W', "•——");
        morseCode.put('X', "—••—");
        morseCode.put('Y', "—•——•");
        morseCode.put('Z', "——••");
        morseCode.put('0', "—————");
        morseCode.put('1', "•————");
        morseCode.put('2', "••———");
        morseCode.put('3', "•••——");
        morseCode.put('4', "••••—");
        morseCode.put('5', "•••••");
        morseCode.put('6', "—••••");
        morseCode.put('7', "——•••");
        morseCode.put('8', "———••");
        morseCode.put('9', "————•");
        morseCode.put(' ', "/");

        char[] arr = str.toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            for (Map.Entry<Character, String> value : morseCode.entrySet()) {
                if (value.getKey().equals(arr[i])) {
                    result.append(value.getValue() + ",");
                }
            }
        }
        result = result.deleteCharAt(result.length() - 1);
        return result.toString();
    }
}
