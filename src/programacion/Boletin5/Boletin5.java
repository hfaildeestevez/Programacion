
package com.programacion.Boletin5;

public class Boletin5 {

    public static void main(String[] args) {
        
        Consumo consume = new Consumo();
        consume.setLitros(50);
   
        consume.setPGas(1.57f);
       
        Consumo consumo1 = new Consumo(100,60,120,1.57f);
        
       
        System.out.println("Consumo medio = "+String.format("%.2f", consumo1.consumoMedio())+" Litros cada 100 km.");
        consumo1.setLitros(20);
        System.out.println("Velocidad media ="+ consumo1.getVMed()+" Km/h.");
        System.out.println(consume.getTempo()+" s");
        System.out.println(consumo1.getTempo()+" s");
        
       
    }
    
    
}
