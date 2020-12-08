/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg7_2;


import javax.swing.JOptionPane;

/**
 *
 * @author hfe19
 */
public class NumerosShort {
    
    short a;
    short b;
 public NumerosShort (){
     short a=Short.parseShort(JOptionPane.showInputDialog("Introduce o primeiro numero"));
     short b=Short.parseShort(JOptionPane.showInputDialog("Introduce o segundo numero"));
     
     if (a>=b){
     System.out.println("A resta de a e b é " + (a-b));
    }else{
     System.out.println("A suma de a e b é " + (a+b));}
 }

             
           
     
 }
     
    
     

