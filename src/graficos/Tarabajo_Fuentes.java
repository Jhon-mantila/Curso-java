package graficos;

import java.awt.*;
import javax.swing.*;

public class Tarabajo_Fuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoFuentes mimarco = new MarcoFuentes();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoFuentes extends JFrame {
	
	public MarcoFuentes() {
		
		setTitle("Trabajo con fuentes");
		
		setSize(500,500);
		
		setLocation(500,200);
		
		LaminaFuente milamina = new LaminaFuente();
		
		add(milamina);
		
		milamina.setBackground(SystemColor.window);
		//pone todo el color de la lamina
		milamina.setForeground(Color.CYAN);
		
		setVisible(true);
		
		
	}
}


class LaminaFuente extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		Font mifuente = new Font("Bell MT", Font.BOLD, 36);
		
		g2.setFont(mifuente);
		
		//g2.setColor(Color.GREEN);
		
		g2.drawString("Jhon", 100, 100);
		
		g2.setFont(new Font("Courier", Font.ITALIC, 20));
		
		//g2.setColor(Color.BLUE);
		
		g2.drawString("Curso de Java", 200, 100);
	}
}