package poo;

public interface Trabajadores {
	
	public abstract double establece_bonus(double gratificacion);
	
	/*SOLO SE PUEDEN CREAR CONSTANTES EN INTERFAACES
	 * y todas son public y staticas
	 * */

	public static double bonus_base = 300000;
}
