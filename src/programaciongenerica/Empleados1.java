package programaciongenerica;

public class Empleados1 {

	public Empleados1(String nombe, int edad, double Salario) {
		
		this.nombre = nombre;
		
		this.edad = edad;
		
		this.Salario = Salario;
	}
	
	public String dameDatos() {
		
		return "El empleado se llama: " + nombre + " Tiene: " + edad + " y un salario de: " + Salario;
	}
	
	private String nombre;
	
	private int edad;
	
	private double Salario;
}
