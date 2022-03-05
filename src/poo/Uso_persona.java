package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona[] lasPersonas = new Persona[2];
		
		lasPersonas[0] = new Empleado2("Jhon Edinson" , 200000, 2022,2,25);
		lasPersonas[1] = new Alumno ("Jessika Karime", "Admin Negocios Internacionales");
		
		for(Persona p: lasPersonas) {
			
			System.out.println(p.get_nombre() + ", " + p.get_descripcion());
		}
	}

}

abstract class Persona{
	
	private String nombre;
	
	public Persona(String nom) {
		
		nombre = nom;
	}
	
	public String get_nombre() {
		
		return nombre;
	}
	
	public abstract String get_descripcion();
	
	
	
}

class Empleado2 extends Persona{
	
	private double sueldo;
	
	private Date altaContrato;
		
	private int id;
	
	private static int idSiguiente = 1;
	
	public Empleado2(String nom, double sue, int ano, int mes, int dia) {
		
		super(nom);
		
		sueldo = sue;
		
		GregorianCalendar calendario = new GregorianCalendar(ano, mes-1, dia);
		
		altaContrato = calendario.getTime();
		
		id = idSiguiente;
		
		idSiguiente++;
		
	}
	
	public String get_descripcion() {
		
		return "Este empleado tiene un id: " + id + " con un sueldo: " + sueldo;
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

class Alumno extends Persona{
	
	private String carrera;
	
	public Alumno (String nom, String carrera) {
		
		super(nom);
		
		this.carrera = carrera;
	}

	@Override
	public String get_descripcion() {
		// TODO Auto-generated method stub
		return "Este alumno esta estudiando la carrera es:" + carrera;
	}
	
	
}