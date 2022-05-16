package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Acceso_Fichero_Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Leer_fichero_buffer leerFichero = new Leer_fichero_buffer();
		
		leerFichero.leer();
	}

}

class Leer_fichero_buffer{
	
private FileReader entrada;

	public void leer () {
		
		try {
			
			entrada = new FileReader("src/ficheros/fichero2.txt");
			
			BufferedReader mibuffer = new BufferedReader(entrada);
			
			String linea = "";
			
			while(linea != null) {
				
				linea = mibuffer.readLine();
				
				if (linea != null)
				System.out.println(linea);
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}	
