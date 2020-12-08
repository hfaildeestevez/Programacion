/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8_7;

import javax.swing.JOptionPane;

/**
 *
 * @author hfe19
 */
public class Boletin8_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroFigura = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el número para figura \n" +
                "1-Cuadrado\n" +
                "2-Triángulo\n" +
                "3-Círculo"), JOptionPane.QUESTION_MESSAGE);

        Figura figura = new Figura(numeroFigura);
        figura.verSuperficie();

    }
}
    
    

