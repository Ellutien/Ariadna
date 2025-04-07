package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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



    }
}
