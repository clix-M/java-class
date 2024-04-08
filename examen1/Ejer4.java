package org.example.examen1;

import java.util.Scanner;

//Cree un programa donde se ingrese los nombres y notas (00 a
//20) de 5 estudiantes, el programa debe mostrar quienes aprobaron (mayor a
//10,5) y debe mostrar quienes se desaprobaron (10.4) y cuantos puntos les falta
//para aprobar.
public class Ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[5];
        double[] notas = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
            System.out.println("Ingrese la nota del estudiante " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("Estudiantes aprobados:");
        for (int i = 0; i < 5; i++) {
            if (notas[i] > 10.5) {
                System.out.println(nombres[i]);
            }
        }

        System.out.println("Estudiantes desaprobados:");
        for (int i = 0; i < 5; i++) {
            if (notas[i] < 10.4) {
                System.out.println(nombres[i] + " le faltan " + (10.5 - notas[i]) + " puntos para aprobar");
            }
        }

        sc.close();
    }
}
