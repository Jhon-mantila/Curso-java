package programaciongenerica;

public class Uso_pareja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pareja<String> obj = new Pareja<String>();
		
		obj.set_primero("Este objeto de tipo string");
		
		System.out.println(obj.get_primero());
		
		Pareja<Persona> person = new Pareja<Persona>();
		
		person.set_primero(new Persona("jhon"));
		
		System.out.println(person.get_primero().toString());;
	}

}

class Persona{
	
	public Persona(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	public String toString() {
		
		return nombre;
	}
	
	private String nombre;
}
