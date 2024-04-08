package org.example.examen1;

import java.util.Scanner;

//Crear un programa en donde ingrese un numero de 5 dígitos,
//por ejemplo “12345” el programa debe separar las cifras de los numero la primera
//cifra es “1”, la segunda cifra es “2”, la tercera cifra es “3”, la cuarta cifra es “4”, y
//la quinta cifra es “5”.
public class Ejer1 {
    public static void main(String[] args) {
        // Leer un número de 5 dígitos
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número de 5 dígitos: ");
        int num = sc.nextInt();

        String numStr = String.valueOf(num); // Convertir el número a String

        // Recorrer el String e imprimir cada cifra
        for (int i = 0; i < numStr.length(); i++) {
            // Se suma 1 para que la cifra sea más entendible
            System.out.println("La cifra " + (i + 1) + " es: " + numStr.charAt(i));
        }

        sc.close();
    }
}
