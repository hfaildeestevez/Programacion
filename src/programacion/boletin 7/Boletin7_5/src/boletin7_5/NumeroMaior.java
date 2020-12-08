/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_5;

import javax.swing.JOptionPane;

/**
 *
 * @author hfe19
 */
public class NumeroMaior {
 float numero1;
 float numero2;
 float numero3;
 
 public NumeroMaior(){
  numero1=Integer.parseInt(JOptionPane.showInputDialog("introduce o primer numero"));
  numero2=Integer.parseInt(JOptionPane.showInputDialog("introduce o segundo numero"));
  numero3=Integer.parseInt(JOptionPane.showInputDialog("introduce o terceiro numero"));
  
  if (numero1>numero2 && numero1>numero3){
      System.out.println(numero1+ " e maior que "+numero2 +" e maior que "+ numero3);}
  else if (numero2>numero1 && numero2>numero3){
       System.out.println(numero2+ " e maior que "+numero1 +" e maior que " +numero3);}
 
  else{ System.out.println(numero3+ " e maior que "+numero1 + " e maior que "+ numero2);}
  
  }
 }
         
  
 
    
