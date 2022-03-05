package poo;

import paquetes_pruebas.Modificador_de_Accesos;

public class Clase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Modificador  Clase  package    subclase   todos
		 * Public        si     si          si        si
		 * Protected     si     si          si        no
		 * Private       si     no          no        no
		 * Por defecto   si     si          no        no
		 * */
		
		Clase1 miobj = new Clase1();
		
		Modificador_de_Accesos miobj2 = new Modificador_de_Accesos();
		
		System.out.println(miobj2.mimetodo());
		
		System.out.println(miobj.mimetodo());
	}

}
