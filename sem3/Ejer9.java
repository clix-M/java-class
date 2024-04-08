package org.example.sem3;

import java.util.Scanner;

public class Ejer9 {
    // Cree un programa donde se ingrese el nombre y la edad de 5
    // personas, el programa debe mostrar el nombre de
    //la persona más joven.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var menor = 0;
        var nombre = "";
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            var nombrePersona = sc.next();
            System.out.print("Ingrese la edad de la persona " + (i + 1) + ": ");
            var edad = sc.nextInt();
            if (i == 0) {
                menor = edad;
                nombre = nombrePersona;
            } else {
                if (edad < menor) {
                    menor = edad;
                    nombre = nombrePersona;
                }
            }
        }

        System.out.println("La persona más joven es: " + nombre + " con una edad de: " + menor);
    }
}
