package programaciongenerica;
//asi indicamos que es una clase generica por conveniencia se usa letra mayusculas
public class Pareja<T> {
	
	public Pareja() {
		
		primero = null;
		
	}
	
	public void set_primero(T nuevoValor) {
		
		primero = nuevoValor;
	}
	
	public T get_primero() {
		
		return primero;
	}
	
	private T primero;

}
