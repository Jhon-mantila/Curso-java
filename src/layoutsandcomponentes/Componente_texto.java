package layoutsandcomponentes;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*; 

public class Componente_texto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_texto mimarco = new Marco_texto();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco_texto extends JFrame {
	
	public Marco_texto() {
		
		setTitle("Componente Texto");
		
		setBounds(500,100,500,500);
		
		Lamina_Texto lamina = new Lamina_Texto();		
				
		add(lamina);
		
		setVisible(true);
	
	}
	

}

class Lamina_Texto extends JPanel{
	
	private JTextField campo1;
	
	private int arroba;
	
	private JLabel resultado;
	
	JPanel LaminaResultado;
	
	public Lamina_Texto() {
		
		//JTextField campo1 = new JTextField("      Texto Por defecto..",20);
		//setLayout(new FlowLayout(FlowLayout.CENTER));
		
		//utilizo las dispociones al reves a la principal utilizo el borderlayout y a la segunda lamina uso el flowlayout
		setLayout(new BorderLayout());
		
		LaminaResultado = new JPanel();
		
		LaminaResultado.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Email:");
		
		LaminaResultado.add(label);
		
		campo1 = new JTextField(20);
		
		LaminaResultado.add(campo1);
		
		//System.out.println(campo1.getText().trim());
		
		JButton boton = new JButton("Verificar");
		
		DameTexto mievento = new DameTexto();
		
		boton.addActionListener(mievento);
		
		LaminaResultado.add(boton);
		
		add(LaminaResultado, BorderLayout.NORTH);
		
		
		resultado = new JLabel("resultado", JLabel.CENTER);
		
		
		Font labelfont = resultado.getFont();
		
		resultado.setFont(new Font(labelfont.getName(), Font.BOLD, 36));
		
	 
		add(resultado, BorderLayout.CENTER);
		
	}
	
	private class DameTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			arroba = 0;
			
			System.out.println(campo1.getText().trim());
			
			String correo = campo1.getText().trim();
			
			System.out.println(correo.length());
			
			for(int i=0; i<correo.length(); i++) {
					
				if (correo.charAt(i) == '@') {
					
					arroba++;
					System.out.println("Encontro @:" + i + " Cantidad: " + arroba);
					
				}
				
				if(arroba == 1) {
					
					resultado.setText("Email Correcto");
					
				}else {
					
					resultado.setText("Email Incorrecto");
					
				}
			}
			

		}
		
		
	}//clase plrivada 
	

}

