package procesadortexto;

import java.awt.*;

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
		
		
		
	}
}