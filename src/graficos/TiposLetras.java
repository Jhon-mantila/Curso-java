package graficos;

import java.awt.*;
import javax.swing.*;

public class TiposLetras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Traigo los tipos de letras
		String fuente = JOptionPane.showInputDialog("Introduce Fuente");
		
		boolean estalafuente = false;
		
		String [] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		for(String fuentes: nombresDeFuentes) {
			
			if (fuentes.equals(fuente)) {
				
				estalafuente = true;
			}
			
			//System.out.println(fuentes);
		}
		
		if(estalafuente) {
			
			System.out.println("Fuente Instalada");
			
		}else {
			
			System.out.println("No esta instalada la fuente");
		}
	}

}
