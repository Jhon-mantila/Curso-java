package ficherosdirectorios;

import java.io.*;

public class creando_ficheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ruta = new File("C:"+File.separator +"Users"+File.separator+"Casa"+File.separator+"Desktop"+File.separator+"Compartir"+File.separator+"Prueba_texto.txt");
		
		String archivo_destino = ruta.getAbsolutePath();
		
		//if(ruta.mkdir())
			//System.out.println("Creo Directorio");
		
		try {
			ruta.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Escribiendo accede_es = new Escribiendo();
		
		accede_es.escribir(archivo_destino);
		
	}

}

class Escribiendo {
	
	public void escribir(String ruta_archivo) {
		
		String frase = "El hombre que trabaja y bebe dejenlo gozar la vida";
		
		try {
			
			FileWriter escritura = new FileWriter(ruta_archivo);
			
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
