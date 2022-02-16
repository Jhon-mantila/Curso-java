import javax.swing.*;

public class Peso_ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String genero = "";
		
		do {
			
			genero = JOptionPane.showInputDialog("introduce Hombre (H) o Mujer (M)");
			
		} while (genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm sin comas"));
		
		int peso_ideal = 0;
		
			if(genero.equalsIgnoreCase("H")) {
				
				peso_ideal = altura - 100;
				
			}else if(genero.equalsIgnoreCase("M")) {
				
				peso_ideal = altura - 110;
			}
			
		System.out.println("Tu peso ideal es: " + peso_ideal + " Kilos");

	}

}
