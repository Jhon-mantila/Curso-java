package layoutsandcomponentes;

import javax.swing.*;

import java.awt.*;

public class Botones_radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_radio  mimarco = new Marco_radio();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class Marco_radio extends JFrame{
	
	public Marco_radio() {
		
		setTitle("Botones de Radio");
		
		setBounds(500,100,500,500);
		
		lamina_radio lamina = new lamina_radio();
		
		add(lamina);
		
		setVisible(true);
		
	}
}

class lamina_radio extends JPanel{
	
	public lamina_radio() {
		
		ButtonGroup migrupo = new ButtonGroup();
		
		ButtonGroup migrupo1 = new ButtonGroup();
		
		JRadioButton boton1 = new JRadioButton("Amarillo", false);
		
		JRadioButton boton2 = new JRadioButton("Azul", true);
		
		JRadioButton boton3 = new JRadioButton("Rojo", false);
		
		migrupo.add(boton1);
		migrupo.add(boton2);
		migrupo.add(boton3);
		
		JRadioButton boton4 = new JRadioButton("Masculino", false);
		
		JRadioButton boton5 = new JRadioButton("Femenino", false);
		
		migrupo1.add(boton4);
		migrupo1.add(boton5);
		
		//Los grupos no se pueden agregar a la lamina
		
		add(boton1);
		add(boton2);
		add(boton3);
		
		add(boton4);
		add(boton5);
		
		
	}
}