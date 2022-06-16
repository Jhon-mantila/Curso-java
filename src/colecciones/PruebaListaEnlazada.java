package colecciones;

import java.util.*;

public class PruebaListaEnlazada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> paises = new LinkedList<String>();
		
		paises.add("Colombia");
		paises.add("España");
		paises.add("Mexico");
		paises.add("Peru");
		
		LinkedList<String> capitales = new LinkedList<String>();
		
		capitales.add("Bogota");
		capitales.add("Madrid");
		capitales.add("DF");
		capitales.add("Lima");
		
		
		System.out.println(paises);
		System.out.println(capitales);
		
		ListIterator<String> iter_paises = paises.listIterator();
		ListIterator<String> iter_capitales = capitales.listIterator();
		
		while(iter_capitales.hasNext()) {
			
			if(iter_paises.hasNext()) {
				
				iter_paises.next();
			}
			
			iter_paises.add(iter_capitales.next());
		}
		
		//ya cargue con la otra lista
		System.out.println(paises);
		
		//iniciar nuevamente operador desde el principio
		
		iter_capitales = capitales.listIterator();
		
		while(iter_capitales.hasNext()) {
			
			iter_capitales.next();
			
			if(iter_capitales.hasNext()) {
				
				iter_capitales.next();
				
				iter_capitales.remove();
			}
			
		}
		
		//Imprimo después de elimininar los pares
		System.out.println(capitales);
		
		//Eliminar las capitales que quedaron
		
		paises.removeAll(capitales);
		
		//imprimo paises con las capitales eliminadas Bogota y df
		System.out.println(paises);
		
		
		
		

	}

}
