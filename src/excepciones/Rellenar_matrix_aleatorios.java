package excepciones;

import javax.swing.JOptionPane;

public class Rellenar_matrix_aleatorios {
/*
 * puntos de interruci�n se le puede colocar condicionales en la pesta�a 
 * de breakpoints y selecionamos condicinal o expressiones para saber una 
 * posici�n en concreto
 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce Elementos de la matrix"));
		
		int[] matrix_aleatorio = new int[elementos];
		
		for(int i=0 ; i<matrix_aleatorio.length; i++) {
			
			matrix_aleatorio[i] = (int)(Math.random()*100);
		}
		
		for(int numeros:matrix_aleatorio) {
			
			System.out.println(numeros + " ");			
			
		}
		
	}

}
