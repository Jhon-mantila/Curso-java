package eventos;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Multiples_fuentes_eventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multiples_Eventos mimarco = new Multiples_Eventos();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Multiples_Eventos extends JFrame {
	
	public Multiples_Eventos() {
		
		setTitle("Multiples fuentes de eventos");
		
		setBounds(500,100,500,500);
		
		Lamina_Multiples_Envento lamina = new Lamina_Multiples_Envento();
				
		add(lamina);
		
		setVisible(true);
		
	}
}

class Lamina_Multiples_Envento extends JPanel  {
	
	public Lamina_Multiples_Envento() {
		
		JButton btn_azul = new JButton("Azul");
		
		JButton btn_amarillo = new JButton("Amarillo");
		
		JButton btn_verde = new JButton("Verde");
		
		add(btn_azul);
		add(btn_amarillo);
		add(btn_verde);
		
		
	}
	
}

class AccionColor extends AbstractAction{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}


