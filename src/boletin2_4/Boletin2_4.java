/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4;

import java.util.Scanner;

/**
 *
 * @author dam1b
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            float numero1,numero2,resto,suma,producto,cociente;
       Scanner sc = new Scanner (System.in);
       System.out.println("Introduce numero1");
       numero1=sc.nextFloat();
       System.out.println("Introduce numero2");
       numero2=sc.nextFloat();
       suma=numero1+numero2;
      System.out.println("suma=" +suma);
       resto=numero1-numero2;
      System.out.println("resto=" +resto);
      producto=numero1*numero2;
      System.out.println("producto=" +producto);
      cociente=numero1/numero2;
      System.out.println("cociente" +cociente);
    
}
    
}
