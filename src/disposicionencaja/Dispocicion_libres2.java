package disposicionencaja;

import java.awt.*;

import javax.swing.*;

public class Dispocicion_libres2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_libre2 mimarco = new Marco_libre2();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}


class Marco_libre2 extends JFrame{
	
	public Marco_libre2() {
		
		setTitle("Disposición Libres");
		
		setBounds(500,100,500,500);
		
		Lamina_libre2 milamina = new Lamina_libre2();
		
		add(milamina);
		
		
	}
}

class Lamina_libre2 extends JPanel{
	
	public Lamina_libre2() {
		
		setLayout(new EnColumnas());
		
	
		JLabel nombre = new JLabel("Nombre: ");
		
		JLabel apellido = new JLabel("Apellido: ");
		
		JTextField c_nom = new JTextField(10);
		
		JTextField c_ape = new JTextField(10);
		
		JLabel edad = new JLabel("Edad: ");
		
		JTextField c_edad = new JTextField(10);
		
		JButton miboton = new JButton("Mi Boton");
		
		JButton miboton2 = new JButton("Mi Boton 2");
		
		/*nombre.setBounds(15, 5, 100, 50);
		
		c_nom.setBounds(110, 20, 100, 20);
		
		apellido.setBounds(15, 55, 100, 50);
		
		c_ape.setBounds(110, 70, 100, 20);*/
		
		
		add(nombre);
		add(c_nom);
		
		add(apellido);
		add(c_ape);
		
		add(edad);
		add(c_edad);
		
		add(miboton);
		add(miboton2);
	
		
	}
	
}

class EnColumnas implements LayoutManager{
	
	private int x;
	
	private int y = 20;

	@Override
	public void addLayoutComponent(String arg0, Component arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void layoutContainer(Container micontenedor) {
		// TODO Auto-generated method stub
		
		int d = micontenedor.getWidth();
		
		x = d/2;
		
		int contador = 0;
		
		int n = micontenedor.getComponentCount();
		
		for (int i = 0 ; i < n ; i++) {
			

			contador++;
			
			Component c = micontenedor.getComponent(i);
			
			c.setBounds(x-100, y, 100, 20);
			
			x+=100;
			
			if(contador%2 == 0) {
				
				x = d/2;
				y+=40;
			}
			
		}
		
		
	}

	@Override
	public Dimension minimumLayoutSize(Container e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension preferredLayoutSize(Container arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeLayoutComponent(Component arg0) {
		// TODO Auto-generated method stub
		
	}
	
}

