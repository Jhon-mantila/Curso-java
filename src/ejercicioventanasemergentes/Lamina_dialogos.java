package ejercicioventanasemergentes;

import java.awt.*;

import javax.swing.*;


class Lamina_dialogos extends JPanel{

	
	public Lamina_dialogos(String titulo, String[] opciones) {
		
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));
				
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		ButtonGroup grupo = new ButtonGroup();
		
		for (int i = 0; i<opciones.length; i++) {
			
			JRadioButton boton_radio = new JRadioButton(opciones[i]);
			
			add(boton_radio);
			
			grupo.add(boton_radio);
			//le pongo condición para el true;
			boton_radio.setSelected(i==0);
		}
	
		
	}
	

}