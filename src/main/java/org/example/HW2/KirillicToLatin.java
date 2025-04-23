package org.example.HW2;

import java.util.HashMap;
import java.util.Map;

public class KirillicToLatin {
    public static String kyrToLatin (String str) {
        Map<Character, String> kyrToLatin = new HashMap<>();
        kyrToLatin.put('А', "A");
        kyrToLatin.put('Б', "B");
        kyrToLatin.put('В', "W");
        kyrToLatin.put('Г', "G");
        kyrToLatin.put('Д', "D");
        kyrToLatin.put('Е', "E");
        kyrToLatin.put('Ё', "YO");
        kyrToLatin.put('Ж', "V");
        kyrToLatin.put('З', "Z");
        kyrToLatin.put('И', "I");
        kyrToLatin.put('Й', "J");
        kyrToLatin.put('К', "K");
        kyrToLatin.put('Л', "L");
        kyrToLatin.put('М', "M");
        kyrToLatin.put('Н', "N");
        kyrToLatin.put('О', "O");
        kyrToLatin.put('П', "P•");
        kyrToLatin.put('Р', "R");
        kyrToLatin.put('С', "S");
        kyrToLatin.put('Т', "T");
        kyrToLatin.put('У', "U");
        kyrToLatin.put('Ф', "F");
        kyrToLatin.put('Х', "H");
        kyrToLatin.put('Ц', "C");
        kyrToLatin.put('Ч', "CH");
        kyrToLatin.put('Ш', "SH");
        kyrToLatin.put('Щ', "Q");
        kyrToLatin.put('Ъ', "");
        kyrToLatin.put('Ы', "Y");
        kyrToLatin.put('Ь', "");
        kyrToLatin.put('Э', "AE");
        kyrToLatin.put('Ю', "YU");
        kyrToLatin.put('Я', "YA");
        kyrToLatin.put(' ', " ");
        kyrToLatin.put('0', "0");
        kyrToLatin.put('1', "1");
        kyrToLatin.put('2', "2");
        kyrToLatin.put('3', "3");
        kyrToLatin.put('4', "4");
        kyrToLatin.put('5', "5");
        kyrToLatin.put('6', "6");
        kyrToLatin.put('7', "7");
        kyrToLatin.put('8', "8");
        kyrToLatin.put('9', "9");

        char[] arr = str.toUpperCase().toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            for (Map.Entry<Character, String> value : kyrToLatin.entrySet()) {
                if (value.getKey().equals(arr[i])) {
                    result.append(value.getValue());
                }
            }
        }
        return result.toString();
    }
}
