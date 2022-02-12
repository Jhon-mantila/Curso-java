
public class Manipulacion_Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Daniela";
		
		System.out.println("Mi nombre es:" + name);
		
		// método length
		
		System.out.println("Mi nombre tiene: " + name.length() + " Letras");
		
		System.out.println("La primera letra de: " + name + " es: " + name.charAt(0) );
		
		int ultimaLetra = name.length();
		
		System.out.println("La ultima letra de:" + name + " es: " + name.charAt(ultimaLetra-1));
	}

}
