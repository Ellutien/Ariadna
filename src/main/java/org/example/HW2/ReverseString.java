package org.example.HW2;

public class ReverseString {
    public static String reverseString (String str) {
        StringBuilder result = new StringBuilder();
        for (int i = (str.length() - 1); i > -1; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
