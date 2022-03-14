package eventos;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;


public class Eventos_de_Ventana2 {
	
	public static void main (String[] args) {
		
		MarcoVentana2 mimarco = new MarcoVentana2();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.datos_marco("Primera Ventana", 100, 200, 400, 400);
		
		MarcoVentana2 mimarco2 = new MarcoVentana2();
		
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		mimarco2.datos_marco("Segunda Ventana", 600, 200, 400, 400);
		
	}

}

class MarcoVentana2 extends JFrame  {
	
	public MarcoVentana2() {
		
		//setTitle("Trabajando Con Ventanas");
		
		//setBounds(500,200,500,500);
		
		//Eventos_Ventana miventanaEscuchar = new Eventos_Ventana();
		
		addWindowListener(new Eventos_Ventana2());
		
		setVisible(true);
	}
	
	public void datos_marco(String titulo, int x, int y, int ancho, int altura) {
		
		setTitle(titulo);
		
		setBounds(x,y,ancho,altura);
	}
}

class Eventos_Ventana2 extends WindowAdapter{

	public void windowActivated(WindowEvent e) {
		
		System.out.println("*Ventana Activada*");
	}
	
	/*public void windowClosed(WindowEvent e) {
		
		System.out.println("*#LA VENTANA HA SIDO CERRADA#*");
	}
	
	public void windowClosing(WindowEvent e) {
		
		System.out.println("#Ventana Cerrando#");
	}
	
	public void windowDeactivated(WindowEvent e) {
		
		System.out.println("***Ventana Desativada***");
	}*/
	
	public void windowDeiconified(WindowEvent e) {
		
		System.out.println("****Ventana Restaurada****");
	}
	
	public void windowIconified(WindowEvent e) {
		
		System.out.println("**Ventana Minimizada**");
	}
	
	public void windowOpened(WindowEvent e) {
		
		System.out.println("#Ventana Abierta#");
	}
	
	
}

