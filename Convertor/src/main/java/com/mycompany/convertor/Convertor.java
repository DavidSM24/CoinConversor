/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.convertor;

import java.util.Scanner;

/**
 *
 * @author dsmorales
 */
public class Convertor {

    static int contInput = 0;
    static boolean continuee = true;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int input = 0;
        double moneda = 0.0;

        while (continuee) {

            try {
                System.out.println("Eliga una opción de conversión:\n"
                        + "1. Euro a Sol Peruano.\n"
                        + "2. Sol Peruano a Euro.");

                input = sc.nextInt();

                if (input == 1) {
                    System.out.print("Introduzca un valor: ");
                    moneda = sc.nextDouble();

                    System.out.println("El resultado es: " + moneda * 3.97);

                    continuee = AskContinue();

                } else if (input == 2) {
                    System.out.print("Introduzca un valor: ");
                    moneda = sc.nextDouble();

                    System.out.println("El resultado es :" + moneda * 0.25);
                    continuee = AskContinue();

                } else {
                    System.out.println("Opción incorrecta, inténtelo de nuevo.");
                }
            } catch (Exception e) {
                System.out.println("Inserte un valor numérico.");
                continuee = true;
                sc = new Scanner(System.in);
            }

        }

    }

    public static boolean AskContinue() {
        System.out.println("¿Desaea volver a introducir moneda?\n"
                + "1. Sí.\n"
                + "2. No.");

        contInput = sc.nextInt();
        continuee = contInput == 1;
        return continuee;
    }

}
