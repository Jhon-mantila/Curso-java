package eventos;

import javax.swing.*;

import java.awt.Graphics;
import java.awt.event.*;

public class Evento_foco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_foco mimarco = new Marco_foco();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class Marco_foco extends JFrame{
	
	public Marco_foco() {
		
		setTitle("eventos de foco");
		
		setBounds(500,100,500,500);
		
		//EventoFoco mifoco = new EventoFoco();
		
		LaminaFoco lamina = new LaminaFoco();
		
		add(lamina);
		
		setVisible(true);
		
		
	}
}

class LaminaFoco extends JPanel{
	
	JTextField cuadro1;
	
	JTextField cuadro2;
	
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		//Anulo el Layout
		setLayout(null);
		
		 cuadro1 = new JTextField();
		 
		 cuadro2 = new JTextField();
		
		 cuadro1.setBounds(120, 10, 150, 20);
		 
		 cuadro2.setBounds(120, 50, 150, 20);
		 
		 add(cuadro1);
		 
		 add(cuadro2);
		 
		 EventoFoco mifoco = new EventoFoco();
		 
		 cuadro1.addFocusListener(mifoco);
		 
		 
	}
	
	private class EventoFoco implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			//System.out.println("Has perdido el foco");
			
			String email = cuadro1.getText();
			
			boolean comprobacion = false;
			
			for(int i = 0; i<email.length(); i++) {
				
				if(email.charAt(i)=='@') {
					
					comprobacion = true;
				}
			}
			
			if(comprobacion) {
				
				System.out.println("Es correcto");
				
			}else {
				
				System.out.println("NO Es correcto");
			}
		}
		
		
	}
}


