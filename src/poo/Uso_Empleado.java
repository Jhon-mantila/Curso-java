package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
