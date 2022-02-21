package poo;

public class Coche {

	private int ruedas;
	
	private int largo;
	
	private int ancho;
	
	private int motor;
	
	private int peso_plataforma;
	
	private String color;
	
	private int peso_total;
	
	private boolean asientos_cuero, climatizador;
	
	public Coche() {
		
		ruedas = 4;
		
		largo = 2000;
		
		ancho = 300;
		
		motor = 1600;
		
		peso_plataforma = 500;
		
	}
	
	public String get_datosGenerales () {
		
		return "La plataforma del vehículo tiene: " + ruedas + " ruedas. Mide: " + largo/1000 + " metros con un ancho de : " + ancho + " cm y un peso de plataforma de: " + peso_plataforma + " kg.";
	}
	
	//metodos get y set de ruedas
	
	public String get_ruedas() {
		
		return "Tiene: " + ruedas + " ruedas";
	}
	
	public void set_ruedas(int ruedas) {
		
		this.ruedas = ruedas;
	}
	
	//metodos get y set de largo
	
	public int get_largo() {
		
		return largo;
		
	}
	
	public void set_largo(int largo) {
		
		this.largo = largo;
	}
	
	//metodos get y set de color
	
	public String get_color() {
		
		return "El Color del coche es: " + color;
	}
	
	public void set_color(String color) {
		
		this.color = color;
	}

	//metodos set y get de asientos cuero
	
	public void set_asientos(String asientos_cuero) {
		
		if (asientos_cuero.equalsIgnoreCase("Si")) {
			
			this.asientos_cuero = true;
			
		}else {
			
			this.asientos_cuero = false;
						
		}
		
	}
	
	public String get_asientos_cuero() {
		
		if(asientos_cuero) {
			
			return "El Coche tiene Asientos de Cuero";
			
		}else {
			
			return "El Coche Tiene Asientos de Serie";
		}
		
	}
	
	//metodos set y get de climatizador
	
	public void set_config_climatizador(String climatizador) {
		
		if(climatizador.equalsIgnoreCase("si")) {
			
			this.climatizador = true;
			
		}else {
			
			this.climatizador = false;
			
		}
	}
	
	public String get_climatizador() {
		
		if(climatizador) {
			
			return "Posee aire acondicionado";
			
		}else{
			
			return "No tiene aire acondicionado";
		}
	}
	
	//métodos set y get al mismo tiempo
	
	public String dime_peso_coche() {
		
		int peso_carroceria = 500;
		
		peso_total = peso_plataforma+peso_carroceria;
		
		if (asientos_cuero) {
			
			peso_total = peso_total + 50;
		}
		
		if (climatizador) {
			
			peso_total+=20;
			
		}
		
		return "El peso total del vehículo es : " + peso_total;
	}
	
	
	public int get_precio_coche() {
		
		int precio_final = 10000;
		
		if (asientos_cuero) {
			
			precio_final+=2000;
		}
		if (climatizador) {
			
			precio_final+=1500;
		}
		
		return precio_final;
	}
	

}
