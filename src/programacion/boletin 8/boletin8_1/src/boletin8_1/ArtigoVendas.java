/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8_1;

import javax.swing.JOptionPane;

/**
 *
 * @author hfe19
 */
public class ArtigoVendas {
    String nomeArtigo;
    float numeroVentas;
    
  public ArtigoVendas(){
      nomeArtigo=JOptionPane.showInputDialog("introduce o nome do artigo");
      float numeroVentas=Float.parseFloat(JOptionPane.showInputDialog("introduce o numero do ventas"));
      
     if (numeroVentas<=100){
         System.out.println("O número de ventas do artigo " +nomeArtigo +" e baixo");}
     else if (numeroVentas<100 && numeroVentas<=500){
         System.out.println("O número de ventas do artigo "+nomeArtigo +" e medio");}
      else if (numeroVentas>500 && numeroVentas<=1000){
         System.out.println("O número de ventas do artigo "+nomeArtigo + " e alto");}
      else{
          System.out.println("O artigo " +nomeArtigo+" e de primeira necesidade");}
  }
}
