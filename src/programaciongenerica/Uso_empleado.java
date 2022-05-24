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
		//agrega en esa posicion
		//lista_empleados.add(0, new Empleado("Olga", 12, 4000000));
		//Cambia setea la posicion
		lista_empleados.set(0, new Empleado("Olga", 12, 4000000));
		
		//Libera recurssos
		lista_empleados.trimToSize();
		
		System.out.println(lista_empleados.size());
		System.out.println("********************BUCLE MEJORADO******************************");	
		//objeto elemento: array
		for(Empleado e: lista_empleados) {
			
			System.out.println(e.dameDatos());
		}
		
		System.out.println("##################################################################");
		
		//Obtiene la posición del array
		System.out.println(lista_empleados.get(0).dameDatos());
		
		System.out.println("#################################################################");
		System.out.println("************RECOCRRER CON BUCLE CONVENCIONAL********************");
		System.out.println("#################################################################");
		for(int i = 0; i < lista_empleados.size(); i++ ) {
			
			/*Empleado e= lista_empleados.get(i);
			
			System.out.println(e.dameDatos());*/
			
			System.out.println(lista_empleados.get(i).dameDatos());
		}
		
		System.out.println("****************************************************************");
		System.out.println("********RECOCRRER CON BUCLE CONVECIONAL CREANDO UN ARRAY********");
		System.out.println("#################################################################");
		Empleado arrayEmpleados[] = new Empleado[lista_empleados.size()];
		
		
		lista_empleados.toArray(arrayEmpleados);
		
		for(int i = 0; i < arrayEmpleados.length ; i++) {
			System.out.println(arrayEmpleados[i].dameDatos());
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
