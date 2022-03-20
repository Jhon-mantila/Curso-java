package layoutsandcomponentes;

import java.awt.*;

import javax.swing.*;

public class Inicio_layounts2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_Layout2 mimarco = new Marco_Layout2();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class Marco_Layout2 extends JFrame {
	
	public Marco_Layout2() {
		
		setTitle("Prueba Acciones");
		
		setBounds(500,100,500,500);
		
		Lamina_Layout2 lamina =new  Lamina_Layout2();
		
		Lamina_Layout3 lamina2 =new  Lamina_Layout3();
		
		//FlowLayout disposicion = new FlowLayout(FlowLayout.CENTER, 50, 30);
		
		//lamina.setLayout(disposicion);
		
		add(lamina, BorderLayout.NORTH);
		
		add(lamina2, BorderLayout.CENTER);
		
		setVisible(true);
		
	}
}

class Lamina_Layout2 extends JPanel{
	
	public Lamina_Layout2() {
		
	setLayout(new FlowLayout(FlowLayout.CENTER));

	add(new JButton("Rosado"));
	add(new JButton("Blanco"));
		
		
		
	}
}

class Lamina_Layout3 extends JPanel{
	
	public Lamina_Layout3() {
		
		setLayout(new BorderLayout());
		
		JButton Amarillo = new JButton("Amrillo");
		
		JButton Azul = new JButton("Azul");
		
		JButton Rojo = new JButton("Rojo");
		
		add(Amarillo, BorderLayout.NORTH);
		add(Azul, BorderLayout.SOUTH);
		add(Rojo, BorderLayout.WEST);
		
		add(new JButton("Black"), BorderLayout.CENTER);
		add(new JButton("Verde"), BorderLayout.EAST);
		
	}
}

