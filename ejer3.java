
package ut3;

public class ejer3 {
	public static void main(String[] args) {
		MiNumero num = new MiNumero();
		
        System.out.println("El doble es "+num.doble());
        System.out.println("El triple es "+num.triple());
        System.out.println("El cuadruple es "+num.cuadruple());
	}
}
//*main
package ut3;

public class MiNumero {
	int numero;
    MiNumero(){
        numero=8;
    }
    public int doble(){
        int resultado1=numero*2;
        return resultado1;
    }
    public int triple(){
        int resultado2=numero*3;
        return resultado2;
    }
    public int cuadruple(){
        int resultado3=numero*4;
        return resultado3;
    }
}


