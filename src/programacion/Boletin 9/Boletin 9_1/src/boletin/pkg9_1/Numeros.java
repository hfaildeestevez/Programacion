/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg9_1;

import javax.swing.JOptionPane;

/**
 *
 * @author hfe19
 */
public class Numeros {
   private int numero;
   public void leerNumero() {
        int contadorPositivos=0,contadorNegativos=0,contadorCeros=0;
        for (int i = 0, j = 1; i < 10; i++, j++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
            if (numero < 0) {
                contadorNegativos ++;
            }
                else if (numero > 0) {
                    contadorPositivos ++;
                }
                else
                contadorCeros ++;
        }
        JOptionPane.showMessageDialog(null,"La cantidad de positivos son: " + contadorPositivos + ", de negativos son: " + contadorNegativos + " y de 0 es :" + contadorCeros);
    }
}
            
     