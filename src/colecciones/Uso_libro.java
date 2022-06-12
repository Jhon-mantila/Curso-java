package colecciones;

public class Uso_libro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libros libro1 = new Libros("Quijote de la mancha", "Miguel de cervantes saveedra", 25);
		Libros libro2 = new Libros("Quijote de la mancha", "Miguel de cervantes saveedra", 25);
		
		//libro1 = libro2;
		//Sobreescribir el metodo equals
		
		if(libro1.equals(libro2)) {
			
			System.out.println("Es el mismo libro");
			
			System.out.println(libro1.hashCode());
			
			System.out.println(libro2.hashCode());
			
		}else {
			
			System.out.println("No es el mismo libro");
			
			System.out.println(libro1.hashCode());
			
			System.out.println(libro2.hashCode());
		}
	}

}
