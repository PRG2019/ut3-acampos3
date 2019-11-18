package ut3;
import java.util.*;
public class ejer1 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	        System.out.println(" 1-Celsius a Fahrenheit  ");
	        System.out.println("  2 Fahrenheit a Celsius");
	        int opcion=sc.nextInt();
	        Temperatura temp = new Temperatura();
 
	        switch(opcion){
	            case 1: 
	            temp.CelsiusAFahrenheit();
	            break;
	            case 2: 
	            temp.FahrenheitACelsius();
	            break;
	            default: System.out.println("La opcion introducida no es correcta");
	        }
	}
	}

/*Realice una clase Temperatura, la cual convierta grados Celsius a Farenheit
 *  y viceversa. Para ello cree dos métodos double celsiusToFarenheit(double) y farenheitToCelsius(double). Pruebe dicha clase. 
 */
package ut3;

import java.util.Scanner;

public class Temperatura{
    Scanner tec = new Scanner(System.in);

	public double CelsiusAFahrenheit (){
        System.out.println("Introduce los grados celsius");
        double celsius=tec.nextDouble();
        double fahrenheit=(celsius*1.8)+32;
        System.out.println(celsius+" grados celsius son "+fahrenheit+" grados fahrenheit");
        return fahrenheit;
    }


    public double FahrenheitACelsius (){
        System.out.println("Introduce los grados fahrenheit");
        double fahrenheit=tec.nextDouble();
        double celsius=(fahrenheit-32)/1.8;
        System.out.println(fahrenheit+" grados fahrenheit son "+celsius+" grados celsius");
        return celsius;
    }
}

	
