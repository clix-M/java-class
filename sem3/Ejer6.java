package org.example.sem3;

import java.util.Scanner;

public class Ejer6 {
    //. Crear un programa donde se ingrese la nota de 3 estudiantes y
    // se muestre quienes aprobaron (>=10,5) y
    //desaprobaron (<=10,4)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
            double nota = sc.nextDouble();
            if (nota >= 10.5) {
                System.out.println("El estudiante " + (i + 1) + " aprobó");
            } else {
                System.out.println("El estudiante " + (i + 1) + " desaprobó");
            }
        }


    }
}
