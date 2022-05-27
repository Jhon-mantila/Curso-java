package programaciongenerica;

public class UsoArrayLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayLista archivos = new ArrayLista(5);
		
		archivos.add("Jhon");
		archivos.add("Jessika");
		archivos.add("Daniela");
		archivos.add("Maria");
		//archivos.add(1111);
		
		String nombre = (String)archivos.get(0);
		
		System.out.println(nombre);
		//Nos muestra error cambia el tipo de dato
		//System.out.println((String)archivos.get(4));
		
		ArrayLista enteros = new ArrayLista(2);
		
		enteros.add(123);
		enteros.add(3524);
		
		int numero = (int) enteros.get(0);
		
		System.out.println(numero);
		
	}

}
