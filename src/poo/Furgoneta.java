package poo;

public class Furgoneta extends Coche {
	
	private int capacidad_carga;
	
	private int plazas_extras;
	
	public Furgoneta(int plazas_extras, int capacidad_carga) {
		
		//llamar al constructor de la clase padre es decir la clase: coche
		super();
		
		this.capacidad_carga = capacidad_carga;
		
		this.plazas_extras = plazas_extras;
	}
	
	public String get_datosFurgoneta() {
		
		return "La capacidad de carga es: "  + capacidad_carga + " y las plazas extras son: " + plazas_extras ;
	}

}
