package org.example.examen1;

import java.util.Scanner;

//Cree un programa donde se ingrese la hora, minutos y segundos,
//la hora en formato de (00 a 24), minutos y segundos de (00 a 60), si el programa
//muestra la hora correcta continuará “05: 50: 00 am”; de lo contrario el programa
//terminará.
public class Ejer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora, minutos, segundos;

        System.out.println("Ingrese la hora: ");
        hora = sc.nextInt();
        System.out.println("Ingrese los minutos: ");
        minutos = sc.nextInt();
        System.out.println("Ingrese los segundos: ");
        segundos = sc.nextInt();

        if (hora < 0 || hora > 24 || minutos < 0 || minutos > 60 || segundos < 0 || segundos > 60) {
            System.out.println("Hora incorrecta");
            sc.close();
            return;
        }

        System.out.println("La hora es: " + hora + ":" + minutos + ":" + segundos);



        sc.close();
    }
}
