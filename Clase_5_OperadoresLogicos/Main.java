package Clase_5_OperadoresLogicos;

import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final double KM_CONVERSITION = 1.60934;
    public static final int DOG_YEAR = 7;
    public static void main(String[] args) {
        System.out.println();
        calculateDogAge();
        System.out.println();
        calculateKm();
        System.out.println();
        discount();
        System.out.println();
        tip();
        System.out.println();
        randomNumber();
    }

    public static void calculateDogAge() {
        System.out.print("Introduce una edad para el perro: ");
        int dogAge = SCANNER.nextInt();

        System.out.println("Tu perro tiene: " + dogAge * DOG_YEAR + " años.");
    }

    public static void calculateKm() {
        System.out.print("Introduce las millas para convertir a kilómetros: ");
        double miles = SCANNER.nextDouble();

        System.out.println("La conversión a kilómetros de " + miles +  "millas sería: " + miles * KM_CONVERSITION + " km");
    }

    public static void discount() {
        System.out.print("Introduce el precio de un producto: ");
        double price = SCANNER.nextDouble();

        System.out.print("Introduce el porcentaje de descuento que quieres aplicarle: ");
        double discount = SCANNER.nextDouble();

        System.out.println("El precio final es de: $ " + (price - (price * discount / 100)));
    }

    public static void tip() {
        System.out.print("Introduce el total de la cuenta: ");
        double total = SCANNER.nextDouble();

        System.out.print("Introduce el porcentaje de propina que deseas aplicar: ");
        double tip = SCANNER.nextDouble();

        System.out.println("Debés dejar una propina de : $ " + (total * (tip / 100)) + " ;)");
    }

    public static void randomNumber() {
        int number, choice, tries = 0;
        number = (int) (Math.random() * 100) + 1;
        System.out.print("Adivina el nuevo número generado entre el 1 y 100: ");

        do {
            choice = SCANNER.nextInt();
            tries++;

            if(number > choice) System.out.println("Un poco más para arriba...");
            if(number < choice) System.out.println("Un poco más para abajo...");
        } while(number != choice);

        System.out.println("Felicidades! Lo has logrado, el número es " + number + ". Tuviste " + tries + " intentos...");
    }
}
