package colecciones;

import java.util.*;

public class Prueba_TreeSet2 {

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
		
		Articulo2 art_1 = new Articulo2(1, "Primer Articulo");
		Articulo2 art_2 = new Articulo2(2, "Segundo Articulo");
		Articulo2 art_3 = new Articulo2(3, "Tercer Articulo");
		
		TreeSet<Articulo2> ordenaArticulos = new TreeSet<Articulo2>();
		
		ordenaArticulos.add(art_3);
		ordenaArticulos.add(art_1);
		ordenaArticulos.add(art_2);
		
		System.out.println(ordenaArticulos);
		
		for(Articulo2 a: ordenaArticulos) {
			System.out.println(a.get_descripcion());
		}
		
		ComparadorArticulos compara_articulos = new ComparadorArticulos();
		
		TreeSet<Articulo2> ordenaAlfabeticamente = new TreeSet<Articulo2>(compara_articulos);
		
		ordenaAlfabeticamente.add(art_1);
		ordenaAlfabeticamente.add(art_3);
		ordenaAlfabeticamente.add(art_2);
		
		System.out.println("-------Ordena Alfabeticamente----------");
		
		for(Articulo2 a: ordenaAlfabeticamente) {
			
			System.out.println(a.get_descripcion());
		}
		
		
	}

}

class Articulo2 implements Comparable<Articulo2>{

	private int num_articulo;
	
	private String descripcion;
	
	
	public Articulo2(int num, String desc) {
		
		num_articulo = num;
		
		descripcion = desc;
	}
	
	
	@Override
	public int compareTo(Articulo2 o) {
		// TODO Auto-generated method stub
				
		return num_articulo - o.num_articulo;
	}
	
	public String get_descripcion() {
		
		return descripcion;
	}
	
}


class ComparadorArticulos implements Comparator<Articulo2>{

	@Override
	public int compare(Articulo2 o1, Articulo2 o2) {
		// TODO Auto-generated method stub
		String desc1 = o1.get_descripcion();
		
		String desc2 = o2.get_descripcion();
		
		return desc1.compareTo(desc2);
	}
	
}

