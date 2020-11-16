
package com.programacion.Boletin6;


public class Boletin6_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circulo obx1 = new Circulo();
        Circulo obx2 = new Circulo(3.2);
        System.out.println("Radio del obx1: "+obx1.getRadio());
        obx1.setRadio(4);
        System.out.println("novo valor do radio obx1: "+obx1.getRadio());
        System.out.println("area del obx2: "+ obx2.calcularArea());
        System.out.println("lonxitude do obx2 e: "+ obx2.calcularLonxitude());
                
        
    }
    
}
