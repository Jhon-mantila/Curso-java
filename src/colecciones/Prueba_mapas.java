package colecciones;

import java.util.*;

public class Prueba_mapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Empleado> personal = new HashMap<String, Empleado>();
		
		personal.put("145", new Empleado("Jhon"));
		personal.put("146", new Empleado("Maria"));
		personal.put("147", new Empleado("Daniela"));
		personal.put("148", new Empleado("Jessika"));
		
		System.out.println(personal);
		
		personal.remove("147");
		
		System.out.println(personal);
		
		//Sostituye
		personal.put("148", new Empleado("????"));
		
		System.out.println(personal);
		
		System.out.println(personal.entrySet());
		
		for(Map.Entry<String, Empleado> e: personal.entrySet()) {
			
			System.out.println("Llave: " + e.getKey() + " Valor: " + e.getValue());
		}
	}

}


class Empleado {
	
	private String nombre;
	
	private double sueldo;	
	
	public Empleado(String nom) {
	
		nombre = nom;
		
		sueldo = 2000000;
	}
	
	public String toString() {
		
		return "[Nombre = " +nombre+", sueldo= " +sueldo+"]";
	}
	
}