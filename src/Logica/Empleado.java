package Logica;
import java.util.Scanner;

public class Empleado {

	Scanner entrada = new Scanner(System.in);

	private String cedula;
	private String nombre;
	private int antiguedad;
	private double sueldo;
	//NUEVO ATRIBUTO
	private Fecha fechaIngreso;
	
	//Contrucotor por defecto
	public Empleado() {		
	}
	
	//Constructor Especifico
	public Empleado(String cedula,String nombre,int antiguedad, double sueldo,Fecha fechaingreso) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.antiguedad = antiguedad;
		this.sueldo = sueldo;
		this.fechaIngreso = fechaingreso;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public Fecha getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Fecha fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	//METODOS
	double sueldoAnual(double sueldo) {
		return sueldo*12;
	}
	
	double presentismo(double sueldo) {
		sueldo = sueldoAnual(sueldo)*1.10;
		return sueldo;
	}
	
	public int antiguedad(Fecha fecha){
		int antiguedad = fecha.getAnio() - fechaIngreso.getAnio();
		
		return antiguedad; 
	}
	
	@Override
	public String toString() {
		return (" CEDULA: " + cedula + 
				" NOMBRE: " + nombre + 
				" ANTIGUEDAD: " + antiguedad + 
				" SUELDO: " + sueldo + 
				" SUELDO ANUAL: " + presentismo(sueldo));
	}
	
}
