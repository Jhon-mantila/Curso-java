package poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class Temporizador_n_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reloj mireloj = new Reloj();
		
		mireloj.iniciarHora(3000, true);
		
		JOptionPane.showMessageDialog(null, "Pulsa OK para terminar....");
	}

}


class Reloj {
	
	/*private int intervalo;
	
	private boolean sonido;
	
	
	public Reloj(int intervalo, boolean sonido) {
		
		this.intervalo = intervalo;
		
		this.sonido = sonido;
		
	}*/
	
	public void iniciarHora(final int intervalo, final boolean sonido) {
		
	  class DameLaHora implements ActionListener {
			//Clase interna local va dentro de un meteodo y solo sepuede hacer esto siempre y cuando solo se instancie una sola vez
			public void actionPerformed(ActionEvent e) {
				
				Date la_hora = new Date();
				
				System.out.println("la hora cada: " + intervalo/1000 + " sonido: " + sonido + "Hora: " + la_hora);
				
				if (sonido) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
		}//clase interna las clases internas deben ser private, y la ventaja es que pueden utilizar las propiedades de la primera clase
		
		ActionListener oyente = new DameLaHora();
		
		Timer miTemporizador = new Timer(intervalo, oyente);
		
		miTemporizador.start();
	}
	
	
}