package graficos;

import java.awt.*;
import javax.swing.*;

public class MarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_centrado mimarco = new Marco_centrado();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco_centrado extends JFrame{
	
	public Marco_centrado() {
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamano_pantalla = mipantalla.getScreenSize();
		
		int alturaPantalla = tamano_pantalla.height;
		
		int anchoPantalla = tamano_pantalla.width;
		
		System.out.println("altura: "+ alturaPantalla + " Ancho:" + anchoPantalla);
		
		setSize(anchoPantalla/2, alturaPantalla/2);
		
		setLocation(anchoPantalla/4, alturaPantalla/4);
		
		setTitle("MARCO CENTRADO");
		
		Image miIcono = mipantalla.getImage("src/graficos/animacion.0006.png");
		
		setIconImage(miIcono);
		
	}
	
}
