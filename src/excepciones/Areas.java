package excepciones;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Areas {

	static int figura;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Elige una opci�n: \n 1: Cuadrado \n 2: Rect�ngulo \n 3: Tri�ngulo \n 4: C�rculo");
		
		try {
			
		figura = entrada.nextInt();
		
		
		
		}catch(Exception e) {
			
			System.out.println("Ha ocuerrido un error");
			
		}finally {//lo que se coloque ac� se ejecuta siempre asi capture la excepcion 
			
			entrada.close();	
		}
		
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
		
	//---------------------------------------------------------------------------------------------------
		
		String genero = "";
		
		do {
			
			genero = JOptionPane.showInputDialog("introduce Hombre (H) o Mujer (M)");
			
		} while (genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm sin comas"));
		
		int peso_ideal = 0;
		
			if(genero.equalsIgnoreCase("H")) {
				
				peso_ideal = altura - 100;
				
			}else if(genero.equalsIgnoreCase("M")) {
				
				peso_ideal = altura - 110;
			}
			
		System.out.println("Tu peso ideal es: " + peso_ideal + " Kilos");
		
	}

}
