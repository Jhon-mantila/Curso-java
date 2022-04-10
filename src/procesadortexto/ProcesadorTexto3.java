package procesadortexto;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

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
			configura_menu("Arial", "fuente", "Arial", 9, 12);
			configura_menu("Courier", "fuente", "Courier", 9, 12);
			configura_menu("Verdana", "fuente", "Vernada", 9, 12);
			
			/*----------Menu Item de estilos-----------------*/
			configura_menu("Negrita", "estilos", "", Font.BOLD, 1);
			configura_menu("Cursiva", "estilos", "", Font.ITALIC, 1);
			
			/*----------Menu Item de tamaño-----------------*/
			configura_menu("14", "tamano", "", 9, 14);
			configura_menu("16", "tamano", "", 9, 16);
			configura_menu("20", "tamano", "", 9, 20);
			configura_menu("24", "tamano", "", 9, 24);
		
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
		
		elem_menu.addActionListener(new Gestiona_eventos(rotulo, tipo_letra, estilo, tam));
		
	}//Metodo 
	
	private class Gestiona_eventos implements ActionListener{
		
		String tipo_letra, menu;
		
		int estilo_letra, tam_letra;
		
		public Gestiona_eventos(String elemento, String letra, int estilo, int tam_letras) {
			
			tipo_letra = letra;
			
			estilo_letra = estilo;
			
			tam_letra = tam_letras;
			
			menu = elemento;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		
			letras = miarea.getFont();
			
			if (menu.equals("Arial")|| menu.equals("Courier") || menu.equals("Verdana")) {
				
				estilo_letra = letras.getStyle();
				
				tam_letra = letras.getSize();
				
			}else if(menu.equals("Cursiva") || menu.equals("Negrita")) {
				
				if (letras.getStyle() == 1  || letras.getStyle() == 2) {
					
					estilo_letra = 3;
				}
				
				tipo_letra = letras.getFontName();
					
				
				tam_letra = letras.getSize();
				
			}else if (menu.equals("14") || menu.equals("16") || menu.equals("20") || menu.equals("24")) {
				
				tipo_letra = letras.getFontName();
				
				estilo_letra = letras.getStyle();
			}
			
			miarea.setFont(new Font(tipo_letra, estilo_letra, tam_letra));
			
			System.out.println("Tipo: " + tipo_letra + " estilo: " + estilo_letra + " tam_letra" + tam_letra);
		}
		
	}
	
	
}