package ejercicioventanasemergentes;

import java.awt.*;

import javax.swing.*;


class Marco_dialogos extends JFrame{
	
	private Lamina_dialogos lamina ;
	
	
	public Marco_dialogos() {
		
		setTitle("Prueba Diálogos");
		
		setBounds(500,200,500,500);
		
		JPanel lamina_cuadricula = new JPanel();
		
		lamina_cuadricula.setLayout(new GridLayout(2,3));
		
		String primeraCaja[]= {"Mensaje", "Confirmar", "Opciones", "Entrada"};
		
		lamina = new Lamina_dialogos("Tipo", primeraCaja);
		
		lamina_cuadricula.add(lamina);
		
		add(lamina_cuadricula);
		
	}
}