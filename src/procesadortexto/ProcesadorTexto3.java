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
	
	public LaminaProcesador2() {
		
		setLayout(new BorderLayout());
		
		JPanel laminaMenu = new JPanel();
		
		JMenuBar mibarra = new JMenuBar();
		
			/*---------Menu en la Barra-----------*/
			fuente = new JMenu("Fuentes");
			estilos = new JMenu("Estilos");
			tamano = new JMenu("Tamaño");
			
			/*----------Menu Item de fuentes-----------------*/
			configura_menu("Arial", "fuente", "Arial", 9, 12, "");
			configura_menu("Courier", "fuente", "Courier", 9, 12, "");
			configura_menu("Cooper Black", "fuente", "Cooper Black", 9, 12, "");
			
			/*----------Menu Item de estilos-----------------*/
			configura_menu("Negrita", "estilos", "", Font.BOLD, 1,"bin/procesadortexto/negrita.png");
			configura_menu("Cursiva", "estilos", "", Font.ITALIC, 1,"bin/procesadortexto/cursiva.png");
			
			/*----------Menu Item de tamaño-----------------*/
			configura_menu("14", "tamano", "", 9, 14,"");
			configura_menu("16", "tamano", "", 9, 16,"");
			configura_menu("20", "tamano", "", 9, 20,"");
			configura_menu("24", "tamano", "", 9, 24,"");
		
			mibarra.add(fuente);
			mibarra.add(estilos);
			mibarra.add(tamano);
			
		laminaMenu.add(mibarra);
		
		add(laminaMenu, BorderLayout.NORTH);
		
		/*-------Agrego a la lamina--------*/
		miarea = new JTextPane();
			
		add(miarea, BorderLayout.CENTER);

	}
	

	public void configura_menu(String rotulo, String menu, String tipo_letra, int estilo, int tam, String ruta_icono) {
		
		JMenuItem elem_menu = new JMenuItem(rotulo, new ImageIcon(ruta_icono));
		
		if(menu == "fuente"){
			
			fuente.add(elem_menu);
			
			if (tipo_letra.equals("Arial")) {
				
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("Cambia Letra", "Arial"));
				
			}else if (tipo_letra.equals("Courier")) {
				
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("Cambia Letra", "Courier"));
				
			}else if (tipo_letra.equals("Cooper Black")) {
				
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("Cambia Letra", "Cooper Black"));
			}
				
			
		}else if(menu == "estilos"){
			
			this.estilos.add(elem_menu);
			
			if (estilo==Font.BOLD) {
				
				elem_menu.addActionListener(new StyledEditorKit.BoldAction());
				
			}else if (estilo==Font.ITALIC){
				
				elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
			}
			
			
			
			
		}else if(menu == "tamano") {
			
			tamano.add(elem_menu);
			
			elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("CAMBIA_TAMAÑO", tam));
		}
		

	}//Método 

}