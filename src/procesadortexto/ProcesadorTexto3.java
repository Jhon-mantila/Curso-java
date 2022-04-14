package procesadortexto;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;
import javax.swing.text.*;

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
	
	public LaminaProcesador2() {
		
		setLayout(new BorderLayout());
		
		JPanel laminaMenu = new JPanel();
		
		JMenuBar mibarra = new JMenuBar();
		
			/*---------Menu en la Barra-----------*/
			fuente = new JMenu("Fuentes");
			estilos = new JMenu("Estilos");
			tamano = new JMenu("Tama�o");
			
			/*----------Menu Item de fuentes-----------------*/
			configura_menu("Arial", "fuente", "Arial");
			configura_menu("Courier", "fuente", "Courier");
			configura_menu("Cooper Black", "fuente", "Cooper Black");
			
			/*----------Menu Item de estilos-----------------*/	
			configura_estilos("Negrita", "estilos", Font.BOLD,  "bin/procesadortexto/negrita.png");
			configura_estilos("Cursiva", "estilos", Font.ITALIC,"bin/procesadortexto/cursiva.png");
			
			/*JCheckBoxMenuItem negrita = new JCheckBoxMenuItem("Negrita", new ImageIcon("bin/procesadortexto/negrita.png"));
			JCheckBoxMenuItem cursiva = new JCheckBoxMenuItem("Cursiva", new ImageIcon("bin/procesadortexto/cursiva.png"));
			
			negrita.addActionListener(new StyledEditorKit.BoldAction());
			cursiva.addActionListener(new StyledEditorKit.ItalicAction());
			
			estilos.add(negrita);
			estilos.add(cursiva);*/
			
			/*----------Menu Item de tama�o-----------------*/
			
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
			
			doce.addActionListener(new StyledEditorKit.FontSizeAction("CAMBIA_TAMA�O", 12));
			diesiceis.addActionListener(new StyledEditorKit.FontSizeAction("CAMBIA_TAMA�O", 16));
			veite.addActionListener(new StyledEditorKit.FontSizeAction("CAMBIA_TAMA�O", 20));
			veiti_cuatro.addActionListener(new StyledEditorKit.FontSizeAction("CAMBIA_TAMA�O", 24));
			
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
		
		
		/*Menu emergente*/
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
		

	}//M�todos de Archivo
	
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
			}
			
		}
	}//M�todo de estilos
	
	public void configura_tamano(String rotulo, String menu, int tam, boolean estado) {
		
		JRadioButtonMenuItem elem_tam = new JRadioButtonMenuItem(rotulo, estado);
		
		tamano_grupo.add(elem_tam);
		
		if(menu == "tamano") {
			
			tamano.add(elem_tam);
			
			elem_tam.addActionListener(new StyledEditorKit.FontSizeAction("CAMBIA_TAMA�O", tam));
		}
		
	}//M�todo tamano
	
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
		
	}//M�todo menu emergente

}