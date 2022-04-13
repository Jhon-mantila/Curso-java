package layoutsandcomponentes;

import javax.swing.*;

import java.awt.*;

public class Menu_Emergente {
	
	public static void main(String [] args) {
		
		Marco_emergente mimarco = new Marco_emergente();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class Marco_emergente extends JFrame{
	
	public Marco_emergente() {
		
		setTitle("Menu emergente");
		
		setBounds(300,100,500,500);
		
		LaminaEmergente lamina = new LaminaEmergente();
		
		add(lamina);
		
		setVisible(true);
	}
}

class LaminaEmergente extends JPanel{
	
	public LaminaEmergente() {
		
		setLayout(new BorderLayout());
		
		JPanel laminamenu = new JPanel();
		
		JMenuBar mibarra  = new JMenuBar();
		
		JMenu fuente = new JMenu("Fuente");
		JMenu estilo = new JMenu("Estilo");
		JMenu tam = new JMenu("Tamaño");
		
		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(tam);
		
		laminamenu.add(mibarra);
		
		add(laminamenu, BorderLayout.NORTH);	
		
		JTextPane miarea = new JTextPane();
		
		add(miarea, BorderLayout.CENTER);
		
		JPopupMenu emergente = new JPopupMenu();
		
		JMenuItem opc1 = new JMenuItem("Opcion1");
		JMenuItem opc2 = new JMenuItem("Opcion2");
		JMenuItem opc3 = new JMenuItem("Opcion3");
		JMenuItem opc4 = new JMenuItem("Opcion4");
		
		emergente.add(opc1);
		emergente.add(opc2);
		emergente.add(opc3);
		emergente.add(opc4);
		
		laminamenu.setComponentPopupMenu(emergente);
		miarea.setComponentPopupMenu(emergente);
		
		
		
	}
}
