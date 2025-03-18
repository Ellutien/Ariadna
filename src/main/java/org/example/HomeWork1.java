package org.example;

import java.util.Arrays;

public class HomeWork1 {

    public static void main(String[] args) {

        //1) Дан массив целых чисел со следующими значениями: 4, 7, 15, 73, 24, 2, 31, 53
        //Задача : создать массив и про инициализировать его, затем найти среднее значение (подумать какого типа переменная будет среднего значения) вывести его в консоль (Arrays.toString())

        int[] array = new int[]{4, 7, 15, 73, 24, 2, 31, 53};

        int sum = 0;
        int med;
        for (int i : array) {
            sum += i;
        }
        med = sum / array.length;
        System.out.println("Array: " + Arrays.toString(array) + "\n" +
                "The average value of array: " + med)
        ;

        //2) Взять тот же массив, что и в первом задании и найти число, которое максимально близко расположено к среднему значению и вывести его в консоль

        int[] arr = new int[array.length];
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] - med >= 0) {
                arr[i] = array[i] - med;
            } else {
                arr[i] = (array[i] - med) * -1;
            }
        }
        double minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minDiff) {
                minDiff = arr[i];
                result = array[i];
            }
        }
        System.out.print("Closest to average: ");
        System.out.println(result);

        //3) Опять тот же массив - разверните его) хочу чтобы первый элемент стал последним, а последний первым и так далее

        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[(array.length - 1) - i];
        }
        System.out.println(Arrays.toString(array2));

        //4) Дано несколько массивов
        //1,0,0,1
        //2,3,4,3,1
        //1000001000001
        //765828567
        //Задача : проверить каждый из них  на тот, что он палиндром, то есть зеркальный или нет
        //Результат вывести в форме boolean
        //По последнему если почитаете как сделать метод и просто вызвать его, передав в качестве параметра массив, будет шикарно)

        int[] arr1 = new int[]{1, 0, 0, 1};
        int[] arr2 = new int[]{2, 3, 4, 3, 1};
        int[] arr3 = new int[]{1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1};
        int[] arr4 = new int[]{7, 6, 5, 8, 2, 8, 5, 6, 7};

        System.out.println(isPalindrom(arr4));

    }

    public static boolean isPalindrom(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[(arr.length - 1) - i]) {
                return false;
            }
        } return true;
    }
}
