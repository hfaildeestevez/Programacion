
package com.programacion.Boletin4;


public class Boletin4 {

    public static void main(String[] args) {
      
       Libro obxLibro1 = new Libro ();
       Libro obxLibro2 = new Libro("Exiliado por vontade","Héctor",1998,(short)235,10.5f);
       /* System.out.println("Título: "+obxLibro1.getTitulo()+" Autor: "+ obxLibro1.getAutor()+" año: "+obxLibro1.getAno()+" Nº de páginas: "+ obxLibro1.getNumPagina()+" Valoración: "+ obxLibro1.getValoracion());
       System.out.println("Título: "+obxLibro2.getTitulo()+" Autor: "+ obxLibro2.getAutor()+" año: "+obxLibro2.getAno()+" Nº de páginas: "+ obxLibro2.getNumPagina()+" Valoración: "+ obxLibro2.getValoracion());*/
       obxLibro1.amosar();
       obxLibro2.amosar();
       
       obxLibro1.setTitulo("Libro1");
       obxLibro1.setAutor("Héctor");
       obxLibro1.setNumPaginas((short)150);
       obxLibro1.setAno(1234);
       obxLibro1.setValoracion(11.1f);
       
       obxLibro1.amosar();
        
    }
    
}
