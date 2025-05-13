package org.example.HW2;

import java.util.HashMap;
import java.util.Map;

public class LatinMorseToKirillic {
    public static String latinMorseToKyrillic(String str) {
        Map<String, Character> morseCode = new HashMap<>();
        morseCode.put("•—", 'А');
        morseCode.put("—•••", 'Б');
        morseCode.put("•——", 'В');
        morseCode.put("——•", 'Г');
        morseCode.put("—••", 'Д');
        morseCode.put("•", 'Е');
        morseCode.put("•••—", 'Ж');
        morseCode.put("——••", 'З');
        morseCode.put("••", 'И');
        morseCode.put("•———", 'Й');
        morseCode.put("—•—", 'К');
        morseCode.put("•—••", 'Л');
        morseCode.put("——", 'М');
        morseCode.put("—•", 'Н');
        morseCode.put("———", 'О');
        morseCode.put("•——•", 'П');
        morseCode.put("•—•", 'Р');
        morseCode.put("•••", 'С');
        morseCode.put("—", 'Т');
        morseCode.put("••—", 'У');
        morseCode.put("••—•", 'Ф');
        morseCode.put("••••", 'Х');
        morseCode.put("—•—•", 'Ц');
        morseCode.put("———•", 'Ч');
        morseCode.put("————", 'Ш');
        morseCode.put("——•—", 'Щ');
        morseCode.put("•——•—•", 'Ъ');
        morseCode.put("—•——", 'Ы');
        morseCode.put("—••—", 'Ь');
        morseCode.put("•••—•••", 'Э');
        morseCode.put("••——", 'Ю');
        morseCode.put("•—•—", 'Я');
        morseCode.put("—————", '0');
        morseCode.put("•————", '1');
        morseCode.put("••———", '2');
        morseCode.put("•••——", '3');
        morseCode.put("••••—", '4');
        morseCode.put("•••••", '5');
        morseCode.put("—••••", '6');
        morseCode.put("——•••", '7');
        morseCode.put("———••", '8');
        morseCode.put("————•", '9');
        morseCode.put("/", ' ');

        Map<String, Character> twoCharMorseCode = new HashMap<>();
        twoCharMorseCode.put("••••,•—•—", 'Ч');
        twoCharMorseCode.put("••••,•••", 'Ш');
        twoCharMorseCode.put("•,•—", 'Э');
        twoCharMorseCode.put("••—,—•——•", 'Ю');
        twoCharMorseCode.put("•—,—•——•", 'Я');

        StringBuilder result = new StringBuilder();
        String symbol;

        do {
            if (str.contains(",")) { //пока в строке еще остаются запятые - беру символ морзянки от начала строки до запятой не включая её
                symbol = str.substring(0, (str.indexOf(",") + 1 + str.indexOf(",")));
            } else { //когда запятых не осталось - т.е. последний символ - беру просто всю оставшуюся строку с последним символом
                symbol = str;
            }
            if (twoCharMorseCode.keySet().contains(symbol)) {
                for (Map.Entry<String, Character> value : twoCharMorseCode.entrySet()) {
                    if (value.getKey().equals(symbol)) {//ищем символ в мапе
                        result.append(value.getValue());//добавляем его значение в стрингбилдер
                        break;
                    }
                }
            } else {
                symbol = str.substring(0, str.indexOf(","));
                for (Map.Entry<String, Character> value : morseCode.entrySet()) {
                    if (value.getKey().equals(symbol)) {
                        result.append(value.getValue());
                        break;
                    }
                }
            }
            if (symbol.equals(str)) {
                str = "";//если символ последний в строке был - ставим пустое значение
            } else {
                if (symbol.contains(",")) {
                    str = str.substring((str.indexOf(",") + 1 + str.indexOf(",")) + 1); //если нет - обрезаем строку, удаляя символ, который только что нашли
                } else {
                    str = str.substring(str.indexOf(",") + 1);
                }
            }
        } while (!str.isEmpty());


//        do {
//            if (str.contains(",")) { //пока в строке еще остаются запятые - беру символ морзянки от начала строки до запятой не включая её
//                symbol = str.substring(0, str.indexOf(","));
//            } else { //когда запятых не осталось - т.е. последний символ - беру просто всю оставшуюся строку с последним символом
//                symbol = str;
//            }
//            for (Map.Entry<String, Character> value : morseCode.entrySet()) {
//                if (value.getKey().equals(symbol)) {//ищем символ в мапе
//                    result.append(value.getValue());//добавляем его значение в стрингбилдер
//                    break;
//                }
//            }
//            if (symbol.equals(str)) {
//                str = "";//если символ последний в строке был - ставим пустое значение
//            } else {
//                str = str.substring(str.indexOf(",") + 1); //если нет - обрезаем строку, удаляя символ, который только что нашли
//            }
//        } while (!str.isEmpty()); //и делаем цикл пока символ не пустой

        StringBuilder result1 = new StringBuilder(); //и тут переворачиваем строку, была зеркальная
        for (int i = (result.length() - 1); i > -1; i--) {
            result1.append(result.charAt(i));
        }
        return result1.toString();
    }
}
