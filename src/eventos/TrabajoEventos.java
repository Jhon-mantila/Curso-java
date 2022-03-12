package eventos;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TrabajoEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoBotones mimarco = new MarcoBotones();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoBotones extends JFrame{
	
	public MarcoBotones(){
		
		setTitle("Envento con Botones");
		
		setBounds(700,300,500,300);
		
		LaminaBotones lamina = new LaminaBotones();
		
		add(lamina);
	
		setVisible(true);
		
	}
}

/*
 *3 factores
 *Envento: al hacer clic en el  boton
 *Fuente:  El boton
 *listener: la lamina
 * 
 * */

class LaminaBotones extends JPanel implements ActionListener{
	
	//Fuente
	JButton btnNegro = new JButton("Negro");
	JButton btnAmarillo = new JButton("Amarillo");
	JButton btnAzul = new JButton("Azul");
	
	public LaminaBotones() {
		
		add(btnNegro);
		add(btnAmarillo);
		add(btnAzul);
		
		btnNegro.addActionListener(this);
		btnAmarillo.addActionListener(this);
		btnAzul.addActionListener(this);
	}
	//actionPerdormed = acción Realizada
	public void actionPerformed(ActionEvent e) {
		
		//getSource devuelve la fuente
		Object botonPulsado = e.getSource();
		
		if(botonPulsado==btnNegro) {
			
			setBackground(Color.BLACK);
			
		}else if(botonPulsado == btnAmarillo) {
			
			setBackground(Color.YELLOW);
			
		}else {
			
			setBackground(Color.BLUE);
		}
		
		
		
	}



	
}