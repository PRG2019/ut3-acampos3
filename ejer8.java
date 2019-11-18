/*
 * Crea la clase Coche con dos constructores. Uno no toma parámetros y
 *  el otro sí. Los dos constructores inicializarán los atributos
 *  marca y modelo de la clase. Crea dos objetos (cada objeto llama 
 *  a un constructor distinto) y verifica que todo funciona correctamente.
 */
package ut3;
import java.util.*;
public class ejer8 {
 public static void main(String[]args) {
	 Scanner sc=new Scanner(System.in);
	     Coche car1 = new Coche();
		
		car1.Mostrar();
		
		car1 = new Coche("Seat","Ateca");
		
		car1.Mostrar();
	
        
     
}
}


package ut3;

public class Coche {
  private String marca;
  private String modelo;
   public Coche(){
    	marca= "seat";
        modelo="ibiza";
    }
   public Coche(String marca,String modelo){
    	this.marca=marca;
    	this.modelo=modelo;
    }
   public void Mostrar () {
		System.out.println("marca: "+marca+" modelo :"+modelo);
	}
	
}
