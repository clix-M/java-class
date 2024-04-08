package org.example.sem3;

import java.util.Scanner;

public class Ejer3 {
    //Cree un programa donde se ingresen 10 ventas, se muestren las
    // ventas menores a 100 soles y nos muestre el
    //total vendido.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese la venta " + (i + 1) + ": ");
            double venta = sc.nextDouble();
            if (venta < 100) {
                System.out.println("Venta menor a 100: " + venta);
            }
            total += venta;
        }
        System.out.println("Total vendido: " + total);
    }
}
