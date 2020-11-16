
package com.programacion.Boletin6;


public class Boletin6_1 {

   
    public static void main(String[] args) {
        
        Coche mercedes = new Coche();
        System.out.println("a velocidade do coche é: "+ coche.getVelocidade()+" km/h");
        Coche ford = new Coche(120);
        ford.acelerar(60);
        ford.frenar(170);
    }
    
}
