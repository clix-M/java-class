package org.example.sem3;

import java.util.Scanner;

public class Ejer4 {
    // Crear un programa que solo permita ingresar números negativos, si se
    // ingresa un numero positivo se acabara el
    //programa y se hará la multiplicación de los números negativos ingresados.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int multiplicacion = 1;

        while (true) {
            System.out.print("Ingrese un número: ");
            int num = sc.nextInt();

            if (num < 0) {
                multiplicacion *= num;
            } else {
                break;
            }
        }

        System.out.println("La multiplicación de los números negativos es: " + multiplicacion);
    }

}
