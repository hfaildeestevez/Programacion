package com.programacion.Boletin2;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float euros, dolares;
        float cambio = 1.19f;
        System.out.println("importe euros: ");
        euros = sc.nextFloat();
        dolares = euros*cambio;
        System.out.println(euros + " cambio = "+ dolares+"$");
    }
}
