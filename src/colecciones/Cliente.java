package colecciones;

public class Cliente {
	
	public Cliente(String nombre, String cuenta, double saldo) {
		
		this.nombre = nombre;
		
		this.numero_cuenta = cuenta;
		
		this.saldo = saldo;
		
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumero_cuenta() {
		return numero_cuenta;
	}

	public void setNumero_cuenta(String numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	private String nombre;
	
	private String numero_cuenta;
	
	private double saldo;

}
