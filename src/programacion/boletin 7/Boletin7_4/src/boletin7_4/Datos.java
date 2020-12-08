/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_4;

import javax.swing.JOptionPane;

/**
 *
 * @author hfe19
 */
public class Datos {
    float peso1;
    float peso2;
    String nome1;
    String nome2;
    
    public Datos(){
    nome1 = JOptionPane.showInputDialog("introduce o primer nome");
    peso1=Float.parseFloat(JOptionPane.showInputDialog("introduce o primer peso"));
    nome2 = JOptionPane.showInputDialog("introduce o segundo nome");   
    peso2=Float.parseFloat(JOptionPane.showInputDialog("introduce o segundo peso"));
    if (peso1>peso2){ 
        System.out.println(nome1+ " pesa "+(peso1-peso2)+" kg mais");}
    else{
        System.out.println(nome2+" pesa "+(peso2-peso1)+" kg mais");}
        
    }
    
    }
    

