package leyendo_escribiendo_bytes;

import java.io.*;

public class Lectura_escritura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 0;
		
		int datos_entrada[] = new int[4906];
		
		try {
			
			FileInputStream archivo_lectura = new FileInputStream("src/leyendo_escribiendo_bytes/animacion.0006.png");
			
			boolean final_archivo = false;

			while(!final_archivo) {
				
				int byte_entrada = archivo_lectura.read();
				
				//para no meter el menos uno
				if (byte_entrada != -1)
					
					datos_entrada[contador] = byte_entrada;
				
				else
				   final_archivo = true;
				
				System.out.println("Contador: "+contador+ " Valor array: "+datos_entrada[contador]);
				
				contador++;
			}
			
			
			
			archivo_lectura.close();		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se encuentra la imagen");
		}
		
		System.out.println(contador);
		crear_Fichero(datos_entrada);
	}
	
	static void crear_Fichero(int datos_nuevo_fichero[]) {
		
		try {
			
			FileOutputStream fichero_nuevo = new FileOutputStream("src/leyendo_escribiendo_bytes/animacion_copia.png");
			
			for(int i = 0; i <datos_nuevo_fichero.length; i++) {
				
				fichero_nuevo.write(datos_nuevo_fichero[i]);
			}
			
			fichero_nuevo.close();
		}catch(IOException e) {
			
			System.out.println("No se encuentra los bytes");
		}
		
	}

}
