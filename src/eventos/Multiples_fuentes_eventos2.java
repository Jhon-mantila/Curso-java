package eventos;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Multiples_fuentes_eventos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multiples_Eventos2 mimarco = new Multiples_Eventos2();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}

class Multiples_Eventos2 extends JFrame {
	
	private JPanel lamina;
	
	public Multiples_Eventos2() {
		
		setTitle("Multiples fuentes de eventos");
		
		setBounds(500,100,500,500);
		
		ImageIcon IconAmarillo = new ImageIcon("src/graficos/bolaAmarilla.png");
		
		AccionColor accionAmarillo = new AccionColor("Amarillo", IconAmarillo, Color.YELLOW, "Ctrl A");
		
		AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("src/graficos/bolaAzul.png"), Color.BLUE, "Ctrl B");
		
		AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("src/graficos/bolaRoja.png"), Color.RED, "Ctrl R");
		
		Action accionSalir = new AbstractAction("Salir", new ImageIcon("src/graficos/cerrar.png")) {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		};
		
		lamina = new JPanel();
		
		add(lamina);
		
		/*******INICIO COMBINACION DE TECLAS*********************/
		InputMap mapa_entrada = lamina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		KeyStroke teclaAmarilla = KeyStroke.getKeyStroke("ctrl A");
		
		mapa_entrada.put(teclaAmarilla, "FONDO_AMARILLO");
		
		mapa_entrada.put(KeyStroke.getKeyStroke("ctrl B"), "FONDO_AZUL");
		
		//mapa_entrada.put(KeyStroke.getKeyStroke("ctrl O"), "FONDO_AZUL");
		
		mapa_entrada.put(KeyStroke.getKeyStroke("ctrl R"), "FONDO_ROJO");
		
		ActionMap mapaAccion = lamina.getActionMap();
		
		mapaAccion.put("FONDO_AMARILLO", accionAmarillo);
		
		mapaAccion.put("FONDO_AZUL", accionAzul);
		
		mapaAccion.put("FONDO_ROJO", accionRojo);
		
		/***********terminación combinacion de teclas***************/
		
		JMenu menu = new JMenu("Color");
		
		menu.add(accionAmarillo);
		menu.add(accionAzul);
		menu.add(accionRojo);
		
		JMenuBar barra_menus = new JMenuBar();
		
		barra_menus.add(menu);
		
		setJMenuBar(barra_menus);
		
		/***********CONSTRUCCION BARRA DE HERRAMIENTAS****************/
		
		JToolBar barra = new JToolBar("Mi Barra de Herramientas");
		
		barra.add(accionAmarillo);
		barra.add(accionAzul);
		barra.add(accionRojo);
		
		barra.addSeparator();
		
		barra.add(accionSalir);
		
		//si la queremos dejar fija no le pone dispocición
		add(barra, BorderLayout.NORTH);
		
	}
	
	private class AccionColor extends AbstractAction{

		public AccionColor(String nombre_btn, Icon icono, Color color_btn, String combinacion) {
			
			putValue(Action.NAME, nombre_btn);
			
			putValue(Action.SMALL_ICON, icono);
			
			putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color: " + nombre_btn + " " + combinacion);
			
			putValue("COLOR_DE_FONDO", color_btn);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Color c = (Color) getValue("COLOR_DE_FONDO");
			
			lamina.setBackground(c);
			
			String descripcion = (String)getValue(Action.SHORT_DESCRIPTION);
			
			System.out.println("Nombre: " + getValue(Action.NAME) + " Descripción: " + descripcion);
		}
		
	}
}

