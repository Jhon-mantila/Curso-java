package eventos;

import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

public class Cambio_Estado_Ventana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoEstado mimarco = new MarcoEstado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoEstado extends JFrame{
	
	public MarcoEstado() {
		
		setTitle("Estado de Ventanas");
		
		setBounds(300,300,500,350);
		
		CambiaEstado estado = new CambiaEstado();
		
		addWindowStateListener(estado);
		
		setVisible(true);
	}
}

class CambiaEstado implements WindowStateListener{
	
	public void windowStateChanged(WindowEvent e) {
		/*
		 * mirar los estados de las ventana en la api de java
		 * https://docs.oracle.com/javase/7/docs/api/
		 * constantes de clase*/
		System.out.println("La ventana ha cambaido de estado");
		
		System.out.println("Estado: "+e.getNewState());
		
		if (e.getNewState() == 6) {
		
			System.out.println("**La Ventana esta a pantalla completa");
			
		}else if (e.getNewState() == JFrame.NORMAL) {
			
			System.out.println("*La Ventana esta en NORMAL*");
			
		}else if (e.getNewState() == JFrame.ICONIFIED) {
			
			System.out.println("#Ventana MINIMIZADA#");
			
		}
	}
	
}