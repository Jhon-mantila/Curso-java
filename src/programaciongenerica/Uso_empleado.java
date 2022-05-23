package programaciongenerica;

import java.util.*;

public class Uso_empleado {
	
	public static void main(String[] args) {
		
		Empleado miempleado[] = new Empleado[4];
		
		miempleado[0] = new Empleado("Jhon", 35, 2000000);
		miempleado[1] = new Empleado("Jessika", 32, 2000000);
		miempleado[2] = new Empleado("Daniela", 12, 4000000);
		miempleado[3] = new Empleado("Maria", 60, 1000000);
		
			
		//Listas dinamicas
		ArrayList<Empleado> lista_empleados = new ArrayList<Empleado>();
		//Lista de elementos si loquierenes indicar
		//lista_empleados.ensureCapacity(11);
		
		lista_empleados.add(new Empleado("Jhon", 35, 2000000));
		lista_empleados.add(new Empleado("Jessika", 32, 2000000));
		lista_empleados.add(new Empleado("Daniela", 12, 4000000));
		lista_empleados.add(new Empleado("Maria", 60, 1000000));
		lista_empleados.add(new Empleado("Cristian", 31, 3000000));
		
		lista_empleados.add(new Empleado("Jhon", 35, 2000000));
		lista_empleados.add(new Empleado("Jessika", 32, 2000000));
		lista_empleados.add(new Empleado("Daniela", 12, 4000000));
		lista_empleados.add(new Empleado("Maria", 60, 1000000));
		lista_empleados.add(new Empleado("Cristian", 31, 3000000));
		
		lista_empleados.add(new Empleado("Cristian", 31, 3000000));
		lista_empleados.add(new Empleado("Cristian", 31, 3000000));
		lista_empleados.add(new Empleado("Jhon", 35, 2000000));
		lista_empleados.add(new Empleado("Jessika", 32, 2000000));
		lista_empleados.add(new Empleado("Daniela", 12, 4000000));
		
		//Libera recurssos
		lista_empleados.trimToSize();
		
		System.out.println(lista_empleados.size());
			
		
		for(Empleado e: lista_empleados) {
			
			System.out.println(e.dameDatos());
		}
			 
	}

}

class Empleado{
	
	private String nombre;
	
	private int edad;
	
	private double salario;
	
	public Empleado(String nombre, int edad, double salario) {
		
		this.nombre = nombre;
		
		this.edad = edad;
		
		this.salario = salario;
		
	}
	
	public String dameDatos() {
		
		return "El empleado se llama " + nombre + " tiene " + edad + " años. Y un salario de: " + salario; 
	}
}
