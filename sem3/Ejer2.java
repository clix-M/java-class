package org.example.sem3;

import java.util.Scanner;

public class Ejer2 {
    //Cree un programa en donde se ingrese el total de kilos de azúcar, si la venta es menor a 100 kilos
    // se cobrara 5 soles, de lo contario 4, mostrar el total a pagar.
    // hacer con programacion funcional
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el total de kilos de azúcar: ");
        double kilos = sc.nextDouble();

        double total = kilos < 100 ? kilos * 5 : kilos * 4;
        System.out.println("El total a pagar es: " + total + " soles");

    }
}
