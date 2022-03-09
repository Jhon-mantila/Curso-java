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
		
		setSize(500,300);
		
	}
	
}
