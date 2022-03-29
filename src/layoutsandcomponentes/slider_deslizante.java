package layoutsandcomponentes;

import javax.swing.*;

import java.awt.*;

public class slider_deslizante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marco_slider mimarco = new Marco_slider();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco_slider extends JFrame{
	
	public Marco_slider() {
		
		setTitle("Slider DESLIZANTES");
		
		setBounds(500,100,500,500);
		
		Lamina_slider lamina = new Lamina_slider();
				
		add(lamina);
		
		setVisible(true);
	}
}

class Lamina_slider extends JPanel{
	
	public Lamina_slider() {
		
		JSlider control = new JSlider(SwingConstants.VERTICAL, 0,100,50);
		
		control.setOrientation(SwingConstants.HORIZONTAL);
		
		control.setMajorTickSpacing(35);
		
		control.setMinorTickSpacing(10);
		
		control.setPaintTicks(true);
		
		control.setFont(new Font("Brush Script MT", Font.ITALIC, 12));
		
		control.setPaintLabels(true);
		
		control.setSnapToTicks(true);
		
		add(control);
		
	}
}

