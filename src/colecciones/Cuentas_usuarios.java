package colecciones;

import java.util.*;

public class Cuentas_usuarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente1 = new Cliente("Jhon", "00001", 200000);
		Cliente cliente2 = new Cliente("Daniela", "00002", 6500250);
		Cliente cliente3 = new Cliente("Jessika", "00003", 100000);
		Cliente cliente4 = new Cliente("Maria Ruiz", "00004", 200000);
		
		Set<Cliente> coleccionCuentas = new HashSet<Cliente>();
		
		coleccionCuentas.add(cliente1);
		coleccionCuentas.add(cliente2);
		coleccionCuentas.add(cliente3);
		coleccionCuentas.add(cliente4);
		
		for (Cliente cliente : coleccionCuentas) {
			System.out.println("Nombre: " + cliente.getNombre() + " Cuenta: " + cliente.getNumero_cuenta() +  " Saldo: " + cliente.getSaldo());
		}
	}

}
