import javax.swing.JOptionPane;

public class Evalua_mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arroba = 0;
		
		boolean punto = false;
		
		String mail = JOptionPane.showInputDialog("Introduce tu mail:");
		
		System.out.println(mail.length());
		
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
		
		
			

	}

}
