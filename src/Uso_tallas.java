import java.util.*;

public class Uso_tallas {

	//enum Talla {MINI, MEDIANO, GRANDE, MUY_GRANDE}
	
	enum Talla{	
		
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
		
		private Talla(String abreviatura) {
			
			this.abreviatura = abreviatura;
		}
		
		public String get_abreviatura() {
			
			return abreviatura;
		}
		
		private String abreviatura;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String talla;
		
		talla = "Pequeña";
		
		talla = "Grande";
		
		talla = "Mediana";
		
		talla = "Azul";// No tiene sentido*/
		
		/*Talla s = Talla.MINI;
		
		Talla m = Talla.MEDIANO;
		
		Talla l = Talla.GRANDE;
		
		Talla xl = Talla.MUY_GRANDE;*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE Y MUY GRANDE");
		
		String entrada_datos = entrada.next().toUpperCase();
		
		Talla la_talla = Enum.valueOf(Talla.class, entrada_datos);
		
		System.out.println("Talla = " + la_talla);
		
		System.out.println("Abreviatura = " + la_talla.get_abreviatura());
		
		
	}

}
