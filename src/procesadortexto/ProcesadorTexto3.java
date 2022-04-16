package procesadortexto;

import java.awt.*;

import java.awt.event.*;
import java.awt.font.TextAttribute;

import javax.swing.*;
import javax.swing.text.*;
import javax.swing.text.StyledEditorKit.BoldAction;
import javax.swing.text.StyledEditorKit.UnderlineAction;

public class ProcesadorTexto3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MenuProcesador2 mimarco = new MenuProcesador2();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MenuProcesador2 extends JFrame{
	
	public MenuProcesador2() {
		
		setTitle("Procesador de Texto");
		
		setBounds(500,200,500,500);
		
		LaminaProcesador2 lamina = new LaminaProcesador2();
		
		add(lamina);
		
		setVisible(true);
	}
	
}

class LaminaProcesador2 extends JPanel{
	
	private JTextPane miarea;
	private JMenu fuente, estilos, tamano;
	private Font letras;
	private ButtonGroup tamano_grupo;
	private JPopupMenu emergente;
	private JToolBar barraHerramienta;
	
	public LaminaProcesador2() {
		
		setLayout(new BorderLayout());
		
		JPanel laminaMenu = new JPanel();
		
		JMenuBar mibarra = new JMenuBar();
		
			/*---------Menu en la Barra-----------*/
			fuente = new JMenu("Fuentes");
			estilos = new JMenu("Estilos");
			tamano = new JMenu("Tamaño");
			
			/*----------Menu Item de fuentes-----------------*/
			configura_menu("Arial", "fuente", "Arial");
			configura_menu("Courier", "fuente", "Courier");
			configura_menu("Cooper Black", "fuente", "Cooper Black");
			
			/*----------Menu Item de estilos-----------------*/	
			configura_estilos("Negrita", "estilos", Font.BOLD,  "bin/procesadortexto/negrita.png");
			configura_estilos("Cursiva", "estilos", Font.ITALIC,"bin/procesadortexto/cursiva.png");
			configura_estilos("Subrayar", "estilos", TextAttribute.UNDERLINE_ON,"bin/procesadortexto/subrayar.png");
			
			/*JCheckBoxMenuItem negrita = new JCheckBoxMenuItem("Negrita", new ImageIcon("bin/procesadortexto/negrita.png"));
			JCheckBoxMenuItem cursiva = new JCheckBoxMenuItem("Cursiva", new ImageIcon("bin/procesadortexto/cursiva.png"));
			
			negrita.addActionListener(new StyledEditorKit.BoldAction());
			cursiva.addActionListener(new StyledEditorKit.ItalicAction());
			
			estilos.add(negrita);
			estilos.add(cursiva);*/
			
			/*----------Menu Item de tamaño-----------------*/
			
			tamano_grupo = new ButtonGroup();
			
			configura_tamano("12", "tamano", 12, true);
			configura_tamano("16", "tamano", 16, false);
			configura_tamano("20", "tamano", 20, false);
			configura_tamano("24", "tamano", 24, false);
			
			/*ButtonGroup tamano_grupo = new ButtonGroup();
			
			JRadioButtonMenuItem doce = new JRadioButtonMenuItem("12");
			JRadioButtonMenuItem diesiceis = new JRadioButtonMenuItem("16");
			JRadioButtonMenuItem veite = new JRadioButtonMenuItem("20");
			JRadioButtonMenuItem veiti_cuatro = new JRadioButtonMenuItem("24");
			
			//veiti_cuatro.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));
			
			tamano_grupo.add(doce);
			tamano_grupo.add(diesiceis);
			tamano_grupo.add(veite);
			tamano_grupo.add(veiti_cuatro);
			
			doce.addActionListener(new StyledEditorKit.FontSizeAction("CAMBIA_TAMAÑO", 12));
			diesiceis.addActionListener(new StyledEditorKit.FontSizeAction("CAMBIA_TAMAÑO", 16));
			veite.addActionListener(new StyledEditorKit.FontSizeAction("CAMBIA_TAMAÑO", 20));
			veiti_cuatro.addActionListener(new StyledEditorKit.FontSizeAction("CAMBIA_TAMAÑO", 24));
			
			tamano.add(doce);
			tamano.add(diesiceis);
			tamano.add(veite);
			tamano.add(veiti_cuatro);*/
		
			mibarra.add(fuente);
			mibarra.add(estilos);
			mibarra.add(tamano);
			
		laminaMenu.add(mibarra);
		
		add(laminaMenu, BorderLayout.NORTH);
		
		/*-------Agrego a la lamina--------*/
		miarea = new JTextPane();
			
		add(miarea, BorderLayout.CENTER);
		
		
		/*****************Menu emergente*************************************/
		emergente = new JPopupMenu();
		
		configura_menu_emergente("Negrita", "emergente", Font.BOLD, "bin/procesadortexto/negrita.png");
		configura_menu_emergente("Cursiva", "emergente", Font.ITALIC, "bin/procesadortexto/cursiva.png");
		
		
		/*JMenuItem negritaEmergente = new JMenuItem("Negrita", new ImageIcon("bin/procesadortexto/negrita.png"));
		JMenuItem cursivaEmergente = new JMenuItem("Cursiva", new ImageIcon("bin/procesadortexto/cursiva.png"));

		negritaEmergente.addActionListener(new StyledEditorKit.BoldAction());
		cursivaEmergente.addActionListener(new StyledEditorKit.ItalicAction());
		
		emergente.add(negritaEmergente);
		emergente.add(cursivaEmergente);*/

		
		miarea.setComponentPopupMenu(emergente);
		
		/**************BARRA DE HERRAMIENTAS*******************/
		
		barraHerramienta  = new JToolBar(SwingConstants.VERTICAL);
		
		/*JButton negritaBarra = new JButton(new ImageIcon("bin/procesadortexto/negrita.png"));
		JButton cursivaBarra = new JButton(new ImageIcon("bin/procesadortexto/cursiva.png"));
		
		negritaBarra.addActionListener(new StyledEditorKit.BoldAction());
		cursivaBarra.addActionListener(new StyledEditorKit.ItalicAction());
		
		barra.add(negritaBarra);
		barra.add(cursivaBarra);*/
		
		/*JButton azulBarra = new JButton(new ImageIcon("bin/procesadortexto/Amarillo.png"));
		
		barraHerramienta.add(azulBarra);*/
		
		
		
		Accion_barra_herramientas AccionNegrita = new Accion_barra_herramientas("Negrita", new ImageIcon("bin/procesadortexto/negrita.png"), "Ctrl N");
		Accion_barra_herramientas AccionSubrayar = new Accion_barra_herramientas("Subrayar", new ImageIcon("bin/procesadortexto/subrayar.png"), "Ctrl U");
		Accion_barra_herramientas AccionIzquierda = new Accion_barra_herramientas("Alineación Izquierda", new ImageIcon("bin/procesadortexto/alinearIzquierda.png"), "");
		Accion_barra_herramientas AccionCentrado = new Accion_barra_herramientas("Alineación Centrado", new ImageIcon("bin/procesadortexto/centrado.png"), "");
		Accion_barra_herramientas AccionDerecha = new Accion_barra_herramientas("Alineación Derecha", new ImageIcon("bin/procesadortexto/alinearDerecha.png"), "");
		Accion_barra_herramientas AccionJustificado = new Accion_barra_herramientas("Alineación Justificado", new ImageIcon("bin/procesadortexto/justificar.png"), "");
		Accion_barra_herramientas AccionAmarillo = new Accion_barra_herramientas("Color Amarillo", new ImageIcon("bin/procesadortexto/Amarillo.png"), "");
		Accion_barra_herramientas AccionAzul = new Accion_barra_herramientas("Color Azul", new ImageIcon("bin/procesadortexto/azul.png"), "");
		Accion_barra_herramientas AccionRojo = new Accion_barra_herramientas("Color Rojo", new ImageIcon("bin/procesadortexto/rojo.png"), "");
		Accion_barra_herramientas AccionNegro = new Accion_barra_herramientas("Color Negro", new ImageIcon("bin/procesadortexto/negro.png"), "");
		
		configura_barra_herramienta("barraHerramienta", "negrita", AccionNegrita);
		configura_barra_herramienta("barraHerramienta", "cursiva", new Accion_barra_herramientas("Cursiva", new ImageIcon("bin/procesadortexto/cursiva.png"), "Ctrl K"));
		configura_barra_herramienta("barraHerramienta", "subrayar", AccionSubrayar);
		
		barraHerramienta.addSeparator();
		
		configura_barra_herramienta("barraHerramienta", "izquierda", AccionIzquierda);
		configura_barra_herramienta("barraHerramienta", "centrado", AccionCentrado);
		configura_barra_herramienta("barraHerramienta", "derecha", AccionDerecha);
		configura_barra_herramienta("barraHerramienta", "justificado", AccionJustificado);
		
		barraHerramienta.addSeparator();
		
		configura_barra_herramienta("barraHerramienta", "amarillo", AccionAmarillo);
		configura_barra_herramienta("barraHerramienta", "azul", AccionAzul);
		configura_barra_herramienta("barraHerramienta", "rojo", AccionRojo);
		configura_barra_herramienta("barraHerramienta", "negro", AccionNegro);
		
	
		add(barraHerramienta, BorderLayout.WEST);
		

	}
	

	public void configura_menu(String rotulo, String menu, String tipo_letra) {
		
		JMenuItem elem_menu = new JMenuItem(rotulo);
		
		if(menu == "fuente"){
			
			fuente.add(elem_menu);
			
			if (tipo_letra.equals("Arial")) {
				
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("Cambia Letra", "Arial"));
				
			}else if (tipo_letra.equals("Courier")) {
				
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("Cambia Letra", "Courier"));
				
			}else if (tipo_letra.equals("Cooper Black")) {
				
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("Cambia Letra", "Cooper Black"));
			}
				
			
		}
		

	}//Métodos de Archivo
	
	public void configura_estilos(String rotulo, String menu, int estilo, String ruta_icon) {
		
		//JCheckBoxMenuItem elem_estilo = new JCheckBoxMenuItem(rotulo, new ImageIcon(ruta_icon));
		
		JMenuItem elem_estilo = new JMenuItem(rotulo, new ImageIcon(ruta_icon));
		
		if(menu == "estilos"){
			
			this.estilos.add(elem_estilo);
			
			if (estilo==Font.BOLD) {
				
				elem_estilo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
				
				elem_estilo.addActionListener(new StyledEditorKit.BoldAction());
				
			}else if (estilo==Font.ITALIC){
				
				elem_estilo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
				
				elem_estilo.addActionListener(new StyledEditorKit.ItalicAction());
				
			}else if (estilo==TextAttribute.UNDERLINE_ON){
				
				elem_estilo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, InputEvent.CTRL_DOWN_MASK));
				
				elem_estilo.addActionListener(new StyledEditorKit.UnderlineAction());
			}
			
		}
	}//Método de estilos
	
	public void configura_tamano(String rotulo, String menu, int tam, boolean estado) {
		
		JRadioButtonMenuItem elem_tam = new JRadioButtonMenuItem(rotulo, estado);
		
		tamano_grupo.add(elem_tam);
		
		if(menu == "tamano") {
			
			tamano.add(elem_tam);
			
			elem_tam.addActionListener(new StyledEditorKit.FontSizeAction("CAMBIA_TAMAÑO", tam));
		}
		
	}//Método tamano
	
	public void configura_menu_emergente(String rotulo, String menu_emergente, int estilo, String ruta_icono) {
		
		JMenuItem elem_menu_emergente = new JMenuItem(rotulo, new ImageIcon(ruta_icono));
		
		if(menu_emergente == "emergente"){
			
			this.emergente.add(elem_menu_emergente);
			
			if (estilo==Font.BOLD) {
				
				elem_menu_emergente.addActionListener(new StyledEditorKit.BoldAction());
				
			}else if (estilo==Font.ITALIC){
				
				elem_menu_emergente.addActionListener(new StyledEditorKit.ItalicAction());
			}
			
		}
		
	}//Método menu emergente
	
	public void configura_barra_herramienta(String menu, String tipo_boton, Accion_barra_herramientas Accion) {
		
		JButton elem_btn = new JButton(Accion);
		
		if (menu.equals("barraHerramienta")) {
			
			barraHerramienta.add(elem_btn);
			
			if(tipo_boton.equals("negrita")) {
				
				elem_btn.addActionListener(new StyledEditorKit.BoldAction());
				
			}else if (tipo_boton.equals("cursiva")) {
				
				elem_btn.addActionListener(new StyledEditorKit.ItalicAction());
				
			}else if (tipo_boton.equals("subrayar")) {
				
				elem_btn.addActionListener(new StyledEditorKit.UnderlineAction());
				
			}else if (tipo_boton.equals("amarillo")) {
				
				elem_btn.addActionListener(new StyledEditorKit.ForegroundAction("Poner Amarillo", Color.YELLOW));
				
			}else if (tipo_boton.equals("azul")) {
				
				elem_btn.addActionListener(new StyledEditorKit.ForegroundAction("Poner Azul", Color.BLUE));
				
			}else if (tipo_boton.equals("rojo")) {
				
				elem_btn.addActionListener(new StyledEditorKit.ForegroundAction("Poner Rojo", Color.RED));
				
			}else if (tipo_boton.equals("negro")) {
				
				elem_btn.addActionListener(new StyledEditorKit.ForegroundAction("Poner Negro", Color.BLACK));
				
			}else if (tipo_boton.equals("izquierda")) {
				
				elem_btn.addActionListener(new StyledEditorKit.AlignmentAction("Izquierda", 0));
				
			}else if (tipo_boton.equals("centrado")) {
				
				elem_btn.addActionListener(new StyledEditorKit.AlignmentAction("centrado", 1));
				
			}else if (tipo_boton.equals("derecha")) {
				
				elem_btn.addActionListener(new StyledEditorKit.AlignmentAction("derecha", 2));
				
			}else if (tipo_boton.equals("justificado")) {
				
				elem_btn.addActionListener(new StyledEditorKit.AlignmentAction("justificado", 3));
			}
			
			
			
		}
		
	}//Metodo para crear botones de la barra de herramienta
	
	private class Accion_barra_herramientas extends AbstractAction{
		
		private String boton;
		
		public Accion_barra_herramientas(String nombre_btn, Icon icono, String combinacion) {
			
			boton = nombre_btn;
			
			//putValue(Action.NAME, nombre_btn);
			
			putValue(Action.SMALL_ICON, icono);
			
			putValue(Action.SHORT_DESCRIPTION, "Da la propiedad al texto de: " + nombre_btn + " " + combinacion);
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(boton.equals("Negrita")) {

				System.out.println("btn negrita");
			}
			
			
		}
		
	}//Accion para el botones de barra de herramienta

}