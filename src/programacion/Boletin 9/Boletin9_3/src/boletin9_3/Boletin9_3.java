/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_3;

/**
 *
 * @author hfe19
 */
public class Boletin9_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Validacion rectangulo1 = new Validacion();
        Validacion rectangulo = Validacion.getInstance();
        rectangulo.pedirDatos();
        rectangulo.validar(rectangulo);
        Validacion rectangulo2= Validacion.getInstance();
        rectangulo2.pedirDatos();
        rectangulo2.validar(rectangulo2);
        System.out.println(rectangulo);
    }
}

    

