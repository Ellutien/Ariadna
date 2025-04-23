package org.example.HW2;
import java.util.HashMap;
import java.util.Map;

//-Создать проект (убедиться, что используется 17 джава)
//-В методе main создать любую строку, но обязательно фразу с пробелами
//-В главном классе (где метод main, но за пределами самого метода создать метод,
//   который возвращает строку и в качестве параметра принимает строку,
//   сам метод переводит русские цифры в арабские и возвращает уже новую строку на арабском языке
//- Создать ещё метод, который возвращает строку и принимает строку в качестве параметра,
//    метод просто переворачивает строку из параметра и возвращает уже развёрнутую  наоборот.
//- Создать метод, который возвращает строку и принимает строку,
//    он должен полученную строку из параметров перевести в азбуку Морзе
//    ( стоит заметить, что знаки Морзе в новой строке должны быть разделены между собой запятыми, для удобочтения)
//И финал:
//В методе main вызвать 1 метод передать туда имеющуюся фразу, которую создавали в начале,
//затем второй метод, в который передать уже изменённую строку первым методом,
//затем третий метод, в который передать изменённую вторым методом строку

public class Alchemy {
    public static void main(String[] args) {

// В методе main создать любую строку, но обязательно фразу с пробелами

        String str = "А зачем ему два или три меча";
        //String str = "Один всего один, и он не один";

//И финал:
//В методе main вызвать 1 метод передать туда имеющуюся фразу, которую создавали в начале,
//затем второй метод, в который передать уже изменённую строку первым методом,
//затем третий метод, в который передать изменённую вторым методом строку

        String finMetod1 = numbersToArabic(str);
        //System.out.println(finMetod1);

        String finMetod2 = reverseString(finMetod1);
        //System.out.println(finMetod2);

        String finMetod3 = kyrillicToMorseCode(finMetod2);
        //System.out.println(finMetod3);

//Сложновое пошло:
//Фраза на русском
//Фраза на английском
//Реверс фраза на английском
//Морзе версия реверса на английском
//А потом из последнего получить исходную фразу на русском
        System.out.println(str.toUpperCase());
        System.out.println(kyrToLatin(str));
        System.out.println(reverseString(kyrToLatin(str)));
        System.out.println(latinToMorseCode((reverseString(kyrToLatin(str)))));
        System.out.println(latinMorseToKyrillic(latinToMorseCode((reverseString(kyrToLatin(str))))));
    }

//    В главном классе (где метод main, но за пределами самого метода создать метод,
//    который возвращает строку и в качестве параметра принимает строку,
//    сам метод переводит русские цифры в арабские и возвращает уже новую строку на арабском языке

    public static String numbersToArabic (String str) {
        Map<String, String> arabicNumbers = new HashMap<>();
        arabicNumbers.put("ноль", "0");
        arabicNumbers.put("один", "1");
        arabicNumbers.put("два", "2");
        arabicNumbers.put("три", "3");
        arabicNumbers.put("четыре", "4");
        arabicNumbers.put("пять", "5");
        arabicNumbers.put("шесть", "6");
        arabicNumbers.put("семь", "7");
        arabicNumbers.put("восемь", "8");
        arabicNumbers.put("девять", "9");

        for (Map.Entry<String, String> value : arabicNumbers.entrySet()) {
            str = str.replace(value.getKey(), value.getValue());
        }
        return str;
    }

//    Создать ещё метод, который возвращает строку и принимает строку в качестве параметра,
//    метод просто переворачивает строку из параметра и возвращает уже развёрнутую  наоборот.

    public static String reverseString (String str) {
        StringBuilder result = new StringBuilder();
        for (int i = (str.length() - 1); i > -1; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

//      Создать метод, который возвращает строку и принимает строку,
//      он должен полученную строку из параметров перевести в азбуку Морзе
//      ( стоит заметить, что знаки Морзе в новой строке должны быть разделены между собой запятыми, для удобочтения)

    public static String kyrillicToMorseCode(String str) {
        Map<Character, String> morseCode = new HashMap<>();
        morseCode.put('А', "•—");
        morseCode.put('Б', "—•••");
        morseCode.put('В', "•——");
        morseCode.put('Г', "——•");
        morseCode.put('Д', "—••");
        morseCode.put('Е', "•");
        morseCode.put('Ё', "•");
        morseCode.put('Ж', "•••—");
        morseCode.put('З', "——••");
        morseCode.put('И', "••");
        morseCode.put('Й', "•———");
        morseCode.put('К', "—•—");
        morseCode.put('Л', "•—••");
        morseCode.put('М', "——");
        morseCode.put('Н', "—•");
        morseCode.put('О', "———");
        morseCode.put('П', "•——•");
        morseCode.put('Р', "•—•");
        morseCode.put('С', "•••");
        morseCode.put('Т', "—");
        morseCode.put('У', "••—");
        morseCode.put('Ф', "••—•");
        morseCode.put('Х', "••••");
        morseCode.put('Ц', "—•—•");
        morseCode.put('Ч', "———•");
        morseCode.put('Ш', "————");
        morseCode.put('Щ', "——•—");
        morseCode.put('Ъ', "•——•—•");
        morseCode.put('Ы', "—•——");
        morseCode.put('Ь', "—••—");
        morseCode.put('Э', "•••—•••");
        morseCode.put('Ю', "••——");
        morseCode.put('Я', "•—•—");
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

        str = str.toUpperCase();
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

        StringBuilder result = new StringBuilder();
        String symbol;

        do {
            if (str.contains(",")) {
                symbol = str.substring(0, str.indexOf(","));
            } else {
                symbol = str;
            }
            for (Map.Entry<String, Character> value : morseCode.entrySet()) {
                if (value.getKey().equals(symbol)) {
                    result.append(value.getValue());
                    break;
                }
            }
            if (symbol.equals(str)) {
                str = "";
            } else {
                str = str.substring(str.indexOf(",") + 1);
            }
        } while (!str.isEmpty());

        StringBuilder result1 = new StringBuilder();
        for (int i = (result.length() - 1); i > -1; i--) {
            result1.append(result.charAt(i));
        }
        return result1.toString();
    }
}

