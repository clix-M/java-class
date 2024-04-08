package org.example.examen1;

import java.util.Scanner;

//Cree un programa donde se ingrese 3 números distintos y nos
//diga cual es el mayor y cuál es el menor.
// puedes usar programacion funcional metodos de la clase Arrays y Stream y Math
public class Ejer6_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }


        // Math.min() y Math.max() son métodos estáticos de la clase Math
        // que permiten obtener el mínimo y el máximo de dos números
        int mayor = Math.max(numeros[0], Math.max(numeros[1], numeros[2]));
        int menor = Math.min(numeros[0], Math.min(numeros[1], numeros[2]));

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);



    }
}
