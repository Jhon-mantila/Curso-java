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
	//si quiero q este metodo: me traiga tambien los que herenden de empleados tengo
	//que usar un comodin 
	public static void imprimier_trabajador(Pareja<? extends Empleados1> p) {
		
		Empleados1 primero = p.get_primero();
		
		System.out.println(primero);
	}
	
	private T primero;

}
