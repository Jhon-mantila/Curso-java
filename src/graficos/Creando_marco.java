package graficos;
import javax.swing.*;

public class Creando_marco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	 Mi_marco marco = new Mi_marco();
	 
	 
	 
	 marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	 marco.setVisible(true);
		
	}

}

class Mi_marco extends JFrame {
	
	public Mi_marco() {
		
		/*setSize(500,300);
		
		setLocation(300,100);*/
		
		setBounds(300,100, 250, 250);
		
		//setResizable(false); // no deja redimencionar
		
		setExtendedState(JFrame.MAXIMIZED_BOTH); // mazimizar todo
		
		setTitle("Mi ventana");
		
	}
	
}
