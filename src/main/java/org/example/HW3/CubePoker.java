package org.example.HW3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CubePoker {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quantity of cubes");
        List<Integer> results = new ArrayList<>();

        if (sc.hasNextInt()) {
            int cubesQuantity = sc.nextInt();
            if (cubesQuantity < 1) {
                System.out.println("You should throw 1 dice at least");
            } else if (cubesQuantity > 10) {
                System.out.println("Too many cubes, you are cheater!");
            } else {
                System.out.println("You entered " + cubesQuantity + " dices. Throwing your dices...");
                Thread.sleep(3000);
                System.out.println("Your results are: ");
                for (int i = 0; i < cubesQuantity; i++) {
                    Random r = new Random();
                    int cube = r.nextInt(1, 7);
                    results.add(cube);
                    System.out.println("Cube " + (i + 1) + " result: " + cube);
                }
            }
        } else {
            System.out.println("Sorry, but this is clearly not a valid number. Restart the program and try again!");
        }
    }
}
