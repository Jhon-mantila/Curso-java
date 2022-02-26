package poo;

public class Constante_prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Empleados[] misEmpleados = new Empleados[5];
		
		misEmpleados[0] = new Empleados("David");
		
		misEmpleados[0].set_seccion("Soporte");
		
		misEmpleados[1] = new Empleados("Zhoe");
		
		misEmpleados[1].set_seccion("Soporte");
		
		misEmpleados[2] = new Empleados("Laura");
		
		misEmpleados[3] = new Empleados("Juan");
		
		misEmpleados[3].set_seccion("Desarrollo");
		
		misEmpleados[4] = new Empleados("Alejandro");
		
		misEmpleados[4].set_seccion("Analista");
		
		
		for(Empleados e: misEmpleados) {
			
			System.out.println(e.get_datos());
		}
		
		
		Empleados trabajador = new Empleados("Jhon");
		
		Empleados trabajador1 = new Empleados("Jessika");
		
		Empleados trabajador2 = new Empleados("Daniela");
		
		Empleados trabajador3 = new Empleados("Maria");
		
		trabajador.set_seccion("Desarrollo");
		
		
		System.out.println(trabajador.get_datos());
		
		System.out.println(trabajador1.get_datos());
		
		System.out.println(trabajador2.get_datos());
		
		System.out.println(trabajador3.get_datos());
		
		System.out.println(Empleados.get_idSiguiente());
		
	}

}

class Empleados{
	
	private final String nombre;
	
	private String seccion;
	
	private int id;
	//static permite crear propiedades unicas que pueden cambiar entre instancias
	private static int idSiguiente = 1;
	
	
	public Empleados(String nom) {
		
		nombre = nom;
		
		seccion = "Administración";
		
		id = idSiguiente;
		
		idSiguiente++;
	}
	
	public void set_seccion(String seccion) {
		
		this.seccion = seccion;
	}
	
	public String get_datos() {
		
		return "id: " + id + " el nombre es: " + nombre + " la Sección es: " + seccion;
	}
	
	public static String get_idSiguiente() {
		
		return "El id que sigue es: " + idSiguiente;
	}
	
	/*public void set_nombre(String nom) {
		
		nombre = nom;
	}*/
	
}
