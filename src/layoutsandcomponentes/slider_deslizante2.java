package layoutsandcomponentes;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class slider_deslizante2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marco_slider2 mimarco = new Marco_slider2();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco_slider2 extends JFrame{
	
	public Marco_slider2() {
		
		setTitle("Slider DESLIZANTES mas enventos");
		
		setBounds(500,100,500,500);
		
		Lamina_slider2 lamina = new Lamina_slider2();
				
		add(lamina);
		
		setVisible(true);
	}
}

class Lamina_slider2 extends JPanel{
	
	private JLabel texto;
	
	private JSlider control;
	
	private static int contador;
	
		public Lamina_slider2() {
			
			setLayout(new BorderLayout());
			
			texto = new JLabel("En un lugar de la mancha de cuyo nombre...........");
			
			add(texto, BorderLayout.CENTER);
			
			control = new JSlider(SwingConstants.HORIZONTAL, 5,55,14);
			
			control.setMajorTickSpacing(10);
			
			control.setMinorTickSpacing(1);
			
			control.setPaintTicks(true);
			
			control.setPaintLabels(true);
			
			control.setFont(new Font("Tahoma", Font.ITALIC, 14));
			
			control.addChangeListener(new Slider_evento());
			
			JPanel laminaSlider = new JPanel();
			
			laminaSlider.add(control);
			
			add(laminaSlider, BorderLayout.NORTH);
						
		}
		
		private class Slider_evento implements ChangeListener{

			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				
				contador++;
				System.out.println(control.getValue() + " contador." + contador);
				texto.setFont(new Font("Tahoma", Font.ITALIC, control.getValue()));
			}

		}
}

