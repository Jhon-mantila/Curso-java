import java.util.Scanner;

public class numero_aleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Math.random());
		
		int num_aleatorio = (int)(Math.random() * 100);
		
		System.out.println(num_aleatorio);
		
		Scanner entrada = new Scanner(System.in);
		
		
		int num = 0;
			
		int intentos = 0;
		
		while (num != num_aleatorio) {
			
			System.out.println("Introduce un numero por favor:");
			
			num = entrada.nextInt();
			
			intentos++;
			
			if (num_aleatorio < num) {
				
				System.out.println("Más Bajo el número");
			
			}else if (num_aleatorio > num) {
				
				System.out.println("Más alto el número");
			}
		
		}//while
		
		System.out.println("Correcto: " + intentos + " Intentos");

	}

}
