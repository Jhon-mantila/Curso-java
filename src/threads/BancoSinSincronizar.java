package threads;

public class BancoSinSincronizar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Banco {
	
	public Banco() {
		
		cuentas = new double[100];
		
		for(int i=0; i<=cuentas.length; i++) {
			
			cuentas[i] = 2000;
			
		}
	}
	
	public void transferencia(int cuentaOrigen, int cuentaDestino, double cantidad) {
		
		if(cuentas[cuentaOrigen] < cantidad) { //evalúa que el saldo no sea inferior a la cantidad
			
			return;
		}
		
		//imprimir en pantalla el hilo q va a realizar la transferencia
		System.out.println(Thread.currentThread());
		
		
		cuentas[cuentaOrigen] -= cantidad; //Dinero que sale de la cuenta origen

		System.out.printf("%10.2f de %d para %d" , cantidad , cuentaOrigen , cuentaDestino);
		
		cuentas[cuentaDestino] += cantidad; //Incrementa la cuenta destino
		
		System.out.printf("Saldo total: %10.2f%n ", getSaldoTotal());
		
	}
	
	public double getSaldoTotal() {
		
		double suma_cuentas = 0;
		
		//Suma todo el array de cuentas: ejemplo los 100 valores los suma
		for(double a: cuentas) {
			
			suma_cuentas += a;
			
		}
		
		return suma_cuentas;
		
	}
	
	private final double[] cuentas;
}
