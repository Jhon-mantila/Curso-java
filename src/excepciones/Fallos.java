package excepciones;

import javax.swing.JOptionPane;

public class Fallos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * IOException : Errores comprobados
		 * 
		 * RuntimeExcption: Errores no comprobadas
		 * 
		 * */
		int [] mi_matrix = new int[5];
		
		try {
		
		mi_matrix[0] = 5;
		mi_matrix[1] = 7;
		mi_matrix[2] = 6;
		mi_matrix[3] = 8;
		mi_matrix[4] = 9;
		mi_matrix[5] = 91;
		
			for(int i = 0; i < 5; i++) {
				
				System.out.println("Posición: " + i + " = " + mi_matrix[i]);
				
			}
			
		}catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("quedo mal");
		}
		
		String nombre = JOptionPane.showInputDialog("Introduce su nombre:");
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
		
		System.out.println("Hola :" + nombre + " Tienes " + edad + " años " + " El programa termino la ejecución");
		
	}

}
