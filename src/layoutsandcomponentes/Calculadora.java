package layoutsandcomponentes;

import java.awt.*;

import javax.swing.*;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCalculadora mimarco = new MarcoCalculadora();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		
	}

}

class MarcoCalculadora extends JFrame{
	
	public MarcoCalculadora () {
		
		setTitle("Calculadora");
		
		setBounds(500,300,450,300);
		
		Lamina_Pantalla lamina = new Lamina_Pantalla();
		
		add(lamina);
		
	}
	
}

class Lamina_Pantalla extends JPanel{
	
	private JPanel LaminaCuerpo;
	
	public Lamina_Pantalla() {
		
		setLayout(new BorderLayout());
		
		JButton btnPantalla = new JButton("0");
		
		btnPantalla.setEnabled(false);
		
		add(btnPantalla, BorderLayout.NORTH);
		
		
		LaminaCuerpo = new JPanel();
		
		LaminaCuerpo.setLayout(new GridLayout(4,4));
						
		/*JButton boton1 = new JButton("1");
		
		LaminaCuerpo.add(boton1);
		
		JButton boton2 = new JButton("2");
		
		LaminaCuerpo.add(boton2);*/
		
		ponerBoton("7");
		ponerBoton("8");
		ponerBoton("9");
		ponerBoton("/");
		
		ponerBoton("4");
		ponerBoton("5");
		ponerBoton("6");
		ponerBoton("*");
		
		ponerBoton("1");
		ponerBoton("2");
		ponerBoton("3");
		ponerBoton("-");
		
		ponerBoton("0");
		ponerBoton(".");
		ponerBoton("=");
		ponerBoton("+");
		
		add(LaminaCuerpo, BorderLayout.CENTER);
		
		
	}
	
	private void ponerBoton(String rotulo) {
		
		JButton boton = new JButton(rotulo);
		
		LaminaCuerpo.add(boton);
	}
}