package sockets.chat;

import javax.swing.*;
import java.awt.event.*;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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

class LaminaMarcoCliente extends JPanel implements Runnable{
	
	private JLabel texto, nick, n_nick;
	
	private JTextField campo;
	
	private JComboBox ip;
	
	private JButton enviar;
	
	private JTextArea miarea;
	
	private String usuario; 
	
	public LaminaMarcoCliente() {
		
		usuario = JOptionPane.showInputDialog("Nick: ");
		
		nick = new JLabel("Nick:");
		add(nick);
		nick = new JLabel(usuario);
		add(nick);
		
		texto = new JLabel("Online:");
		add(texto);

		ip = new JComboBox();
		ip.addItem("Usuario 1");
		ip.addItem("Usuario 2");
		ip.addItem("Usuario 3");
		add(ip);
		
		miarea = new JTextArea(12,22);
		add(miarea);
		campo = new JTextField(20);
		add(miarea);
		enviar = new JButton("Enviar");
		
		enviar.addActionListener(new EnviaTexto());
		
		
		add(campo);
		add(enviar);
		
		Thread mihilo = new Thread(this);
		
		mihilo.start();
	}
	
	private class EnviaTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			System.out.println(campo.getText());
			
			miarea.append("\n" + campo.getText());
			
			try {
				
				Socket misocket = new Socket("192.168.1.5", 9998);
				
				PaqueteEnvio paquete = new PaqueteEnvio();
				
				paquete.setIp(ip.getSelectedItem().toString());
				
				paquete.setNick(nick.getText());
				
				paquete.setMensaje(campo.getText());
				
				ObjectOutputStream paquete_datos = new ObjectOutputStream(misocket.getOutputStream());
				
				paquete_datos.writeObject(paquete);
				
				
						
				misocket.close();
				
				campo.setText("");
				
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

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			
			ServerSocket servidor_cliente = new ServerSocket(9090);
			
			Socket cliente;
			
			String ip, mensaje, nick;
			
			PaqueteEnvio paquete_recibido;
			
			while(true) {
				
				cliente = servidor_cliente.accept();
			
				ObjectInputStream flujo_entrada = new ObjectInputStream(cliente.getInputStream());
				
				paquete_recibido = (PaqueteEnvio) flujo_entrada.readObject();
				
				nick = paquete_recibido.getNick();
				ip = paquete_recibido.getIp();
				mensaje= paquete_recibido.getMensaje();
				
				miarea.append("\n"+nick + " : " + mensaje);
				
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
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