package disposicionencaja;


import javax.swing.*;

public class Disposicion_muelle {
	
	public static void main(String[] args) {
		
		Marco_muelle mimarco = new Marco_muelle();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

class Marco_muelle extends JFrame{
	
	public Marco_muelle() {
		
		setTitle("Disposición en muelle");
		setBounds(500,100,500,500);
		
		Lamina_muelle milamina = new Lamina_muelle();
		
		add(milamina);
		
		setVisible(true);
		
	}
}

class Lamina_muelle extends JPanel{
	
	public Lamina_muelle() {
		
		JButton btn1 = new JButton("Boton 1");
		
		JButton btn2 = new JButton("Boton 2");
		
		JButton btn3 = new JButton("Boton 3");
		
		SpringLayout milayout = new SpringLayout();
		
		setLayout(milayout);
		
		add(btn1);
		add(btn2);
		add(btn3);
		
		Spring mimuelle = Spring.constant(0,0,100);
		
		Spring  muelle_rigido =  Spring.constant(80);
		
		//this hace referencia a la lamina por que estamos en la lamina
		milayout.putConstraint(SpringLayout.WEST, btn1, mimuelle, SpringLayout.WEST, this);
		
		milayout.putConstraint(SpringLayout.WEST, btn2, muelle_rigido, SpringLayout.EAST, btn1);
		
		milayout.putConstraint(SpringLayout.WEST, btn3, mimuelle, SpringLayout.EAST, btn2);
		
		milayout.putConstraint(SpringLayout.EAST, this, mimuelle, SpringLayout.EAST, btn3);
		
	}
}
