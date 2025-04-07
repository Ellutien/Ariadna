package org.example;

import java.util.*;

public class NewLesson {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>(); //16 элементов по умолчанию - ключ (уникальный), значение
        map.put("1", "Petr"); //добавить элемент
        map.put("2", "Vasiliy");
        map.put("3", "Ivan");

        String str = map.get("3");
        System.out.println(str);

        Map<String, String> map2 = new HashMap<>();

        map2.put("1", "Petr");
        map2.put("2", "Vasiliy");
        map2.put("3", "Ivan");
        map2.put("4", "Dimitry");

        System.out.println(map.equals(map2));//сначала сравниваем ключи, потом значения
        //сначала хэш, потом equals

        for (String d : map.keySet()) {
            System.out.println(d);
        }
        for (String d : map2.values()) {
            System.out.println(d);
        }
        List<String> list = new ArrayList<>();

        for (Map.Entry<String, String> m : map.entrySet()) {
            System.out.println(m);
        }

        int[] arr = {4, 55, 213, 435, 435, 567, 76, 678, 7};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j - 1] > arr[j]) {
                    int m = 0;
                    m = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = m;
                }
            }
        }
        System.out.println(Arrays.toString(arr));



    }
}
