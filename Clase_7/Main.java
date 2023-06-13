package Clase_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[ARRAY_LENGTH];

        for(int i = 0; i < ARRAY_LENGTH; i++) {
            System.out.print("Introduce un número para la posición " + (i+1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Estos son los números que introdujiste: ");
        for(int number : numbers) System.out.println(number);

        int minNumber , maxNumber, totalSum;
        minNumber = maxNumber = totalSum = numbers[0];

        for(int i = 1; i < ARRAY_LENGTH; i++) {
            totalSum += numbers[i];
            if(numbers[i] < minNumber) minNumber = numbers[i];
            if(numbers[i] > maxNumber) maxNumber = numbers[i];
        }

        System.out.println("Numero mayor: " + maxNumber);
        System.out.println("Numero menor: " + minNumber);

        System.out.println("Promedio de los números: " + totalSum / ARRAY_LENGTH);
    }

    private static final int ARRAY_LENGTH = 5;
}
