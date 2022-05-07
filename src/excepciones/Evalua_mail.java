package excepciones;
import java.io.EOFException;

import javax.swing.JOptionPane;

public class Evalua_mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mail = JOptionPane.showInputDialog("Introduce tu mail:");
		
		System.out.println(mail.length());
		
		try {
			
			examina_mail(mail);	
			
		}catch(EOFException e) {
			
			System.out.println("El mail no es correcto");
		}
		

	}
	
	static void examina_mail(String mail) throws EOFException{
		
		int arroba = 0;
		
		boolean punto = false;
		
		if(mail.length()<=3) {
			//Lanzar una excepción con la claususla throw
			//ArrayIndexOutOfBoundsException mi_excepcion = new ArrayIndexOutOfBoundsException();
			
			//throw mi_excepcion;
			// cuando se indica se usa throw en el metodo se le debe indicar al método ek throws
			throw new EOFException();
		
		}else {
					
			for (int i = 0; i < mail.length(); i++) {
				
				if (mail.charAt(i) == '@') {
					
					arroba++;
					
					
					System.out.println("Encontro @:" + i);
					
				}else if(mail.charAt(i) == '.') {
					
					punto = true;
					
					System.out.println("Encontro punto:" + i);
				}
			}
			
			if (arroba == 1 && punto) {
				
				System.out.println("Mail es Correcto: " + mail);
				
			}else {
				
				System.out.println("EL Mail NO es Correcto: " + mail);
			}
			
		}//método
	
	}
}
