package org.example.examen1;

import java.util.Arrays;
import java.util.Scanner;

//Cree un programa donde se ingrese 3 números distintos y nos
//diga cual es el mayor y cuál es el menor.
// puedes usar programacion funcional

public class Ejer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int mayor = mayor(numeros);
        int menor = menor(numeros);

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

    }

    public static int mayor(int[] numeros) {
        return Arrays.stream(numeros).max().getAsInt();
    }

    public static int menor(int[] numeros) {
        return Arrays.stream(numeros).min().getAsInt();
    }


}
