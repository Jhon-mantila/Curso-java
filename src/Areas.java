import java.util.Scanner;

import javax.swing.JOptionPane;

public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Elige una opción: \n 1: Cuadrado \n 2: Rectángulo \n 3: Triángulo \n 4: Círculo");
		
		int figura = entrada.nextInt();
		
		int base;
		
		int altura;
		
		switch (figura) {
				
		case 1:
			
			int lado  = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado:")); 
			
			int resultado = lado * lado;
			
			System.out.println("El área del cuadrado es: " + resultado);
		
			break;
		
		case 2:
			
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce base :"));
			
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce Altura :"));
			
			System.out.println("El área del rectángulo es: " + base * altura);
			
			break;
		
		case 3:
			
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce base :"));
			
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce Altura :"));
			
			System.out.println("El área del triángulo: " + (base*altura)/2);
			
			break;
		
		case 4:
			
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			
			System.out.print("El área del circulo es: ");
			System.out.printf("%1.2f", Math.PI * (Math.pow(radio, 2)));
			
			break;
			
		default:
			
			System.out.println("No ingreso un # valido");
			
			break;
			
		}
		
	}

}
