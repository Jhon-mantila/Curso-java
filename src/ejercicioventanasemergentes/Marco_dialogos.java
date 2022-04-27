package ejercicioventanasemergentes;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;
import java.util.Date;

import javax.swing.*;


class Marco_dialogos extends JFrame{
	
	private Lamina_dialogos lamina_tipo, lamina_tipo_mensaje, lamina_mensaje, lamina_tipo_opcion, lamina_opcion, lamina_entrada;
	
	private String cadena = "Seleciono el Mensaje";
	
	private Icon iconoMensaje = new ImageIcon("src/ejercicioventanasemergentes/animacion.0007.png");
	
	private Object objectoMensaje = new Date();
	
	private Component componenteMensaje = new Lamina_ejemplo();
	
	private JButton boton_mostrar;
	
	private JPanel lamina_cuadricula;
	
	public Marco_dialogos() {
		
		setTitle("Prueba Diálogos");
		
		setBounds(500,200,500,500);
		
		setLayout(new BorderLayout());
		
		lamina_cuadricula = new JPanel();
		
		lamina_cuadricula.setLayout(new GridLayout(2,3));
		
		String[] primeraCaja= {"Mensaje", "Confirmar", "Opciones", "Entrada"};
						
		lamina_tipo = new Lamina_dialogos("Tipo", primeraCaja);
		
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
		
		lamina_cuadricula.add(lamina_tipo);
		lamina_cuadricula.add(lamina_tipo_mensaje);
		lamina_cuadricula.add(lamina_mensaje);
		lamina_cuadricula.add(lamina_tipo_opcion);
		lamina_cuadricula.add(lamina_opcion);
		lamina_cuadricula.add(lamina_entrada);
		
		//AGREGANDO LAMINAS 
		
		JPanel lamina_mostrar = new JPanel();
		
		boton_mostrar = new JButton("Mostar");
		
		boton_mostrar.addActionListener(new AccionMostrar());
		
		lamina_mostrar.add(boton_mostrar);
		
		add(lamina_cuadricula, BorderLayout.CENTER);
		
		add(lamina_mostrar, BorderLayout.SOUTH);
	}
	
	//---------Proporciona lo selecionado del mensaje-+-------------------------
	
	
	public Object get_mensaje() {
		
		if(lamina_mensaje.get_seleccion_boton().equals("Cadena")) {return cadena;}
		else if(lamina_mensaje.get_seleccion_boton().equals("Icono")) {return iconoMensaje;}
		else if(lamina_mensaje.get_seleccion_boton().equals("Componente")) {return componenteMensaje;}
		else if(lamina_mensaje.get_seleccion_boton().equals("Otros")) {return objectoMensaje;}
		else if(lamina_mensaje.get_seleccion_boton().equals("Object[]")) {
			
			return new Object[] {cadena, iconoMensaje, componenteMensaje, objectoMensaje};
			
		}else {
			
			return null;
		}
		
		
		
	}
	
	
	private class AccionMostrar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("Mostrar el Boton: " + lamina_tipo.get_seleccion_boton());
			
			if(lamina_tipo.get_seleccion_boton().equals("Mensaje")) {
				
				JOptionPane.showMessageDialog(Marco_dialogos.this, get_mensaje(), "Título", JOptionPane.ERROR_MESSAGE);
				
			}else if(lamina_tipo.get_seleccion_boton().equals("Confirmar")) {
				
				JOptionPane.showConfirmDialog(Marco_dialogos.this, get_mensaje(), "Título", 0, 0);
				
			}else if(lamina_tipo.get_seleccion_boton().equals("Opciones")) {
				
				JOptionPane.showInputDialog(Marco_dialogos.this, get_mensaje(), "Título", 0);
				
			}else if(lamina_tipo.get_seleccion_boton().equals("Entrada")) {
				
				JOptionPane.showOptionDialog(Marco_dialogos.this, get_mensaje(), "Título", 0, 0, null, null, null);
			}
			
		}
		
	}
}

class Lamina_ejemplo extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(0,0, getWidth(), getHeight());
		
		g2.setPaint(Color.YELLOW);
		
		g2.fill(rectangulo);
	}
}