package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado empleado = new Empleado("Jhon Mantilla", 2000000, 2021, 8, 17);
		Empleado empleado1 = new Empleado("Jessika Vallejo", 2100000, 2022, 8, 17);
		Empleado empleado2 = new Empleado("Zhoe", 1200000, 2020, 8, 17);
		
		empleado.subeSueldo(10);
		empleado1.subeSueldo(10);
		empleado2.subeSueldo(10);
		
		System.out.println("Nombre: " + empleado.get_nombre() + " Sueldo: " + empleado.get_sueldo() + " Fecha:" + empleado.get_altaContrato());
		System.out.println("Nombre: " + empleado1.get_nombre() + " Sueldo: " + empleado1.get_sueldo() + " Fecha:" + empleado1.get_altaContrato());
		System.out.println("Nombre: " + empleado2.get_nombre() + " Sueldo: " + empleado2.get_sueldo() + " Fecha:" + empleado2.get_altaContrato());
		
		
		//Creando un array de la clase
		
		Empleado[] misempleados = new Empleado[3];
		
		misempleados[0] = new Empleado("Juan Rojas", 2000000, 2019, 8, 17);
		misempleados[1] = new Empleado("Laura", 1200000, 2019, 8, 17);
		misempleados[2] = new Empleado("David", 1200000, 2021, 8, 17);
		
		for (int i=0; i<misempleados.length; i++) {
			
			misempleados[i].subeSueldo(10);
			
		}
		
		for (Empleado element: misempleados) {
			
			System.out.println("Nombre: " + element.get_nombre() + " Sueldo: " + element.get_sueldo() + " Fecha:" + element.get_altaContrato());
		}
		
		
	}

}

class Empleado {
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
	
	
	public Empleado(String nom, double sue, int ano, int mes, int dia) {
		
		nombre = nom;
		
		sueldo = sue;
		
		GregorianCalendar calendario = new GregorianCalendar(ano, mes-1, dia);
		
		altaContrato = calendario.getTime();
		
	}
	
	
	public String get_nombre() {
		
		return nombre;
	}
	
	
	public double get_sueldo() {
		
		return sueldo;
	}
	
	
	public Date get_altaContrato() {
		
		return altaContrato;
	}
	
	
	public void subeSueldo(double porcentaje) {
		
		double aumento  = sueldo * porcentaje/100;
		
		sueldo += aumento;
		
	}
}
