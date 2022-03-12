package eventos;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TrabajoEventos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoBotones mimarco = new MarcoBotones();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoBotones2 extends JFrame{
	
	public MarcoBotones2(){
		
		setTitle("Envento con Botones");
		
		setBounds(700,300,500,300);
		
		LaminaBotones lamina = new LaminaBotones();
		
		add(lamina);
	
		setVisible(true);
		
	}
}

/*
 *3 factores
 *Envento: al hacer clic en el  boton
 *Fuente:  El boton
 *listener: la lamina
 * 
 * */

class LaminaBotones2 extends JPanel {
	
	//Fuente
	JButton btnNegro = new JButton("Negro");
	JButton btnAmarillo = new JButton("Amarillo");
	JButton btnAzul = new JButton("Azul");
	
	public LaminaBotones2() {
		
		add(btnNegro);
		add(btnAmarillo);
		add(btnAzul);
		
		ColorFondo amarillo = new ColorFondo(Color.YELLOW);
		
		ColorFondo azul = new ColorFondo(Color.BLUE);
		
		btnNegro.addActionListener(new ColorFondo(Color.BLACK));
		btnAmarillo.addActionListener(amarillo);
		btnAzul.addActionListener(azul);
	}
	
	private class ColorFondo  implements ActionListener{
		
		private Color colorFondo;

		public ColorFondo(Color c) {
			
			colorFondo = c;
			
		}
		
		//actionPerdormed = acción Realizada
		public void actionPerformed(ActionEvent e) {
			
			setBackground(colorFondo);
		}
	}// termina clase interna las internas deben ser privadas

}

