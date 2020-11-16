package com.programacion.Boletin2;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float num1,num2;
        float suma,resta,producto,cociente;
        System.out.println("primer número: ");
        num1 = sc.nextFloat();
        System.out.println("segundo número: ");
        num2 = sc.nextFloat();
        suma = num1+num2;
        resta = num1-num2;
        producto = num1*num2;
        cociente = num1/num2;
        System.out.println("suma = " + suma);
        System.out.println("resta = " + resta);
        System.out.println("producto = " + producto);
        System.out.println("cociente = " + cociente);
    }
}
