package layoutsandcomponentes;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Botones_radio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_radio3  mimarco = new Marco_radio3();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco_radio3 extends JFrame{
	
	public Marco_radio3() {
		
		setTitle("Botones de Radio");
		
		setBounds(500,100,500,500);
		
		lamina_radio3 lamina = new lamina_radio3();
		
		add(lamina);
		
		setVisible(true);
		
	}
}

class lamina_radio3 extends JPanel{
	
	private JLabel texto;
	
	private JRadioButton boton1,boton2,boton3,boton4;
	
	private ButtonGroup migrupo;
	
	private JPanel LaminaBotones3;
	
	public lamina_radio3() {

		setLayout(new BorderLayout());
		
		texto = new JLabel("En un lugar de la mancha de cuyo nombre", JLabel.CENTER);
		
		texto.setFont(new Font ("Serif", Font.PLAIN, 14));	
		
		add(texto, BorderLayout.CENTER);
		
		LaminaBotones3 = new JPanel();
		
		migrupo = new ButtonGroup();
		
			
		colocar_botones("Pequeño", false, 10);
		
		colocar_botones("Mediano", false, 14);
		
		colocar_botones("Grande", false, 18);
		
		colocar_botones("Muy Grande", false, 26);
		
		add(LaminaBotones3, BorderLayout.SOUTH);
	}
	
	public void colocar_botones (String nombre, boolean selecionado, final int tamano) {
		
		JRadioButton boton = new JRadioButton(nombre, selecionado);
		
		migrupo.add(boton);
		
		LaminaBotones3.add(boton);
		
		ActionListener  evento = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				texto.setFont(new Font("Serif", Font.PLAIN, tamano));
			}
			
		};
		
		boton.addActionListener(evento);
	}
}