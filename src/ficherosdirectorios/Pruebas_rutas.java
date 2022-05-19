package ficherosdirectorios;

import java.io.*;

public class Pruebas_rutas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//archivos o directorios(carpetas)
		File archivo = new File("bin");
		
		//imprime la ruta absoluta
		System.out.println(archivo.getAbsolutePath());
		
		//Verifica si el archivo existe
		System.out.println(archivo.exists());
	}

}
