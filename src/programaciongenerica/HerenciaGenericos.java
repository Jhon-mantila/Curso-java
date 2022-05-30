package programaciongenerica;

public class HerenciaGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados1 administrativa = new Empleados1("Laura", 25, 1200000);
		
		Jefe1 DirectorComercial = new Jefe1("Ana", 27 ,3500000);
		
		//Principio de susticióm "es un" con la herencia 
		Empleados1 nuevoEmpleado = DirectorComercial;
		
		Pareja<Empleados1> Administrativo = new Pareja<Empleados1>();
		
		Pareja<Jefe1> DirectorComer = new Pareja<Jefe1>();
		
		//NO se puede aplicar el es un
		//Pareja<Empleados1> nuevoEmpleado2 = DirectorComer;
		
		
		Pareja.imprimier_trabajador(DirectorComer);
	}

}
