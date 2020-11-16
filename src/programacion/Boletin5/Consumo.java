
package com.programacion.Boletin5;


public class Consumo {
    
    //atributos
    private float km;
    private float litros;
    private float vMed;
    private float pGas;
    
    
    //Constructores
    public Consumo(){
        
    }
    public Consumo (float km,float litros,float vMed,float pGas){
        
        this.km = km;
        this.litros = litros;
        this.vMed = vMed;
        this.pGas = pGas;
        
        
    }    
    
    
    //metodos de acceso (getters y setters)
    
    
public float getTempo (){
    float tempo;
    tempo = km/vMed;
    return tempo;
    
}
public float getVMed(){
    return this.vMed;
}
public float consumoMedio (){
    float consumo;
    consumo = litros/km*100;
    return consumo;
    
} 

public float consumoEuros(){
    float consumo;
    km = 100;
    consumo = (consumoMedio())*pGas;
    return consumo;
}
public void setKms(float km){
    this.km = km;

}

public void setLitros(float litros){
    this.litros = litros;
    
}


public void setvMed(float vMed){
    this.vMed =vMed;
}


public void setPGas (float pGas){
    this.pGas = pGas;
}

}
