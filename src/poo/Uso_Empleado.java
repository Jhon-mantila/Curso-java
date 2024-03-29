package poo;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jefatura jefe_RRHH = new Jefatura("Laura", 1200000, 2020, 8,15);
		
		jefe_RRHH.set_incentivo(400000);;
		
		/*Empleado empleado = new Empleado("Jhon Mantilla", 2000000, 2021, 8, 17);
		Empleado empleado1 = new Empleado("Jessika Vallejo", 2100000, 2022, 8, 17);
		Empleado empleado2 = new Empleado("Zhoe", 1200000, 2020, 8, 17);
		
		empleado.subeSueldo(10);
		empleado1.subeSueldo(10);
		empleado2.subeSueldo(10);
		
		System.out.println("id:"+ empleado.get_id() + " Nombre: " + empleado.get_nombre() + " Sueldo: " + empleado.get_sueldo() + " Fecha:" + empleado.get_altaContrato());
		System.out.println("id:"+ empleado1.get_id() + " Nombre: " + empleado1.get_nombre() + " Sueldo: " + empleado1.get_sueldo() + " Fecha:" + empleado1.get_altaContrato());
		System.out.println("id:"+ empleado2.get_id() + " Nombre: " + empleado2.get_nombre() + " Sueldo: " + empleado2.get_sueldo() + " Fecha:" + empleado2.get_altaContrato());*/
		
		
		//Creando un array de la clase
		
		Empleado[] misempleados = new Empleado[7];
		
		//regla "es un" para la herencia
		
		misempleados[0] = new Empleado("Juan Rojas", 2000000, 2019, 8, 17);
		misempleados[1] = new Empleado("Laura", 1200000, 2019, 8, 17);
		misempleados[2] = new Empleado("David", 1200000, 2021, 8, 17);
		misempleados[3] = new Empleado("Zhoe");
		misempleados[4] = new Empleado("Camilo");
		misempleados[5] = jefe_RRHH; // Polimorfismo en acci�n
		misempleados[6] = new Jefatura("Daniel", 5000000, 2017, 04,12);
		//Casting o refundici�n en clases o metodos
		
		/*Castin ej double num1 = 1.2;
		 * 				int num2 = (int) num1;*/
		
		Jefatura jefe_finanzas = (Jefatura) misempleados[6];
		
		jefe_finanzas.set_incentivo(500000);
		
		System.out.println("El Jefe: " + jefe_finanzas.get_nombre() + " de finanzas tiene un bonus de: " + jefe_finanzas.establece_bonus(1000000));
		
		System.out.println("El Empleado: " + misempleados[2].get_nombre() + "tiene un bonus de :" + misempleados[2].establece_bonus(500000));
		
		Empleado director_Comercial = new Jefatura("Sandra Arango", 20000, 2001, 03,04);
		Comparable ejemplo = new Empleado("Wilson pra", 900000, 2021,04,06);
		
		
		if (director_Comercial instanceof Empleado) {
			
			System.out.println("Es de tipo jefatura");
		}
		
		if(ejemplo instanceof Comparable) {
			
			System.out.println("Implementa la interfaz comparable");
		}
		
		System.out.println(jefe_finanzas.tomar_decisiones("Vamos a crear un semillero y se les dara un bono a los que lo dicten"));
		
		for (int i=0; i<misempleados.length; i++) {
			
			misempleados[i].subeSueldo(10);
			
		}
		
		//la clase array metodo statico sort
		Arrays.sort(misempleados);
		
		for (Empleado element: misempleados) {
														/*Enlazado dinamico con el metodo get_sueldo() diferencia entre clases cual debe llamar*/
			System.out.println("id:"+ element.get_id() + " Nombre: " + element.get_nombre() + " Sueldo: " + element.get_sueldo() + " Fecha:" + element.get_altaContrato());
		}
		
		
	}

}

class Empleado implements Comparable, Trabajadores{
	
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
	
	public int get_id() {
		
		return id;
	}
	
	
	public String get_nombre() {
		
		return  nombre ;
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

	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		
		Empleado otroEmpleado = (Empleado)obj;
		
		if (this.id<otroEmpleado.id) {
			
			return -1;
			
		}
		
		if (this.id>otroEmpleado.id) {
			
			return 1;
		}
		
		return 0;
	}

	@Override
	public double establece_bonus(double gratificacion) {
		// TODO Auto-generated method stub
		return gratificacion + Trabajadores.bonus_base;
	}
}

//clases final para que no herenden de ellas igual a los metodos pueden ser final para que no los herende

final class Jefatura extends Empleado implements Jefes {

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

	@Override
	public String tomar_decisiones(String decision) {
		// TODO Auto-generated method stub
		return "Siguiente decisi�n: " + decision;
	}
	
	public double establece_bonus(double gratificacion) {
		
		double prima = 500000;
		
		return Trabajadores.bonus_base + gratificacion + prima;
	}
	
	
}

/*class Director extends Jefatura{


	public Director(String nom, double sue, int ano, int mes, int dia) {
		super(nom, sue, ano, mes, dia);
		// TODO Auto-generated constructor stub
	}
	
	
	

}*/
