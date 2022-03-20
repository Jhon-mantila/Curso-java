package layoutsandcomponentes;

import java.awt.*;

import javax.swing.*;

public class Inicio_layounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_Layout mimarco = new Marco_Layout();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class Marco_Layout extends JFrame {
	
	public Marco_Layout() {
		
		setTitle("Prueba Acciones");
		
		setBounds(500,100,500,500);
		
		Lamina_Layout lamina =new  Lamina_Layout();
		
		//FlowLayout disposicion = new FlowLayout(FlowLayout.CENTER, 50, 30);
		
		//lamina.setLayout(disposicion);
		
		add(lamina);
		
		setVisible(true);
		
	}
}

class Lamina_Layout extends JPanel{
	
	public Lamina_Layout() {
		
		
		FlowLayout disposicion = new FlowLayout(FlowLayout.CENTER, 50, 30);
		
		setLayout(disposicion);
		
		JButton Amarillo = new JButton("Amrillo");
		
		JButton Azul = new JButton("Azul");
		
		JButton Rojo = new JButton("Rojo");
		
		add(Amarillo);
		add(Azul);
		add(Rojo);
		
		
		
	}
}

