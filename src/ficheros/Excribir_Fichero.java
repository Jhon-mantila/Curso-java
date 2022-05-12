package ficheros;

import java.io.*;

public class Excribir_Fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Escribir_fichiero accede = new Escribir_fichiero();
		accede.esribir();
	}

}

class Escribir_fichiero {
	
	public void esribir() {
		
		String frase = "Escribiendo mi primer ficherossssssssssssssssssssssssssss";
		
		try {
			//Crear un fichero
			//FileWriter escritura = new FileWriter("src\\ficheros\\texto_nuevo.txt");
			//para sobreescribir un fichero existente
			FileWriter escritura = new FileWriter("src\\ficheros\\texto_nuevo.txt", true);
			
			for(int i = 0; i < frase.length(); i++) {
				
				escritura.write(frase.charAt(i));
			}
			
			escritura.close();
			
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
