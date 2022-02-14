import java.util.Scanner;

public class Evalua_Edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce la edad: ");
		
		int edad = entrada.nextInt();
		
		if (edad >= 18) {
			
			System.out.println("Eres Mayor de Edad tienes: " + edad + " Años");
			
		} else {
			
			System.out.println("No eres Mayor de Edad tienes : " +  edad + " Años" );
		}
		
		
		System.out.println("introduce la edad de nuevo");
		
		int edad_nueva = entrada.nextInt();
		
		if (edad_nueva < 18) {
			
			System.out.println("Eres un impuber");
			
		}else if(edad_nueva < 40) {
			
		System.out.println("Eres Joven");
		
		}else if (edad_nueva < 65) {
			
			System.out.println("Eres Maduro");
			
		}else {
			
			System.out.println("Cuidate......");
		}
		
	}

}
