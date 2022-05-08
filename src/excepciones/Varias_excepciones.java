package excepciones;

import javax.swing.JOptionPane;

public class Varias_excepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
		division();
		
		}catch(ArithmeticException e) {
			
			System.out.println(e.getMessage());
			System.out.println("No se puede dividir por zero");
			
		}catch(NumberFormatException e) {
			
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			System.out.println(e.getClass().getName());
			System.out.println("Estas dividiendo con un string");
		}
	}
	
	static void division() {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo"));
		
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor"));
		
		System.out.println("El resultado es: " + num1/num2);
	}

}
