package Consola;
import Logica.Articulo;
import Logica.Fecha;

public class Main_Articulo {

	public static void main(String[] args) {
		
		//FECHA ACTUALIDAD
		Fecha fecha = new Fecha(22,6,2023);
		
		//FECHA VENCIMIENTO
		Fecha fVencimiento = new Fecha(12,4,2020);
		
		Articulo art1 = new Articulo(12,"Heladera",12000,fecha,fVencimiento);
		
		System.out.println(art1.toString());
		
		
	}

}
