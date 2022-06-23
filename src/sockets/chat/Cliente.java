package sockets.chat;

import javax.swing.*;
import java.awt.event.*;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
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
	
	private JTextField campo, nick, ip;
	
	private JButton enviar;
	
	private JTextArea miarea;
	
	
	public LaminaMarcoCliente() {
		
		nick = new JTextField(5);
		add(nick);
		texto = new JLabel("-Chat-");
		add(texto);
		ip = new JTextField(10);
		add(ip);
		miarea = new JTextArea(12,22);
		add(miarea);
		campo = new JTextField(20);
		add(miarea);
		enviar = new JButton("Enviar");
		
		enviar.addActionListener(new EnviaTexto());
		
		
		add(campo);
		add(enviar);
	}
	
	private class EnviaTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			System.out.println(campo.getText());
			
			try {
				
				Socket misocket = new Socket("192.168.1.6", 9998);
				
				PaqueteEnvio paquete = new PaqueteEnvio();
				
				paquete.setIp(ip.getText());
				
				paquete.setNick(nick.getText());
				
				paquete.setMensaje(campo.getText());
				
				ObjectOutputStream paquete_datos = new ObjectOutputStream(misocket.getOutputStream());
				
				paquete_datos.writeObject(paquete);
						
				misocket.close();
				
				/*DataOutputStream flujo_salida = new DataOutputStream(misocket.getOutputStream());
				
				flujo_salida.writeUTF(campo.getText());
				
				flujo_salida.close();*/
				
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

//se implementa la interfaz serializable para convertir el objeto en 0 y 1
class PaqueteEnvio implements Serializable{
	
	private String ip, nick, mensaje;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}