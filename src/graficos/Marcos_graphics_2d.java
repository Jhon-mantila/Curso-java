package graficos;

import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;


public class Marcos_graphics_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_2d mimarco = new Marco_2d();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class Marco_2d extends JFrame{
	
	public Marco_2d() {
		
		setTitle("Graficos 2D");
		
		setSize(400,400);
		
		setLocation(100,200);
		
		Lamina_2d lamina = new Lamina_2d();
		
		add(lamina);
		
		
	}
}

class Lamina_2d extends JPanel{
	
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100, 200,150);
		
		g2.draw(rectangulo);
		
		Ellipse2D elipse = new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		g2.draw(elipse);
		
		g2.draw(new Line2D.Double(100,100,300,250));
		
		g2.draw(new Line2D.Double(300,100,100,250));
		
		double centro_x = rectangulo.getCenterX();
		
		double centro_y = rectangulo.getCenterY();
		
		double radio = 150;
		
		Ellipse2D circulo = new Ellipse2D.Double();
		
		circulo.setFrameFromCenter(centro_x, centro_y, centro_x+radio, centro_y+radio);
		
		g2.draw(circulo);
		
		
	}
}