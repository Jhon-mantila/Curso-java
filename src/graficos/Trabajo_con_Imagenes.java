package graficos;

import java.awt.*;

import java.io.File;

import java.io.IOException;

import javax.swing.*;

import javax.imageio.*;

public class Trabajo_con_Imagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoImagenes mimarco = new MarcoImagenes();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoImagenes extends JFrame{
	
	public MarcoImagenes() {
		
		setTitle("Tabajo con imagenes");
		
		//setSize(500,500);
		
		//setLocation(500,200);
		
		setBounds(500,200,500,500);
		
		LaminaImagenes lamina = new LaminaImagenes();
		
		lamina.setBackground(Color.DARK_GRAY);
		
		add(lamina);
		
		setVisible(true);
	}
	
}

class LaminaImagenes extends JPanel{
	
	
	
	public LaminaImagenes() {
		
		miRutaImagen = new File("src/graficos/animacion.0007.png");
		
		try {
			
			imagen = ImageIO.read(miRutaImagen);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se Encontro la imagen");
		}
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		int width = imagen.getWidth(this);
		
		int height = imagen.getHeight(this);
		
		g.drawImage(imagen, 0, 0, null);
		
		System.out.println("Altura: " + height + " Ancho: " + width);
		
		for(int i=0; i<300; i++) {
			
			for (int j=0; j<200; j++) {
				
				if(i+j>0) {
					g.copyArea(0, 0, width, height, width*i, height*j);
				}
				
			}
		}
		
		
	}
	
	private Image imagen;
	
	private File miRutaImagen = null;
}
