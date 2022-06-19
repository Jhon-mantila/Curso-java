package sockets;

import javax.swing.*;
import java.awt.event.*;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCliente mimarco = new MarcoCliente();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoCliente extends JFrame{
	
	public MarcoCliente() {
		
		setBounds(600,300,280,350);
		
		setTitle("Cliente");
		
		LaminaMarcoCliente milamina = new LaminaMarcoCliente();
		
		add(milamina);
		
		setVisible(true);
		
	}
}

class LaminaMarcoCliente extends JPanel{
	
	private JLabel texto;
	
	private JTextField campo;
	
	private JButton enviar;
	
	
	public LaminaMarcoCliente() {
		
		texto = new JLabel("Cliente");
		
		campo = new JTextField(20);
		
		enviar = new JButton("Enviar");
		
		enviar.addActionListener(new EnviaTexto());
		
		add(texto);
		add(campo);
		add(enviar);
	}
	
	private class EnviaTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			System.out.println(campo.getText());
			
			try {
				
				Socket misocket = new Socket("192.168.46.2", 9999);
				
				DataOutputStream flujo_salida = new DataOutputStream(misocket.getOutputStream());
				
				flujo_salida.writeUTF(campo.getText());
				
				flujo_salida.close();
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Mensaje error: " + e.getMessage());
				//e.printStackTrace();
			}
			
			
		}
		
	}
}