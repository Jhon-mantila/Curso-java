package graficos;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

public class TrabajandoColores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_colores mimarco = new Marco_colores();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Marco_colores extends JFrame{
	
	public Marco_colores() {
		
		setTitle("Colores");
		setSize(600,600);
		setLocation(200, 200);
		
		LaminaColores lamina = new LaminaColores();
		
		add(lamina);
		
		//lamina.setBackground(Color.YELLOW);
		
		//Color por defecto del sistemas operativo
		lamina.setBackground(SystemColor.window);
		
		setVisible(true);
	}
}

class LaminaColores extends JPanel{
	
	public LaminaColores() {
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		//Rectangulo
		
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100, 200,150);
		
		g2.setPaint(Color.RED);
		
		g2.draw(rectangulo);
		//brighter() mas claro
		g2.setPaint(Color.BLACK.brighter().brighter().brighter().brighter());
		
		g2.fill(rectangulo);
		
		//Elipse dentro del rectagulo
		
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		
		g2.setPaint(Color.WHITE);
		
		g2.draw(elipse);
		
		Color micolor = new Color(61,222,226);
		
		//darker() mas ocsuro
		g2.setPaint(micolor.darker().darker());
		
		elipse.setFrame(rectangulo);
		
		
		
		g2.fill(elipse);
	}
}