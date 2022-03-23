package layoutsandcomponentes;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Area_texto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_area2 mimarco = new Marco_area2();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}

class Marco_area2 extends JFrame{
	
	private JPanel laminaBotones;
	
	private JButton insertar, botonSaltoLinea;
	
	private JTextArea areaTexto;
	
	private JScrollPane laminaBarras;
	
	public Marco_area2() {
					
		setTitle("Ejemplo marco de area");
		
		setBounds(500,200,500,500);
				 
		setLayout(new BorderLayout());
		
		
		laminaBotones = new JPanel();
		
		insertar = new JButton("insertar");
		
		insertar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				areaTexto.append("En lugar de la mancha de cuyo nombre no quiero acordarme,  ");
			}
			
			
		});
		
		laminaBotones.add(insertar);
		
		botonSaltoLinea = new JButton("Salto Línea");
		
		botonSaltoLinea.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				boolean saltar = !areaTexto.getLineWrap();
				
				areaTexto.setLineWrap(saltar);
				
				/*if(saltar==true) {
					
					botonSaltoLinea.setText("Quitar salto");
					
				}else {
					
					botonSaltoLinea.setText("Salto Línea");
										
				}*/
				
				//operador ternario
				
				botonSaltoLinea.setText(saltar ? "Quitar Salto" : "Salto Línea");
			}
			
			
		});
		
		laminaBotones.add(botonSaltoLinea);
		
		add(laminaBotones, BorderLayout.SOUTH);
		
		
		areaTexto = new JTextArea();
		
		laminaBarras = new JScrollPane(areaTexto);
		
		add(laminaBarras, BorderLayout.CENTER);
		
	}
}

