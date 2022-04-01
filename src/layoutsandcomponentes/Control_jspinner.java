package layoutsandcomponentes;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

public class Control_jspinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_spinner mimarco = new Marco_spinner();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Marco_spinner extends JFrame{
	
	public Marco_spinner() {
		
		setTitle("Jspinner");
		
		setBounds(500,100,500,500);
		
		LaminaSpinner lamina = new LaminaSpinner();
		
		add(lamina);
		
		setVisible(true);
	}
	
}

class LaminaSpinner extends JPanel{
	
	public LaminaSpinner() {
		
		JSpinner mispinner = new JSpinner(new SpinnerNumberModel(5,0,10,1));
		
		//String Lista[] = {"Enero", "Febrero", "Marzo", "Abril"};
		
		///String Lista[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		//JSpinner mispinner = new JSpinner(new SpinnerDateModel());
		
		//JSpinner mispinner = new JSpinner(new SpinnerListModel(Lista));
		
		Dimension d = new Dimension(230,30);
		
		mispinner.setPreferredSize(d);
		
		add(mispinner);
		
	}
}