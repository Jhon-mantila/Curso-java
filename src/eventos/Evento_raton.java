package eventos;

import javax.swing.*;
import java.awt.event.*;

public class Evento_raton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco_raton mimarco = new Marco_raton();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class Marco_raton extends JFrame{
	
	public Marco_raton() {
		
		setTitle("eventos de raton");
		
		setBounds(500,100,500,500);
		
		EventoRaton raton = new EventoRaton();
				
		addMouseListener(raton);
		
		setVisible(true);
	}
}



class EventoRaton implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Has dado Click");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("##Acabas de entrar al marco##");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("**Acabas de salir del marco**");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Tienes presionado el click");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Has quitado el dedo del click");
	}
	
}