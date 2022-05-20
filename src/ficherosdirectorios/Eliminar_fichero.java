package ficherosdirectorios;

import java.io.File;

public class Eliminar_fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ruta = new File("C:"+File.separator +"Users"+File.separator+"Casa"+File.separator+"Desktop"+File.separator+"Compartir"+File.separator+"Prueba_texto.txt");
		
		//Eliminar ficheros y directorios
		ruta.delete();
	}

}
