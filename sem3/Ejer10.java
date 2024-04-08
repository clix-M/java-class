package org.example.sem3;

import java.util.Scanner;

public class Ejer10 {
    // Cree un programa donde se ingrese la cantidad en segundos, el programa debe mostrar cuantos segundos faltan
    //para se conviertan en minutos y horas.
    // ejemplo ingreso 59 sec y me tendria que decir que me falta 1 segundo para un minuro y para una hora me falta
    // 59 minutos y 59 segundos
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de segundos: ");
        int segundos = sc.nextInt();


        int segundosRestantes = segundos % 60;
        int SECMINUTOS = 60;
        int SECHOURES = 3600;


        System.out.println("Faltan " + (SECMINUTOS - segundosRestantes) + " segundos para un minuto");

        System.out.println("Faltan " + (SECHOURES - segundos) + " segundos para un minuto");


    }
}
