package org.example.examen1;

import java.util.Scanner;

//Cree un programa donde se ingrese un numero del 1 al 20 y se
//calcule su factorial. Por ejemplo: Ingreso el numero 5, su factorial sería
//(5*4*3*2*1).
public class Ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 20: ");
        int num = sc.nextInt();

        // Validar que el número esté en el rango correcto
        if (num < 1 || num > 20) {
            System.out.println("El número debe estar entre 1 y 20");
            sc.close();
            return;
        }

        // Calcular el factorial del número
        long factorial = 1;
        for (int i = num; i > 0; i--) {
            factorial *= i;
        }

        System.out.println("El factorial de " + num + " es: " + factorial);

        sc.close();
    }
}
