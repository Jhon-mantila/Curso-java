import java.util.Scanner;

import javax.swing.JOptionPane;

public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Elige una opci�n: \n 1: Cuadrado \n 2: Rect�ngulo \n 3: Tri�ngulo \n 4: C�rculo");
		
		int figura = entrada.nextInt();
		
		int base;
		
		int altura;
		
		switch (figura) {
				
		case 1:
			
			int lado  = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado:")); 
			
			int resultado = lado * lado;
			
			System.out.println("El �rea del cuadrado es: " + resultado);
		
			break;
		
		case 2:
			
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce base :"));
			
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce Altura :"));
			
			System.out.println("El �rea del rect�ngulo es: " + base * altura);
			
			break;
		
		case 3:
			
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce base :"));
			
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce Altura :"));
			
			System.out.println("El �rea del tri�ngulo: " + (base*altura)/2);
			
			break;
		
		case 4:
			
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			
			System.out.print("El �rea del circulo es: ");
			System.out.printf("%1.2f", Math.PI * (Math.pow(radio, 2)));
			
			break;
			
		default:
			
			System.out.println("No ingreso un # valido");
			
			break;
			
		}
		
	}

}
