package colecciones;

import java.util.*;

public class Prueba_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		LinkedList<String> listaLinked = new LinkedList<String>(); 
		
		listaLinked.add("Pepe");
		listaLinked.add("Maria");
		listaLinked.add("Jessika");
		listaLinked.add("Daniela");
		
		System.out.println(listaLinked.size());
		
		listaLinked.add("Jhon");
		
		//listaLinked.add(2, "Yosira");
		ListIterator<String> it_personas = listaLinked.listIterator();
		
		it_personas.next();
		it_personas.add("Yosira");
		for(String personas: listaLinked) {
			
			System.out.println(personas);
		}
		
		
	}

}
