import javax.swing.JOptionPane;

public class Entradas_Datos_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		
		String edad = JOptionPane.showInputDialog("Introduce la edad:");
		
		int edad_entero = Integer.parseInt(edad);
		
		System.out.println("Tu nombre: " + nombre + " Tu edad: " + edad + " El proximo año: " + (edad_entero+1));
	}

}
