package org.example.sem3;

import java.util.Scanner;

public class Ejer1 {
    // Cree un programa en donde se ingrese 5 números y muestre cual es el numero menor
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var menor = 0;
        for (int i = 0; i < 5; i++) {

            System.out.print("Ingrese un número: " + (i + 1) + ": ");
            int num = sc.nextInt();

            if (i == 0) {
                menor = num;
            } else {
                if (num < menor) {
                    menor = num;
                }
            }
        }

        System.out.println("El número menor es: " + menor);
    }
}
