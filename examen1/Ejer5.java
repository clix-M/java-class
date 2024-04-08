package org.example.examen1;

import java.util.Scanner;

//Cree un programa donde se escriba números del 1 al 99999, el
//programa debe remplazar los números “5” cada vez que se escriba, por ejemplo:
//escribimos “10551” el programa remplazara los números “5” por un guion “ - “, el
//resultado será “10--1”.
public class Ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 99999: ");
        int num = sc.nextInt();

        // Validar que el número esté en el rango correcto
        if (num < 1 || num > 99999) {
            System.out.println("El número debe estar entre 1 y 99999");
            sc.close();
            return;
        }

        String numStr = String.valueOf(num);
        // Reemplazar los 5 por guiones
        String numStrReplaced = numStr.replace('5', '-');

        System.out.println("El número con los 5 reemplazados es: " + numStrReplaced);

        sc.close();


    }
}
