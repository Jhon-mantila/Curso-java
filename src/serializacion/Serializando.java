package serializacion;

import java.io.*;
import java.util.*;

public class Serializando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Administrador jefe = new Administrador("Jhon", 2000000, 2022, 05,16);
		
		jefe.set_incentivo(500000);
		
		//Pasaremos  a bytes
		Empleado[] personal = new Empleado[3];
		
		personal[0] = jefe;
		
		personal[1] = new Empleado("Jessika", 1500000, 2022,05,16);
		
		personal[2] = new Empleado("Daniela", 2500000, 2022,05,16);
		
		try {
			
			ObjectOutputStream escribiendo_fichero = new ObjectOutputStream(new FileOutputStream("src/serializacion/prueba.txt"));
			
			escribiendo_fichero.writeObject(personal);
			
			escribiendo_fichero.close();
			
			ObjectInputStream recuperando_fichero = new ObjectInputStream(new FileInputStream("src/serializacion/prueba.txt"));
			
			Empleado[] personal_recupeado = (Empleado[])recuperando_fichero.readObject();
			
			recuperando_fichero.close();
			
			for(Empleado e : personal_recupeado) {
				
				System.out.println(e);			
			}
			
		}catch(Exception e) {
			
		}
		
	}

}

class Empleado implements Serializable{
	/**
	 * para las actualizaciones, hacer los los cambios sin necesidad de enviar una actualización
	 * a otros que tenga nuestra aplicación.
	 * debe manterner la misma version que se genera  = 1L
	 */
	private static final long serialVersionUID = 1L;

	private String nombre;
	
	private double sueldo;
	
	private Date fecha_contrado;
	
	
	
	public Empleado(String n, double s, int agno, int mes, int dia) {
		
		nombre = n;
		
		sueldo = s;
		
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		
		fecha_contrado = calendario.getTime();
	}
	
	public String get_nombre() {
		return nombre;
	}
	
	public double get_sueldo() {
		return sueldo;
	}
	
	public Date get_fecha() {
		return fecha_contrado;
	}
	
	public void subirSueldo(double porcentaje) {
		double aumento = sueldo * porcentaje/100;
		sueldo+=aumento;
	}
	
	public String toString() {
		return "Nombre: " + nombre + " , Sueldo: " + sueldo + " Fecha: " + fecha_contrado;
	}
	
}


class Administrador extends Empleado{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double incentivo;
	
	public Administrador(String n, double s, int agno, int mes, int dia) {
		
		super(n,s,agno,mes,dia);
		
		incentivo = 0;
		
	}
	
	public double get_sueldo() {
		
		double sueldoBase = super.get_sueldo();
		
		return sueldoBase+incentivo;
		
	}
	
	
	public void set_incentivo(double b) {
		
		incentivo = b;
	}
	
	public String toString() {
		
		return super.toString() + " Incentivo: " + incentivo;
	}
}
