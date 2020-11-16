package com.programacion.Boletin3;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float PT,Pp,PorcentajeDescuento;
        System.out.println("precio tarifa: ");
        PT = sc.nextFloat();
        System.out.println("precio pagado: ");
        Pp = sc.nextFloat();
        PorcentajeDescuento = (PT-Pp)*100/PT;
        System.out.println("descuento  " + PorcentajeDescuento + "%");

    }
}
