package org.example.sem3;

import java.util.Scanner;

public class Ejer5 {
    // Crear un programa donde se ingresen 10 números positivos, negativos o decimales,
    // el programa debe mostrar la
    //suma de los negativos y la multiplicación de los positivos.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sumaNegativos = 0;
        double multiplicacionPositivos = 1;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número: ");
            double num = sc.nextDouble();

            if (num < 0) {
                sumaNegativos += num;
            } else {
                multiplicacionPositivos *= num;
            }
        }

        System.out.println("La suma de los números negativos es: " + sumaNegativos);
        System.out.println("La multiplicación de los números positivos es: " + multiplicacionPositivos);

    }
}
