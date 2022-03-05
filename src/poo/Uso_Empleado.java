package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jefatura jefe_RRHH = new Jefatura("Laura", 1200000, 2020, 8,15);
		
		jefe_RRHH.set_incentivo(400000);;
		
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
		
		Empleado[] misempleados = new Empleado[7];
		
		//regla "es un" para la herencia
		
		misempleados[0] = new Empleado("Juan Rojas", 2000000, 2019, 8, 17);
		misempleados[1] = new Empleado("Laura", 1200000, 2019, 8, 17);
		misempleados[2] = new Empleado("David", 1200000, 2021, 8, 17);
		misempleados[3] = new Empleado("Zhoe");
		misempleados[4] = new Empleado("Camilo");
		misempleados[5] = jefe_RRHH; // Polimorfismo en acción
		misempleados[6] = new Jefatura("Daniel", 5000000, 2017, 04,12);
		//Casting o refundición en clases o metodos
		
		/*Castin ej double num1 = 1.2;
		 * 				int num2 = (int) num1;*/
		
		Jefatura jefe_finanzas = (Jefatura) misempleados[6];
		
		jefe_finanzas.set_incentivo(500000);
		
		for (int i=0; i<misempleados.length; i++) {
			
			misempleados[i].subeSueldo(10);
			
		}
		
		for (Empleado element: misempleados) {
														/*Enlazado dinamico con el metodo get_sueldo() diferencia entre clases cual debe llamar*/
			System.out.println("Nombre: " + element.get_nombre() + " Sueldo: " + element.get_sueldo() + " Fecha:" + element.get_altaContrato());
		}
		
		
	}

}

class Empleado {
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
		
	private int id;
	
	private static int idSiguiente = 1;
	
	public Empleado(String nom, double sue, int ano, int mes, int dia) {
		
		nombre = nom;
		
		sueldo = sue;
		
		GregorianCalendar calendario = new GregorianCalendar(ano, mes-1, dia);
		
		altaContrato = calendario.getTime();
		
		id = idSiguiente;
		
		idSiguiente++;
		
	}
	
	public Empleado(String nom) {
		// tmb hace referencia al otro contructor, en la misma clase
		this(nom, 500000, 2022, 2, 26);
		
	}
	
	
	public String get_nombre() {
		
		return " id: " + id + " "+ nombre ;
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

//clases final para que no herenden de ellas igual a los metodos pueden ser final para que no los herende

final class Jefatura extends Empleado {

	private double incentivo;
	
	public Jefatura(String nom, double sue, int ano, int mes, int dia ){	
		
		super(nom, sue, dia, dia, dia);
		
	}
	
	public void set_incentivo(double b) {
		
		incentivo = b;
	}
	
	//Sobreescribir el metodo de la clase empleado
	
	public double get_sueldo() {
		//llame al metodo de la clase padre
		double sueldoJefe = super.get_sueldo();
		
		return sueldoJefe + incentivo;
	}
	
	
}

/*class Director extends Jefatura{


	public Director(String nom, double sue, int ano, int mes, int dia) {
		super(nom, sue, ano, mes, dia);
		// TODO Auto-generated constructor stub
	}
	
	
	

}*/
