package eventos;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Enventos_Teclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoTeclado mimarco = new MarcoTeclado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoTeclado extends JFrame{
	
	public MarcoTeclado() {
		
		setTitle("Eventos de Teclado");
		
		setBounds(500,100,500,500);
		
		EventoTeclado tecla = new EventoTeclado();
		
		addKeyListener(tecla);
		
		setVisible(true);
	}
	
}

class EventoTeclado implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		//trae el Codigo de la techa
		int codigo = e.getKeyCode();
		
		System.out.println(codigo);
		
		char letra = e.getKeyChar();
		
		System.out.println(letra);
		
		String letracompleta = e.getKeyText(codigo);
		
		System.out.println(letracompleta);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
