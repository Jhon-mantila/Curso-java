package graficos;

import java.awt.*;
import javax.swing.*;

public class Escribendo_marco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_con_texto mimarco = new Marco_con_texto();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}

class Marco_con_texto extends JFrame{
	
	
	public Marco_con_texto(){
		
		setSize(400, 300);
		
		setTitle("Marco Con texto");
		
		setLocation(300,100);
		
		Lamina milamina = new Lamina();
		
		add(milamina);
		
		
		
	}
}

class Lamina extends JPanel{
	
	public Lamina () {
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.drawString("Hola mi lamina", 10, 10);
		
	}
}
