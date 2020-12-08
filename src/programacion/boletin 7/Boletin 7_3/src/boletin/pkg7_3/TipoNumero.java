/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg7_3;

import javax.swing.JOptionPane;

/**
 *
 * @author hfe19
 */
public class TipoNumero {
    float numero;
 
   public TipoNumero(){
       
     Float numero = Float.parseFloat(JOptionPane.showInputDialog("introduce numero"));
     if (numero>0){
     System.out.println("o número "+numero+" é postivo");}
     else if (numero<0){
     System.out.println("o número "+ numero+" é negativo");}
     else{
     System.out.println("o número "+ numero+" é cero");
     }
      
   }
    
   
}
