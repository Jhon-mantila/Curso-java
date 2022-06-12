package colecciones;

import java.util.Objects;

public class Libros {
	
	public Libros(String titulo, String autor, int isbn) {
		
		this.titulo = titulo;
		
		this.autor = autor;
		
		this.isbn = isbn;
	}
	
	public String getDatos() {
		
		return "El título es: " + titulo + " El autor es: " + autor + " y el ISBN: " + isbn;
	}
	
	/*public boolean equals(Object obj) {
		
		if(obj instanceof Libros) {
			
			Libros otro = (Libros)obj;
			
			if(this.isbn == otro.isbn) {
				
				return true;
			}else {
				
				return false;
			}
			
		}else {
			
			return false;
		      }
		
		}*/
	

	
	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libros other = (Libros) obj;
		return isbn == other.isbn;
	}
	
	
	private String titulo;
	private String autor;
	private int isbn;

}
