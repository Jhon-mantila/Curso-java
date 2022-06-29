package sockets.chat;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.*;

public class Servidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoServidor mimarco = new MarcoServidor();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}

class MarcoServidor extends JFrame implements Runnable{
	
	private JTextArea miarea;
	
	public MarcoServidor() {
		
		setBounds(1200,300,280,350);
		
		JPanel milamina = new JPanel();
		
		milamina.setLayout(new BorderLayout());		
		
		miarea = new JTextArea();
		
		milamina.add(miarea, BorderLayout.CENTER);
		
		add(milamina);
		
		Thread mihilo = new Thread(this);
		
		mihilo.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("estoy a la escucha");
		
		try {
			ServerSocket servidor = new ServerSocket(9998);
			
			String nick, ip, mensaje;
			
			PaqueteEnvio paquete_recibido;
			
			while(true) {
				
			//recibe el servidor
			Socket misocket = servidor.accept();
			
			//--------Dectecta dirección ip online-------------
			InetAddress localizacion = misocket.getInetAddress();
			
			String ipRemota = localizacion.getHostAddress();
			
			System.out.println(ipRemota);
			
			//-------------------------------------------------
						
			ObjectInputStream paquetes_datos = new ObjectInputStream(misocket.getInputStream());
						
			paquete_recibido = (PaqueteEnvio) paquetes_datos.readObject();
			
			nick = paquete_recibido.getNick();
			
			ip = paquete_recibido.getIp();
			
			mensaje = paquete_recibido.getMensaje();
			
			miarea.append("\nNick: " + nick + ": " + mensaje + " para: " + ip);
			
			//comunicación con el otro cliente
			Socket enviaDestinatario = new Socket(ip, 9090);
			
			ObjectOutputStream paqueteReenvio= new ObjectOutputStream(enviaDestinatario.getOutputStream());
			
			paqueteReenvio.writeObject(paquete_recibido);
			
			paqueteReenvio.close();
			
			enviaDestinatario.close();
			
			misocket.close();
			/*DataInputStream flujo_entrada = new DataInputStream(misocket.getInputStream());
			
			String mensaje_texto =  flujo_entrada.readUTF();
			
			miarea.append("\n" + mensaje_texto);
			
			flujo_entrada.close();**/
			

			}
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}