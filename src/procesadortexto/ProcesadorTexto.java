package procesadortexto;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class ProcesadorTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MenuProcesador mimarco = new MenuProcesador();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MenuProcesador extends JFrame{
	
	public MenuProcesador() {
		
		setTitle("Procesador de Texto");
		
		setBounds(500,200,500,500);
		
		LaminaProcesador lamina = new LaminaProcesador();
		
		add(lamina);
		
		setVisible(true);
	}
	
}

class LaminaProcesador extends JPanel{
	
	private JTextPane miarea;
	
	public LaminaProcesador() {
		
		setLayout(new BorderLayout());
		
		JPanel laminaMenu = new JPanel();
		
		JMenuBar mibarra = new JMenuBar();
		
			/*---------Menu en la Barra-----------*/
			JMenu fuente = new JMenu("Fuentes");
			JMenu estilos = new JMenu("Estilos");
			JMenu tamano = new JMenu("Tamaño");
			
			/*----------Menu Item de fuentes-----------------*/
			JMenuItem arial = new JMenuItem("Arial");
			JMenuItem courier = new JMenuItem("Courier");
			JMenuItem verdana = new JMenuItem("Verdana");
			
			//Gestiona_menu eventoC = new Gestiona_menu();
			/*Utilizando una clase anonima*/
			arial.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					miarea.setFont(new Font("Arial", Font.PLAIN, 12));
				}
				
			});
			courier.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					miarea.setFont(new Font("Courier", Font.PLAIN, 12));
				}
				
			});
			verdana.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					miarea.setFont(new Font("Verdana", Font.PLAIN, 12));
				}
				
			});
			
			fuente.add(arial);
			fuente.add(courier);
			fuente.add(verdana);
			
			/*----------Menu Item de estilos-----------------*/
			JMenuItem negrita = new JMenuItem("Negrita");
			JMenuItem cursiva = new JMenuItem("Cursiva");
					
			estilos.add(negrita);
			estilos.add(cursiva);
			
			/*----------Menu Item de tamaños-----------------*/
			JMenuItem doce = new JMenuItem("12");
			JMenuItem catorce = new JMenuItem("14");
			JMenuItem veinte = new JMenuItem("20");
			JMenuItem veinteCuatro = new JMenuItem("24");
			
			tamano.add(doce);
			tamano.add(catorce);
			tamano.add(veinte);
			tamano.add(veinteCuatro);
		
			mibarra.add(fuente);
			mibarra.add(estilos);
			mibarra.add(tamano);
			
		laminaMenu.add(mibarra);
		
		add(laminaMenu, BorderLayout.NORTH);
		
		/*-------Agrego a la lamina--------*/
		miarea = new JTextPane();
			
		add(miarea, BorderLayout.CENTER);

	}
	
	/*Clase interna*/
	private class Gestiona_menu implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			miarea.setFont(new Font("Courier", Font.PLAIN, 12));
		}
		
	}
}