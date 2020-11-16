package com.programacion.Boletin2;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float millasMariñas,metros;
        System.out.println("millas mariñas a cambiar: ");
        millasMariñas = sc.nextFloat();
        metros = millasMariñas*1852;
        System.out.println(millasMariñas + "millas mariñas cambio = " + metros+" metros ");

    }
}
