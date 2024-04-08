package org.example.sem3;

import java.util.Scanner;

public class Ejer7 {
    //Ingresar el nombre y sueldo de 5 trabajadores el programa debe mostrar el sueldo mayor
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var mayor = 0;
        var nombre = "";
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del trabajador " + (i + 1) + ": ");
            var nombreTrabajador = sc.next();
            System.out.print("Ingrese el sueldo del trabajador " + (i + 1) + ": ");
            var sueldo = sc.nextDouble();
            if (i == 0) {
                mayor = (int) sueldo;
                nombre = nombreTrabajador;
            } else {
                if (sueldo > mayor) {
                    mayor = (int) sueldo;
                    nombre = nombreTrabajador;
                }
            }
        }

        System.out.println("El trabajador con el sueldo mayor es: " + nombre + " con un sueldo de: " + mayor);

    }
}
