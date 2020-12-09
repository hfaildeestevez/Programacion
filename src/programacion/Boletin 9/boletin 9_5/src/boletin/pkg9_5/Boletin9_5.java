
package boletin.pkg9_5;


import javax.swing.JOptionPane;

public class Boletin9_5 {

    public static void main(String[] args){
      float soldo;
      int maisDeMil=0, menosDeMil=0;
      int total=1;

      do{
          soldo=Float.parseFloat(JOptionPane.showInputDialog("cal e o soldo do traballador"));
      if (soldo>=1000 && soldo <=1750) {
          maisDeMil++;
      }
      else if (soldo<1000){
      menosDeMil++;
      }
      total ++;


      }while (soldo !=0);
      float porcentaje= (menosDeMil/(float)total)*100;
      System.out.println("trablalladores que ganaron mais de 1000 e menos de 1750: "+maisDeMil+"\n porcentaxe traballadores que cobran menos de 1000 "+porcentaje+"%");

    }
    
}
