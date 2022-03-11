package graficos;

import java.awt.*;
import javax.swing.*;

public class Marco_Dibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_con_Dibujo mimarco = new Marco_con_Dibujo();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class Marco_con_Dibujo extends JFrame{
	
	public Marco_con_Dibujo() {
		
		setTitle("Marco Con Dibujos");
		setSize(400,400);
		LaminaConFiguras milamina = new LaminaConFiguras();
		add(milamina);
		setVisible(true);
	}
}

class LaminaConFiguras extends JPanel{
	
		public void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			
			g.drawRect(10,10, 50,50);
			
			g.drawLine(70,70, 100, 70);
			
			g.drawArc(80, 80, 100, 100, 150,150);
						
			
		}
}
