
public class SincronizandoHilos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HilosVarios hilo1 = new HilosVarios();
		
		HilosVarios hilo2 = new HilosVarios();
		
		hilo1.start();
		
		try {
			hilo1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		hilo2.start();
		
		try {
			//Hasta que no termine la tarea de un hilo no empieza la otra el main tambien es un hilo
			hilo2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Terminada La Tarea......");

	}

}

class HilosVarios extends Thread{
	
	public void run() {
		
		for(int i = 0; i<15; i++) {
			System.out.println("Ejecucanto hilo: " + getName());
			
			try {
				
				Thread.sleep(400);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			}
		}
		
	}
}
