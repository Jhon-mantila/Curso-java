package colecciones;

import java.util.*;

public class Prueba_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> ordenaPersonas = new TreeSet<String>();
		
		ordenaPersonas.add("Jessika");
		
		ordenaPersonas.add("Daniela");
		
		ordenaPersonas.add("Maria");
		
		System.out.println(ordenaPersonas);
		
		for(String p: ordenaPersonas) {
			
			System.out.println(p);
		}
		
		Articulo art_1 = new Articulo(1, "Primer Articulo");
		Articulo art_2 = new Articulo(2, "Segundo Articulo");
		Articulo art_3 = new Articulo(3, "ATercer Articulo");
		
		TreeSet<Articulo> ordenaArticulos = new TreeSet<Articulo>();
		
		ordenaArticulos.add(art_3);
		ordenaArticulos.add(art_1);
		ordenaArticulos.add(art_2);
		
		System.out.println(ordenaArticulos);
		System.out.println("------------------ORDENA POR NÚMERO---------------------------");
		for(Articulo a: ordenaArticulos) {
			System.out.println(a.get_descripcion());
		}
		
		Articulo comparadorArticulos = new Articulo();
		
		TreeSet<Articulo> ordenaArtAlfabeticos = new TreeSet<Articulo>(comparadorArticulos);
		
		ordenaArtAlfabeticos.add(art_1);
		ordenaArtAlfabeticos.add(art_3);
		ordenaArtAlfabeticos.add(art_2);
		
		System.out.println("------------------ORDENA ALFABETICAMENTE---------------------------");
		for(Articulo a: ordenaArtAlfabeticos) {
			System.out.println(a.get_descripcion());
		}
		
		
		
	}

}

class Articulo implements Comparable<Articulo>, Comparator<Articulo>{

	private int num_articulo;
	
	private String descripcion;
	
	public Articulo(){}
	
	public Articulo (int num, String desc) {
		
		num_articulo = num;
		
		descripcion = desc;
	}
	
	
	@Override
	public int compareTo(Articulo o) {
		// TODO Auto-generated method stub
				
		return num_articulo - o.num_articulo;
	}
	
	public String get_descripcion() {
		
		return descripcion;
	}


	@Override
	public int compare(Articulo a1, Articulo a2) {
		// TODO Auto-generated method stub
		String descripcion1 = a1.get_descripcion();
		
		String descripcion2 = a2.get_descripcion();
		
		return descripcion1.compareTo(descripcion2);	
		
	}
	
}

