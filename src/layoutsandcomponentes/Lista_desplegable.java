package layoutsandcomponentes;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

public class Lista_desplegable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_desplegable mimarco = new Marco_desplegable();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Marco_desplegable extends JFrame {
	
	public Marco_desplegable() {
		
		setTitle("ComboBox");
		
		setBounds(500,100,500,500);
		
		Lamina_desplegable lamina = new Lamina_desplegable();
		
		add(lamina);
		
		setVisible(true);
	}
}


class Lamina_desplegable extends JPanel{

	private JLabel texto;
	
	private JComboBox combo;
	
		public Lamina_desplegable() {
			
			setLayout(new BorderLayout());
			
			texto = new JLabel("En un lugar de la mancha de cuyo nombre:::");
			
			texto.setFont(new Font("Serif", Font.PLAIN, 22));
			
			add(texto, BorderLayout.CENTER);
			
			JPanel lamina_norte = new JPanel();
			
			combo = new JComboBox();
			
			combo.setEditable(true);
			
			//familias genericas
			combo.addItem("Serif");
			combo.addItem("SansSerif");
			combo.addItem("MonoSpaced");
			combo.addItem("Dialog");
			
			lamina_norte.add(combo);
			
			eventoCombo evento = new eventoCombo();
			
			combo.addActionListener(evento);
			
			add(lamina_norte, BorderLayout.NORTH);
		}
		
		private class eventoCombo implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				texto.setFont(new Font((String)combo.getSelectedItem(), Font.PLAIN, 22));
			}
			
		}
}