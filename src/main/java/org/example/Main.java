package org.example;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

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
