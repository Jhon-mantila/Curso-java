package eventos;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class Multiples_oyentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_oyentes mimarco = new Marco_oyentes();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco_oyentes extends JFrame{
	
	public Marco_oyentes () {
		
		setTitle("Multiples oyentes");
		
		setBounds(1200,100,500,500);
		
		Lamina_oyentes lamina = new Lamina_oyentes();
		
		add(lamina);
		
		setVisible(true);
	}
	
}

class Lamina_oyentes extends JPanel{
	
	JButton cerrar_todo;
	
	public Lamina_oyentes() {
		
		JButton nuevo = new JButton("Nuevo");
		
		cerrar_todo = new JButton("Cerrar Todo");
		
		add(nuevo);
		
		add(cerrar_todo);
		
		Oyente_nuevo mioyente = new Oyente_nuevo();
		
		nuevo.addActionListener(mioyente);
	}
	
	private class Oyente_nuevo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			Marco_emergente emergente = new Marco_emergente(cerrar_todo);
			
			emergente.setVisible(true);
			
		}
		
		
	}
	
}

class Marco_emergente extends JFrame{
	
	private static int contador = 0;
	
	public Marco_emergente(JButton cerrar_btn_principal) {
		
		contador++;
		
		setTitle("Marco " + contador);
		
		setBounds(40*contador, 40*contador, 300,150);
		
		Cierre_todo oyenteCerrar = new Cierre_todo();
		
		cerrar_btn_principal.addActionListener(oyenteCerrar);
	}
	
	private class Cierre_todo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			dispose();
		}
		
		
	}
}
