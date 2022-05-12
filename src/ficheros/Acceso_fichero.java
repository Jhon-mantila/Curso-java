package ficheros;

import java.io.*;

public class Acceso_fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Leer_fichero obj = new Leer_fichero();
		
		obj.leer();
	}

}

class Leer_fichero {
	
	FileReader entrada;
	
	public void leer() {		
		
		try {
			
			entrada = new FileReader("src/ficheros/fichero.txt");
			
			int c = entrada.read();
			
			while (c!=-1) {
				
				c=entrada.read();
				
				char letra = (char)c;
				System.out.print(letra);
			}
			

		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
