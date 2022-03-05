package poo;

public class Clase1 {
	
	/*Modificador  Clase  package    subclase   todos
	 * Public        si     si          si        si
	 * Protected     si     si          si        no
	 * Private       si     no          no        no
	 * Por defecto   si     si          no        no
	 * */
	
	//estamos usando modifcador por defecto que permite ver en la clase y en el packete

	int mivar = 5;
	
	int mivar2 = 7;
	
	protected String mimetodo() {
		
		return "El valor de mivar2 es: " + mivar2;
	}
}
