package ejercicioventanasemergentes;

import java.awt.*;

import javax.swing.*;


class Lamina_dialogos extends JPanel{

	private ButtonGroup grupo;
	
	public Lamina_dialogos(String titulo, String[] opciones) {
		
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));
				
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		grupo = new ButtonGroup();
		
		for (int i = 0; i<opciones.length; i++) {
			
			JRadioButton boton_radio = new JRadioButton(opciones[i]);
			
			boton_radio.setActionCommand(opciones[i]);
			
			add(boton_radio);
			
			grupo.add(boton_radio);
			//le pongo condición para el true;
			boton_radio.setSelected(i==0);
		}
	
		
	}
	
	public String get_seleccion_boton() {
		
		//Acordarme siempre del polimorfismo
		ButtonModel miboton = grupo.getSelection();
		
		String texto_boton = miboton.getActionCommand();
					
		return texto_boton;
		
		//return grupo.getSelection().getActionCommand();
	}
	

}