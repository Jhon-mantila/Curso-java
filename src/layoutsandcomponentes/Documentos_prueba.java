package layoutsandcomponentes;

import javax.swing.*;

import javax.swing.event.*;

import javax.swing.text.Document;

import java.awt.*;


//Se pordria usar para deshacer
public class Documentos_prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco_Document mimarco = new Marco_Document();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco_Document extends JFrame{
	
	public Marco_Document (){
		
		setTitle("Documentos");
		
		setBounds(500,100,500,500);
		
		LaminaDocumento lamina = new LaminaDocumento();
		
		add(lamina);
		
		setVisible(true);
		
	}
}

class LaminaDocumento extends JPanel{
	
	public LaminaDocumento() {
		
		JTextField campo = new JTextField(20);
		
		escuchaTexto evento = new escuchaTexto();
		
		Document miDoc = campo.getDocument();
		
		miDoc.addDocumentListener(evento);
		
		add(campo);
	}
	
	private class escuchaTexto implements DocumentListener{

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("has introducido texto");
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Has Borrado texto");
		}
		
	}
}


