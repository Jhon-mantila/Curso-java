import javax.swing.*;

public class Uso_Array_II {
	
	public static void main (String[] args) {
		
		/*String [] paises = new String[5];
		
		paises[0] = "Colombia";
		paises[1] = "España";
		paises[2] = "Ecuador";
		paises[3] = "Peru";
		paises[4] = "Bolivia";
		
		
		String [] paises2 = {"Colombia","Chile","Argentina","Venezuela"};
		for (int i=0; i<paises.length;i++) {
			
			System.out.println("Posición: " + i + " Pais: " + paises[i]);
		}
		
		System.out.println();
		for(String elemento:paises2) {
			
			System.out.println("Pais: " + elemento);
		}*/
		
		/*String[] pais = new String[4];
		
		for(int i = 0; i<4; i++) {
			
			pais[i] = JOptionPane.showInputDialog("Introduce pais");
		}
		
		for(String elem:pais) {
			
			System.out.println(elem);
		}*/
	
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("inserte la cantidad de paises"));
		
		
		String[] pais = new String[num];
	
		
		
			for (int i=0; i< pais.length; i++) {
				
				pais[i] = JOptionPane.showInputDialog("introduce Pais: " + (i+1));
			}
			
		
			for(String element:pais) {
				
				System.out.println("Pais: " + element);
			}
		
	}

}
