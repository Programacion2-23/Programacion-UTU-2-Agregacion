package Consola;
import java.util.Scanner;

import Logica.Empleado;
import Logica.Fecha;

public class Main_Empleado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//FECHA ACTUAL
		Fecha fechaActual = new Fecha(22 , 6, 2023);
		Fecha fechaIngreso = new Fecha(12 , 2, 2000);
		
		System.out.println("Ingrese su cedula: ");
		String cedula = entrada.next();
		System.out.println("Ingrese su nombre: ");
		String nombre = entrada.next();
		System.out.println("Ingrese su antiguedad: ");
		int antiguedad = entrada.nextInt();
		System.out.println("Ingrese su sueldo: ");
		double sueldo = entrada.nextDouble();
		
		Empleado empleado =  new Empleado(cedula,nombre,antiguedad,sueldo,fechaIngreso);
		System.out.println(empleado.toString());
		
		System.out.println(empleado.antiguedad(fechaActual));
	}

}
