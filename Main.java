package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // ingrese tres numeros y mostrar ordenados de mayor a menor
        // usar programacion funcional

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int num3 = scanner.nextInt();

        int[] numeros = {num1, num2, num3};

        // po funcion lambda
        Arrays.stream(numeros)
                .boxed()
                .sorted((a, b) -> b - a)
                .forEach(System.out::println);

    }



}