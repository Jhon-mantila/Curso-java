package excepciones;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada_Datos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("Que deseas hacer?");
	
	System.out.println("1. Introducir Datos \n2. Salir del programa");
	
	Scanner entrada = new Scanner(System.in);
	
	int opcion = entrada.nextInt();
	
	//System.out.println(opcion);
	
		if(opcion == 1) {
			
			pedirDatos();
			
		}else if(opcion == 2) {
			
			System.out.println("Adios");
			System.exit(0);
		
		}else {
			
			System.out.println("No escogiste una opción validad");
		}
		
	}
	
	static void pedirDatos() throws InputMismatchException {
		
		try {
				
		Scanner entrada = new Scanner(System.in);
		
		System.out.println();
		
		System.out.println("Introduce tu nombre: ");
		
		String nombre = entrada.nextLine();
		
		System.out.println("Introduce tu edad: ");
		
		int edad = entrada.nextInt();
		
		System.out.println("Hola: " + nombre + " tu edad es: " + edad + " El siguiente año: " + (edad+1));
		
		entrada.close();
		
		}catch(InputMismatchException e) {
			
			System.out.println("Que ingresaste en la edad");
		}
		
		System.out.println("hemos terminado el programa");
	}

}
