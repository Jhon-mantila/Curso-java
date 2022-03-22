package layoutsandcomponentes;

import java.awt.*;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class CampoPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoPassword mimarco = new MarcoPassword();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoPassword extends JFrame{

	public MarcoPassword() {
		
		setTitle("Verificación Campos Contraseña");
		
		setBounds(500,100,500,200);
		
		laminaPassword lamina = new laminaPassword();
		
		add(lamina);
		
		setVisible(true);
		
	}
	
}

class laminaPassword extends JPanel {
	
	private JPasswordField c_contra;
	
	public laminaPassword() {
		
		setLayout(new BorderLayout());
		
		JPanel laminasuperior = new JPanel();
		
		laminasuperior.setLayout(new GridLayout(2,2));
		
		add(laminasuperior, BorderLayout.NORTH);
		
		
		JLabel etiqueta1 = new JLabel("Usuario");
		
		JLabel etiqueta2 = new JLabel("Contraseña");
		
		JTextField c_usuario = new JTextField(15);
		
		c_contra = new JPasswordField(15);
		
		Comprueba_pass evento = new Comprueba_pass();
		
		c_contra.getDocument().addDocumentListener(evento);
		
		laminasuperior.add(etiqueta1);
		laminasuperior.add(c_usuario);
		
		laminasuperior.add(etiqueta2);
		laminasuperior.add(c_contra);
		
		JButton enviar = new JButton("enviar");
		
		add(enviar, BorderLayout.SOUTH);
		
		
	}
	
	
	private class Comprueba_pass implements DocumentListener{
		char[] contrasena;
		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
			
			contrasena = c_contra.getPassword();
			
			if(contrasena.length < 8 || contrasena.length > 12) {
				
				c_contra.setBackground(Color.red);
				
			}else {
				
				c_contra.setBackground(Color.green);
			}
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			contrasena = c_contra.getPassword();
			
			if(contrasena.length < 8 || contrasena.length > 12) {
				
				c_contra.setBackground(Color.red);
				
			}else {
				
				c_contra.setBackground(Color.green);
			}
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}