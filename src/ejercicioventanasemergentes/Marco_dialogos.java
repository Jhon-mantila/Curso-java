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
		
		setBounds(500,200,600,500);
		
		setLayout(new BorderLayout());
		
		lamina_cuadricula = new JPanel();
		
		lamina_cuadricula.setLayout(new GridLayout(2,3));
		
		String[] primeraCaja= {"Mensaje", "Confirmar", "Opciones", "Entrada"};
						
		lamina_tipo = new Lamina_dialogos("Tipo", primeraCaja);
		
		lamina_tipo_mensaje = new Lamina_dialogos("Tipo Mensaje", new String[] {
				"ERROR_MESSAGE", 
				"INFORMATION_MESSAGE",
				"WARNING_MESSAGE",
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
		
		lamina_opcion = new Lamina_dialogos("Opción", new String[] {
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
	
	//---------Proporciona lo selecionado del mensaje---------------------------
	
	
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
	
	//---------Devuelve tipo del mensaje icono del lado y tambien numero de botones en confirmar-------------------
	
	public int get_tipo_mensaje(Lamina_dialogos lamina) {
		
		String laminaSe = lamina.get_seleccion_boton();
		
		if(laminaSe.equals("ERROR_MESSAGE") || laminaSe.equals("YES_NO_OPTION")) {
			return 0; //JOptionPane.ERROR_MESSAGE; // o 0
		}else if(laminaSe.equals("INFORMATION_MESSAGE") || laminaSe.equals("YES_NO_CANCEL_OPTION")) {
			return 1; //JOptionPane.INFORMATION_MESSAGE;// o 1
		}else if(laminaSe.equals("WARNING_MESSAGE") || laminaSe.equals("OK_CANCEL_OPTION")) {
			return 2; //JOptionPane.WARNING_MESSAGE; // o 2
		}else if(laminaSe.equals("QUESTION_MESSAGE")) {
			return 3; //JOptionPane.QUESTION_MESSAGE; //o 3
		}else if(laminaSe.equals("PLAIN_MESSAGE") || laminaSe.equals("DEFAULT_OPTION")) {
			return JOptionPane.PLAIN_MESSAGE; // o-1
		}else {
			return -2;
		}
	}
	
	//------------- devolver los array de opciones-----------------
	
	public Object[]  get_opciones(Lamina_dialogos lamina) {
		
		String s = lamina.get_seleccion_boton();
		
		if(s.equals("String[]")) {
			
			return new String[] {"Primero", "Segundo","tercero"};
		
		}else if(s.equals("Icon[]")){
			
			return new Object[] {
					new ImageIcon("src/ejercicioventanasemergentes/bolaAmarilla.png"),
					new ImageIcon("src/ejercicioventanasemergentes/bolaAzul.png"),
					new ImageIcon("src/ejercicioventanasemergentes/bolaRoja.png")
					};
			
		}else if(s.equals("Object[]")){
			
			return new Object[] {cadena, iconoMensaje,  objectoMensaje, componenteMensaje};
		}else {
			
			return null;
		}
		
	}
	
	//-------opciones de entrada-----------------
	
	public Object[] get_entrada() {
		
		if(lamina_entrada.get_seleccion_boton().equals("Combo")) {
			
			return new String[] {"Amarillo", "Azul", "Rojo"};
		}else {
			return null;
		}
		
	}
	
	//-----------Devuelve el titulo de los JOption Pane-------
	
	public String get_titulo() {
		
		if(lamina_tipo.get_seleccion_boton().equals("Mensaje")) {
			
			return "Mensaje";
			
		}else if(lamina_tipo.get_seleccion_boton().equals("Confirmar")) {
			
			return "Confirmar";
			
		}else if(lamina_tipo.get_seleccion_boton().equals("Entrada")) {
			
			return "Entrada";
			
		}else if(lamina_tipo.get_seleccion_boton().equals("Opciones")) {
			
			return "Opciones";
		}else {
			
			return "Título";
		}
	}
	
	private class AccionMostrar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("Mostrar el Boton: " + lamina_tipo.get_seleccion_boton());
			
			if(lamina_tipo.get_seleccion_boton().equals("Mensaje")) {
				
				JOptionPane.showMessageDialog(Marco_dialogos.this, get_mensaje(), get_titulo(), get_tipo_mensaje(lamina_tipo_mensaje));
				
			}else if(lamina_tipo.get_seleccion_boton().equals("Confirmar")) {
				
				JOptionPane.showConfirmDialog(Marco_dialogos.this, get_mensaje(), get_titulo(), get_tipo_mensaje(lamina_tipo_opcion), get_tipo_mensaje(lamina_tipo_mensaje));
				
			}else if(lamina_tipo.get_seleccion_boton().equals("Entrada")) {
				
				JOptionPane.showInputDialog(Marco_dialogos.this, get_mensaje(), get_titulo(), get_tipo_mensaje(lamina_tipo_mensaje), null, get_entrada(), null);
				
			}else if(lamina_tipo.get_seleccion_boton().equals("Opciones")) {
				
				JOptionPane.showOptionDialog(Marco_dialogos.this, get_mensaje(), get_titulo(), 1, get_tipo_mensaje(lamina_tipo_mensaje), null, get_opciones(lamina_opcion), null);
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