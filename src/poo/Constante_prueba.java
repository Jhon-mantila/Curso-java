package poo;

public class Constante_prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados trabajador = new Empleados("Jhon");
		
		Empleados trabajador1 = new Empleados("Jessika");
		
		trabajador.set_seccion("Desarrollo");
		System.out.println(trabajador.get_datos());
		System.out.println(trabajador1.get_datos());
		
	}

}

class Empleados{
	
	private final String nombre;
	
	private String seccion;
	
	public Empleados(String nom) {
		
		nombre = nom;
		
		seccion = "Administración";
		
	}
	
	public void set_seccion(String seccion) {
		
		this.seccion = seccion;
	}
	
	public String get_datos() {
		
		return "El nombre es: " + nombre + " la Sección es: " + seccion;
	}
	
	/*public void set_nombre(String nom) {
		
		nombre = nom;
	}*/
	
}
