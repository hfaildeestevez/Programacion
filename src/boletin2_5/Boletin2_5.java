/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_5;

import java.util.Scanner;

/**
 *
 * @author dam1b
 */
public class Boletin2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          float metros,millasmar;
          Scanner sc = new Scanner (System.in);
       System.out.println("Introducemillasmar");
       millasmar=sc.nextFloat();
       metros=1852*millasmar;
       System.out.println("metros" +metros);
       
    
    }
    
}
