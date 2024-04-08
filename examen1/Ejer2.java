package org.example.examen1;

import java.util.Scanner;

// Cree un programa que solo permita ingresar números negativos,
//cuando se ingrese un numero positivo el programa acabará y los números
//negativos de multiplicarán y sumarán
public class Ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Variables para almacenar la suma y el producto de los números negativos
        int suma = 0;
        int producto = 1;
        int num;

        // Leer números hasta que se ingrese un número positivo
        do {
            System.out.println("Ingrese un número: ");
            num = sc.nextInt();
            // Si el número es negativo, se suma y multiplica
            if (num < 0) {
                suma += num;
                producto *= num;
            }
            // Si el número es positivo, se sale del bucle
        } while (num < 0);

        System.out.println("La suma de los números negativos es: " + suma);
        System.out.println("El producto de los números negativos es: " + producto);

        sc.close();
    }
}
