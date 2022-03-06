package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class Temporizador_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hora oyente = new Hora();
		
		//ActionListener oyente = new Hora();
		
		Timer mitemporizador = new Timer(5000, oyente);
					
		mitemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener");
		
		System.exit(0);
	}

}

class Hora implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		
		Date la_hora = new Date();
		
		System.out.println("te pongo la hora cada 5 sg: " + la_hora);
		
		Toolkit.getDefaultToolkit().beep();
		
	}
}
