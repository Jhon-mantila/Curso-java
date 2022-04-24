package ventanasemergentes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Ventanas_emergentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marco_ventana mimarco = new Marco_ventana();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco_ventana extends JFrame{
	
	public Marco_ventana() {
	
		setTitle("Ventanas Emergentes");
		
		setBounds(500,100,500,500);
		
		Lamina_ventana milamina = new Lamina_ventana();
		
		add(milamina);
		
		setVisible(true);
		
	}
	
}

class Lamina_ventana extends JPanel{
	
	private JButton btn1, btn2, btn3, btn4;
	
	public Lamina_ventana() {
		
		btn1 = new JButton("Boton 1");	
		btn2 = new JButton("Boton 2");		
		btn3 = new JButton("Boton 3");		
		btn4 = new JButton("Boton 4");
		
		btn1.addActionListener(new Accion_botones());
		btn2.addActionListener(new Accion_botones());
		btn3.addActionListener(new Accion_botones());
		btn4.addActionListener(new Accion_botones());

		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		
	}
	
	private class Accion_botones implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if (e.getSource() == btn1) {
				
				//System.out.println("Has pulsado el boton 1");
				
				//JOptionPane.showMessageDialog(Lamina_ventana.this, "Ventana Emergente");
				
				JOptionPane.showMessageDialog(Lamina_ventana.this, "Mensaje ventana emergente", "Titulo de la ventana Emergente", JOptionPane.ERROR_MESSAGE);
			}else if (e.getSource() == btn2) {
				
				//System.out.println("Has pulsado el boton 2");
				
				//JOptionPane.showInputDialog("Ingresa datos");
				
				JOptionPane.showInputDialog(Lamina_ventana.this, "Introduce Datos", "Titulo del input", JOptionPane.INFORMATION_MESSAGE);
				
			}else if (e.getSource() == btn3) {
				
				//System.out.println("Has pulsado el boton 3");
				JOptionPane.showConfirmDialog(Lamina_ventana.this, "Mensaje interno", "Titulo del Dialogo", JOptionPane.YES_NO_CANCEL_OPTION);
				
				
			}else if (e.getSource() == btn4) {
				
				//System.out.println("Has pulsado el boton 4");
				
				JOptionPane.showOptionDialog(Lamina_ventana.this, "Mensaje interno", "Titulo del option", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon("src/graficos/animacion.0006.png"), null, null);
			}
			
			
		}
		
	}
	
	
}