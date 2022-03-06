package poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.Timer;
import java.awt.Toolkit;

public class Temporizador_n_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reloj mireloj = new Reloj(3000, true);
		
		mireloj.iniciarHora();
		
		JOptionPane.showMessageDialog(null, "Pulsa OK para terminar....");
	}

}


class Reloj {
	
	private int intervalo;
	
	private boolean sonido;
	
	
	public Reloj(int intervalo, boolean sonido) {
		
		this.intervalo = intervalo;
		
		this.sonido = sonido;
		
	}
	
	public void iniciarHora() {
		
		ActionListener oyente = new DameLaHora();
		
		Timer miTemporizador = new Timer(intervalo, oyente);
		
		miTemporizador.start();
	}
	
	private class DameLaHora implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			Date la_hora = new Date();
			
			System.out.println("la hora cada: " + intervalo/1000 + " sonido: " + sonido);
			
			if (sonido) {
				Toolkit.getDefaultToolkit().beep();
			}
		}
	}
}