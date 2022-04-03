package layoutsandcomponentes;

import javax.swing.*;

import java.awt.*;

public class Menu_Componente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_menu mimarco = new Marco_menu();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class Marco_menu extends JFrame{
	
	public Marco_menu() {
		
		setTitle("Menus");
		
		setBounds(500,100,500,500);
		
		Lamina_Menu lamina = new Lamina_Menu();
		
		add(lamina);
		
		setVisible(true);
	}
}

class Lamina_Menu extends JPanel{
	
	public Lamina_Menu(){
		
		JMenuBar mibarra = new JMenuBar();
		
		JMenu archivo = new JMenu("Archivo");
		JMenu edicion = new JMenu("Edicion");
		JMenu herramienta = new JMenu("Herramientas");
		
		JMenuItem nuevo = new JMenuItem("Nuevo");
		JMenuItem guardar = new JMenuItem("Guardar");
		JMenuItem guardar_como = new JMenuItem("Guardar Como");
		JMenuItem cerar = new JMenuItem("Cerrar");
		
		JMenuItem cortar = new JMenuItem("Cortar");
		JMenuItem copiar = new JMenuItem("Copiar");
		JMenuItem pegar = new JMenuItem("Pegar");
		
		JMenu opciones = new JMenu("Opciones");
		JMenuItem opcion1 = new JMenuItem("Opcion 1");
		JMenuItem opcion2 = new JMenuItem("Opcion 2");
		
		JMenuItem general = new JMenuItem("Generales");
		
		archivo.add(nuevo);
		archivo.add(guardar);
		archivo.add(guardar_como);
		archivo.addSeparator();
		archivo.add(cerar);
		
		
		edicion.add(cortar);
		edicion.add(copiar);
		edicion.add(pegar);
		edicion.addSeparator();
		edicion.add(opciones);
		
		opciones.add(opcion1);
		opciones.add(opcion2);
		
		herramienta.add(general);
		
		mibarra.add(archivo);
		mibarra.add(edicion);
		mibarra.add(herramienta);
		

		add(mibarra);
		
	}
}