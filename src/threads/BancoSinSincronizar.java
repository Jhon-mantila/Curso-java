package threads;

import java.util.concurrent.locks.*;

public class BancoSinSincronizar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Banco b = new Banco();
		
		for(int i=0; i<100; i++) {
			
			Ejecucion_transferencia ejecucion = new Ejecucion_transferencia( b, i, 2000);
			
			Thread t = new Thread(ejecucion);
			
			t.start();
			
		}
		

	}

}

class Banco {
	
	public Banco() {
		
		cuentas = new double[100];
		
		for(int i=0; i<cuentas.length; i++) {
			
			cuentas[i] = 2000;
			
		}
		
		saldoSuficiente = cierrebanco.newCondition();
	}
	
	public void transferencia(int cuentaOrigen, int cuentaDestino, double cantidad) throws InterruptedException {
		
		//bloqueo el codigo para que entren en fila los hilos
		cierrebanco.lock();
		
		try {
			//evalúa que el saldo no sea inferior a la cantidad				
		/*if(cuentas[cuentaOrigen] < cantidad) { 
			
			System.out.println("-----CANTIADAD INSUFICIENTE:----"+ cuentaOrigen + "--SALDO:--" + cuentas[cuentaOrigen] + "--CANTIDAD---" + cantidad);
			
			return;
			
		}else {
			System.out.println("***CANTIDAD OK:***" + cuentaOrigen);
		}*/
			
		while (cuentas[cuentaOrigen] < cantidad) {
			System.out.println("-----CANTIADAD INSUFICIENTE:----"+ cuentaOrigen + "--SALDO:--" + cuentas[cuentaOrigen] + "--CANTIDAD---" + cantidad);
			//Pone el hilo a la espera, con un bloqueo
				saldoSuficiente.await();
		}
		
		//imprimir en pantalla el hilo q va a realizar la transferencia
		System.out.println(Thread.currentThread());
		
		
		cuentas[cuentaOrigen] -= cantidad; //Dinero que sale de la cuenta origen

		System.out.printf("%10.2f de %d para %d" , cantidad , cuentaOrigen , cuentaDestino);
		
		cuentas[cuentaDestino] += cantidad; //Incrementa la cuenta destino
		
		System.out.printf(" Saldo total: %10.2f %n ", getSaldoTotal());
		
		saldoSuficiente.signalAll();
		
		//Ejecute si o no ocurra una excepción
		}finally {
			//desploquea el codigo para que entre el hilo
			cierrebanco.unlock();
		}
		
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
	
	//bloqueo el codigo para que entren en fila los hilos
	private Lock cierrebanco = new ReentrantLock();
	
	private Condition saldoSuficiente;
}

class Ejecucion_transferencia implements Runnable{
		
	public Ejecucion_transferencia(Banco b, int cuenta_delaque_parte, double max) {
		
		banco = b ;
		
		cuenta_origen = cuenta_delaque_parte;
		
		cantidad_max = max;
		
	}
	
	public void run() {
		try {
			
		while (true) {
			
			//generamos cuentas aleatorias de 0 a 100
			int paraLaCuenta = (int)(100*Math.random());
			
			//generamos las cantidades a tranferir entre cuentas
			double cantidad = cantidad_max * Math.random();
			
			banco.transferencia(cuenta_origen, paraLaCuenta, cantidad);
						
			Thread.sleep((int)(Math.random()*10));
						
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private Banco banco;
	
	private int cuenta_origen;
	
	private double cantidad_max;
}
