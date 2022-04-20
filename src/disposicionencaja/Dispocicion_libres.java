package disposicionencaja;

import javax.swing.*;

public class Dispocicion_libres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_libre mimarco = new Marco_libre();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class Marco_libre extends JFrame{
	
	public Marco_libre() {
		
		setTitle("Disposición Libres");
		
		setBounds(500,100,500,500);
		
		Lamina_libre milamina = new Lamina_libre();
		
		add(milamina);
		
		setVisible(true);
	}
}

class Lamina_libre extends JPanel{
	
	public Lamina_libre() {
		
		setLayout(null);
		
	
		JLabel nombre = new JLabel("Nombre: ");
		
		JLabel apellido = new JLabel("Apellido: ");
		
		JTextField c_nom = new JTextField(10);
		
		JTextField c_ape = new JTextField(10);
		
		nombre.setBounds(15, 5, 100, 50);
		
		c_nom.setBounds(110, 20, 100, 20);
		
		apellido.setBounds(15, 55, 100, 50);
		
		c_ape.setBounds(110, 70, 100, 20);
		
		
		add(nombre);
		add(apellido);
		add(c_nom);
		add(c_ape);
		
	    JButton boton1 = new JButton("boton1");
		
		JButton boton2 = new JButton("boton2");
		
		boton1.setBounds(5, 105, 150, 50);
		
		boton2.setBounds(160, 105, 150, 50);
		
		add(boton1);
		
		add(boton2);
		
	}
	
}