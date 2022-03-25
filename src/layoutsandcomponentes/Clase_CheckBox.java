package layoutsandcomponentes;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

public class Clase_CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_checkbock mimarco = new Marco_checkbock();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class Marco_checkbock extends JFrame{

	public Marco_checkbock() {
		
		setTitle("Checkbox");
		
		setBounds(500,100,500,500);
		
		Lamina_check lamina = new Lamina_check();
		
		add(lamina);
		
		setVisible(true);
		
	}
}

class Lamina_check extends JPanel{
	
	private JLabel texto;
	
	private JCheckBox check1, check2;

	
		public Lamina_check() {
			
			setLayout(new BorderLayout());
			
			Font miletra = new Font("Serif", Font.PLAIN, 24);
			
			texto = new JLabel ("En un lugar de la mancha de cuyo nombre........");
			
			texto.setFont(miletra);
			
		
			
			JPanel lamina2 = new JPanel();
			
			lamina2.add(texto);
			
			add(lamina2, BorderLayout.CENTER);
			
			check1 = new JCheckBox("Negrita");
			
			check2 = new JCheckBox("Cursiva");
			
			check1.addActionListener(new ManejaChecks());
			
			check2.addActionListener(new ManejaChecks());
			
			JPanel laminaCheck = new JPanel();
			
			laminaCheck.add(check1);
			
			laminaCheck.add(check2);
			
			add(laminaCheck, BorderLayout.SOUTH);
			
		}
		
		private class ManejaChecks implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				int tipo = 0;
				
				if(check1.isSelected()) tipo+=Font.BOLD;
				
				if (check2.isSelected()) tipo+=Font.ITALIC;
				
				texto.setFont(new Font("Serif", tipo, 24));
				
			}
			
		}
}
