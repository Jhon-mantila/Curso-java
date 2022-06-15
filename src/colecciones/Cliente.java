package colecciones;

import java.util.Objects;

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


@Override
	public int hashCode() {
		return Objects.hash(numero_cuenta);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(numero_cuenta, other.numero_cuenta);
	}






	private String nombre;
	
	private String numero_cuenta;
	
	private double saldo;

}
