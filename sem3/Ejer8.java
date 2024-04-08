package org.example.sem3;

import java.util.Scanner;

public class Ejer8 {
    //Cree un programa para calcular cuanto debe pagar una persona que adquirió un
    // producto para pagar en 10 meses.
    // El primer mes pagó 100 ,el segundo 200 , el tercero 300 y así sucesivamente.
    public static void main(String[] args) {
        double total = 0;
        for (int i = 0; i < 10; i++) {
            total += (i + 1) * 100;
        }
        System.out.println("Total a pagar: " + total);


    }
}
