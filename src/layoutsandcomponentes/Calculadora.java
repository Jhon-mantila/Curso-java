package layoutsandcomponentes;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCalculadora mimarco = new MarcoCalculadora();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		
	}

}

class MarcoCalculadora extends JFrame{
	
	public MarcoCalculadora () {
		
		setTitle("Calculadora");
		
		setBounds(500,300,450,300);
		
		Lamina_Pantalla lamina = new Lamina_Pantalla();
		
		add(lamina);
		
		//pack();
		
	}
	
}

class Lamina_Pantalla extends JPanel{
	
	private JPanel LaminaCuerpo;
	
	private JButton btnPantalla;
	
	private boolean principio;
	
	
	public Lamina_Pantalla() {
		
		principio = true;
		
		setLayout(new BorderLayout());
		
		btnPantalla = new JButton("0");
		
		btnPantalla.setEnabled(false);
		
		add(btnPantalla, BorderLayout.NORTH);
		
		
		LaminaCuerpo = new JPanel();
		
		LaminaCuerpo.setLayout(new GridLayout(4,4));
						
		/*JButton boton1 = new JButton("1");
		
		LaminaCuerpo.add(boton1);
		
		JButton boton2 = new JButton("2");
		
		LaminaCuerpo.add(boton2);*/
		
		ActionListener insertar = new Obtener_numeros();
		
		ponerBoton("7", new Obtener_numeros());
		ponerBoton("8", insertar);
		ponerBoton("9", insertar);
		ponerBoton("/", null);
		
		ponerBoton("4", insertar);
		ponerBoton("5", insertar);
		ponerBoton("6", insertar);
		ponerBoton("*", null);
		
		ponerBoton("1", insertar);
		ponerBoton("2", insertar);
		ponerBoton("3", insertar);
		ponerBoton("-", null);
		
		ponerBoton("0", insertar);
		ponerBoton(".", insertar);
		ponerBoton("=", null);
		ponerBoton("+", null);
		
		add(LaminaCuerpo, BorderLayout.CENTER);
		
		
	}
	
	private void ponerBoton(String rotulo, ActionListener Oyente) {
		
		JButton boton = new JButton(rotulo);
		
		boton.addActionListener(Oyente);
		
		LaminaCuerpo.add(boton);
	}
	
	
	private class Obtener_numeros implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String entrada = e.getActionCommand();
			
			if (principio) {
				
				btnPantalla.setText("");
				
				principio = false;
			}
			
			btnPantalla.setText(btnPantalla.getText() + entrada);
		}
		
		
	}
	
	//clase interna para las operaciones matematicas
	private class AccionOrden implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
}