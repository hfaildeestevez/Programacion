/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_1;

import javax.swing.JOptionPane;

/**
 *
 * @author hfe19
 */
public class numero {
    int numero;
    
    
    public numero(){
    int numero = Integer.parseInt( JOptionPane.showInputDialog("introduce numero"));
    
        if (numero>=1){
        System.out.println(numero+ " e positivo");
        }
            
        }
        
       
    }

