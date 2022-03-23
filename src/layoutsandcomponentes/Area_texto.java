package layoutsandcomponentes;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class Area_texto {
	
	public static void main (String[] args) {
		
		Marco_area  mimarco = new Marco_area();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

}

class Marco_area extends JFrame{
	
	public Marco_area(){
		
		setTitle("Area de Texto");
		
		setBounds(500,100,500,500);
		
		Marco_lamina lamina = new Marco_lamina();
		
		add(lamina);
		
		setVisible(true);
		
	}
}

class Marco_lamina extends JPanel{
	
	private JTextArea miarea;
	
	public Marco_lamina() {
		
		miarea = new JTextArea(8,20);
		
		//para barras de scroll
		JScrollPane laminaBarra = new JScrollPane(miarea);
		
		//miarea.setLineWrap(true);
					
		add(laminaBarra);
		
		JButton boton = new JButton("Enviar");
		
		boton.addActionListener(new GestionaArea());
		
		add(boton);
		
	}
	
	private class GestionaArea implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println(miarea.getText());
		}
		
	}
}
