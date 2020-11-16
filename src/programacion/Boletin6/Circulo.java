
package com.programacion.Boletin6;


public class Circulo {
    
        //atributos
    
    private double radio;
    public final double Pi = 3.14;
    
    public Circulo(){
        
    }
    public Circulo(double r){
        
        radio= r;
        
    }
    
    //metodos
    public void setRadio(double r){
        radio=r;
    }
   
    public double getRadio(){
        return radio;
    }
    //metodos calcular
    public double calcularArea(){
        double area;
        area=Math.pow(radio,2)*Pi;
        return area;
        
    }
    public double calcularLonxitude(){
        double lonxitude;
        lonxitude = 2*radio*Math.PI;
        return lonxitude;
    }
            
            
    
   
}
