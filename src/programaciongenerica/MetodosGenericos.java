package programaciongenerica;

import java.util.Date;
import java.util.GregorianCalendar;

public class MetodosGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombres[] = {"Jhon", "Daniela", "Jessika"};	
		
		System.out.println(MisMatrices.get_elementos(nombres));
		
		Empleado lista_emple[] = {
				new Empleado("Jhon", 34,3000000),
				new Empleado("Jhon", 34,3000000),
				new Empleado("Jhon", 34,3000000),
				new Empleado("Jhon", 34,3000000)
		};
		
		System.out.println(MisMatrices.get_elementos(lista_emple));
		
		String nombres1[] = {"Maria", "Pepe", "Jose"};	
		
		System.out.println(MisMatrices.get_menor_elementos(nombres1));
		
		GregorianCalendar fechas[] = {
				
				new GregorianCalendar(2021,07,12),
				new GregorianCalendar(2022,07,12),
				new GregorianCalendar(2018,07,12),
				new GregorianCalendar(2015,07,12),
				
		};
		
		GregorianCalendar fecha_menor;
		
		Date fecha_visible;
		
		fecha_menor = MisMatrices.get_menor_elementos(fechas);
		
		fecha_visible = fecha_menor.getTime();
		
		System.out.println("La fecha menor es: " + fecha_visible);
		
	}

}

class MisMatrices{
	
	public static  <T> String get_elementos(T[] a){
					
		return "El array tiene: " + a.length + " elementos";
	}
	
	//metodo en la interfazz comparable el método compareTo
	public static <T extends Comparable> T get_menor_elementos(T[] a) {
		
		if (a == null || a.length == 0) {
			
			return null;
		}
		
		T elementoMenor = a[0];
		
		for(int i = 1; i < a.length ; i++) {
			
			if (elementoMenor.compareTo(a[i])>0) {
				
				elementoMenor = a[i];
			}
		}
		
		return elementoMenor;
	}
}
