package ejercicioventanasemergentes;

import java.awt.*;

import javax.swing.*;


class Marco_dialogos extends JFrame{
	
	private Lamina_dialogos lamina, lamina_tipo_mensaje, lamina_mensaje, lamina_tipo_opcion, lamina_opcion, lamina_entrada;
	
	
	public Marco_dialogos() {
		
		setTitle("Prueba Diálogos");
		
		setBounds(500,200,500,500);
		
		setLayout(new BorderLayout());
		
		JPanel lamina_cuadricula = new JPanel();
		
		lamina_cuadricula.setLayout(new GridLayout(2,3));
		
		String[] primeraCaja= {"Mensaje", "Confirmar", "Opciones", "Entrada"};
						
		lamina = new Lamina_dialogos("Tipo", primeraCaja);
		
		lamina_tipo_mensaje = new Lamina_dialogos("Tipo Mensaje", new String[] {
				"ERROR_MESSAGE", 
				"INFORMATION_MESSAGE",
				"QUESTION_MESSAGE",
				"PLAIN_MESSAGE"});
		
		lamina_mensaje = new Lamina_dialogos("Mensaje", new String[] {
				"Cadena",
				"Icono",
				"Componente",
				"Otros",
				"Object[]"});
		
		lamina_tipo_opcion = new Lamina_dialogos("Confirmar", new String[] {
				"DEFAULT_OPTION",
				"YES_NO_OPTION",
				"YES_NO_CANCEL_OPTION",
				"OK_CANCEL_OPTION"});
		
		lamina_opcion = new Lamina_dialogos("Confirmar", new String[] {
				"String[]",
				"Icon[]",
				"Object[]"});
		
		lamina_entrada = new Lamina_dialogos("Entrada", new String[] {
				"Combo de Texto",
				"Combo"});
		
		lamina_cuadricula.add(lamina);
		lamina_cuadricula.add(lamina_tipo_mensaje);
		lamina_cuadricula.add(lamina_mensaje);
		lamina_cuadricula.add(lamina_tipo_opcion);
		lamina_cuadricula.add(lamina_opcion);
		lamina_cuadricula.add(lamina_entrada);
		
		//AGREGANDO LAMINAS 
		
		JPanel lamina_mostrar = new JPanel();
		
		JButton boton_mostrar = new JButton("Mostar");
		
		lamina_mostrar.add(boton_mostrar);
		
		add(lamina_cuadricula, BorderLayout.CENTER);
		
		add(lamina_mostrar, BorderLayout.SOUTH);
	}
}