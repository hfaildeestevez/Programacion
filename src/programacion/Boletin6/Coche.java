
package com.programacion.Boletin6;


public class Coche {
    
        //atributos
    private int velocidade;
   
    
    //construtor 
    public Coche (){
    velocidade = 0;
        
    }
    public Coche (int Ve){
    velocidade = Ve;
    
}
public int getVelocidade(){
    
    return velocidade;

}
public void acelerar (int valor){
velocidade = velocidade + valor;
System.out.println("A velocidade incrementada é de " + velocidade+" km/h");

}
public void frenar (int menos){
velocidade = velocidade - menos;
System.out.println("A velocidade decrementada é de " + velocidade+" km/h");
}
    
}
