package ficherosdirectorios;

import java.io.*;

public class Acceso_ficheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File ruta = new File("C:/Users/Casa/Desktop/Compartir");
		
		System.out.println(ruta.getAbsolutePath());
		
		
		String[] nombres_archivos = ruta.list();
		
		
		for(int i=0; i<nombres_archivos.length;i++) {
			
			System.out.println(nombres_archivos[i]);
			
			File rutas_directorio = new File(ruta.getAbsoluteFile(), nombres_archivos[i]);
			
			System.out.println(rutas_directorio.isDirectory());
			
			if(rutas_directorio.isDirectory()) {
				
				String[] directorio_hijo = rutas_directorio.list();
				
				for(String e: directorio_hijo) {
					
					System.out.println(e);
				}
				
			}
		}
		
		
				
	}

}
