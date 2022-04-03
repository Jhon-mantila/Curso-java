package layoutsandcomponentes;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

public class Control_jspinner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_spinner2 mimarco = new Marco_spinner2();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Marco_spinner2 extends JFrame{
	
	public Marco_spinner2() {
		
		setTitle("Jspinner");
		
		setBounds(500,100,500,500);
		
		LaminaSpinner2 lamina = new LaminaSpinner2();
		
		add(lamina);
		
		setVisible(true);
	}
	
}

class LaminaSpinner2 extends JPanel{
	
	public LaminaSpinner2() {
		//craando una clase interna anonima 
		JSpinner mispinner = new JSpinner(new SpinnerNumberModel(5,0,10,1) {
			
			public Object getNextValue() {
				
				return super.getPreviousValue();			
			}
			
			public Object getPreviousValue() {
				
				return super.getNextValue();
			}
			
		});
		
		Dimension d = new Dimension(230,30);
		
		mispinner.setPreferredSize(d);
		
		add(mispinner);
		
	}
	
	//Clase interna Spinner
	/*private class Mi_modelo_jspinner extends SpinnerNumberModel {
		
		public Mi_modelo_jspinner() {
			
			//Constructor clase padre
			super(5,0,10,1);
		}
		
		public Object getNextValue() {
			
			return super.getPreviousValue();			
		}
		
		
		public Object getPreviousValue() {
			
			return super.getNextValue();
		}
		
	}*/
}