package eventos;

import javax.swing.*;

import java.awt.event.*;

public class FocoVentana extends JFrame implements WindowFocusListener {

	FocoVentana marco1;
	FocoVentana marco2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FocoVentana miventana =new FocoVentana();
		miventana.iniciar();
	}
	
	public void iniciar() {
		
		marco1 = new FocoVentana();
		marco2 = new FocoVentana();
		
		marco1.setVisible(true);
		marco2.setVisible(true);
		
		marco1.setBounds(300,100,500,500);
		marco2.setBounds(1200,100,500,500);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco1.addWindowFocusListener(this);
		marco2.addWindowFocusListener(this);
	}

	@Override
	public void windowGainedFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == marco1) {
			
			marco1.setTitle("Tengo el Foco!!!");
			
		}else {
			
			marco2.setTitle("Tengo el Foco!!!");
		}
		
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		
	if (e.getSource() == marco1) {
			
			marco1.setTitle("");
			
		}else {
			
			marco2.setTitle("");
		}
		
	}

}
