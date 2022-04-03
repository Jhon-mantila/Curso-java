package procesadortexto;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class ProcesadorTexto2 {

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
			tamano = new JMenu("Tama�o");
			
			/*----------Menu Item de fuentes-----------------*/
			configura_menu("Arial", "fuente", "", 0, 0);
			configura_menu("Courier", "fuente", "", 0, 0);
			configura_menu("Verdana", "fuente", "", 0, 0);
			
			/*----------Menu Item de estilos-----------------*/
			configura_menu("Negrita", "estilos", "", 0, 0);
			configura_menu("Cursiva", "estilos", "", 0, 0);
			
			/*----------Menu Item de tama�o-----------------*/
			configura_menu("12", "tamano", "", 0, 0);
			configura_menu("14", "tamano", "", 0, 0);
			configura_menu("20", "tamano", "", 0, 0);
			configura_menu("24", "tamano", "", 0, 0);
		
			mibarra.add(fuente);
			mibarra.add(estilos);
			mibarra.add(tamano);
			
		laminaMenu.add(mibarra);
		
		add(laminaMenu, BorderLayout.NORTH);
		
		/*-------Agrego a la lamina--------*/
		miarea = new JTextPane();
			
		add(miarea, BorderLayout.CENTER);

	}
	

	public void configura_menu(String rotulo, String menu, String tipo_letra, int estilo, int tam) {
		
		JMenuItem elem_menu = new JMenuItem(rotulo);
		
		if(menu == "fuente"){
			
			fuente.add(elem_menu);
			
		}else if(menu == "estilos"){
			
			this.estilos.add(elem_menu);
			
		}else if(menu == "tamano") {
			
			tamano.add(elem_menu);
			
		}
		
	}
}