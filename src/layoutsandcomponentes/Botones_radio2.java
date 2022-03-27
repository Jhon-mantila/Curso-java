package layoutsandcomponentes;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Botones_radio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_radio2  mimarco = new Marco_radio2();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class Marco_radio2 extends JFrame{
	
	public Marco_radio2() {
		
		setTitle("Botones de Radio");
		
		setBounds(500,100,500,500);
		
		lamina_radio2 lamina = new lamina_radio2();
		
		add(lamina);
		
		setVisible(true);
		
	}
}

class lamina_radio2 extends JPanel{
	
	private JLabel texto;
	
	private JRadioButton boton1,boton2,boton3,boton4;
	
	
	public lamina_radio2() {

		setLayout(new BorderLayout());
		
		texto = new JLabel("En un lugar de la mancha de cuyo nombre", JLabel.CENTER);
		
		texto.setFont(new Font ("Serif", Font.PLAIN, 14));
		
		add(texto, BorderLayout.CENTER);
		
		ButtonGroup migrupo = new ButtonGroup();
		
		boton1 = new JRadioButton("Pequeño", false);
		
		boton2 = new JRadioButton("Mediano", true);
		
		boton3 = new JRadioButton("Grande", false);
		
		boton4 = new JRadioButton("Muy Grande", false);
		
		JPanel laminaBotonesRadio = new JPanel();
		
		Evento_radio evento = new Evento_radio();
		
		boton1.addActionListener(evento);
		boton2.addActionListener(evento);
		boton3.addActionListener(evento);
		boton4.addActionListener(evento);
		
		migrupo.add(boton1);
		migrupo.add(boton2);
		migrupo.add(boton3);
		migrupo.add(boton4);
		
		laminaBotonesRadio.add(boton1);
		laminaBotonesRadio.add(boton2);
		laminaBotonesRadio.add(boton3);
		laminaBotonesRadio.add(boton4);
		
		add(laminaBotonesRadio, BorderLayout.SOUTH);
			
	}
	
	private class Evento_radio implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() ==boton1) {
				
				//System.out.println("has pulsado el boton1");
				texto.setFont(new Font ("Serif", Font.PLAIN, 10));
				
			}else if(e.getSource() ==boton2){
				
				texto.setFont(new Font ("Serif", Font.PLAIN, 14));
				
			}else if(e.getSource() ==boton3){
				
				texto.setFont(new Font ("Serif", Font.PLAIN, 16));
				
			}else if(e.getSource() ==boton4){
				
				texto.setFont(new Font ("Serif", Font.PLAIN, 26));
			}
		}
		
	}
	
}