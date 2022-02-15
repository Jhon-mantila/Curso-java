import javax.swing.JOptionPane;

public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave = "jhon";
		
		String pass = "";
		
		pass = JOptionPane.showInputDialog("Introducce la Contrasesa");
		
		int intentos = 1;
		
		while (clave.equals(pass) == false) {
			
			pass = JOptionPane.showInputDialog("Introducce la Contrasesa:");	
			
			if (clave.equals(pass) == false) {
				
				System.out.println("Contraseña Incorrecta: " + (intentos++));
			}
			
		}
		
		System.out.println("Contraseña correcta.....");

	}

}
