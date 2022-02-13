import javax.swing.JOptionPane;

public class Entrdad_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//redondear dos decimales
		double x = 10000.0;
		
		double division = x/3;
		
		System.out.println("División: " + division);
		
		// dos decimales
		System.out.printf("%1.2f", division);
		System.out.println();
		String num1 = JOptionPane.showInputDialog("introduzca un numero: ");
		
		double num1_double = Double.parseDouble(num1);
		
		System.out.print("La raiz de: " + num1 + " es: " );
		System.out.printf("%1.2f", Math.sqrt(num1_double));
		
	}

}
