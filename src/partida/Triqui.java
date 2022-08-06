package partida;

public class Triqui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Partida mipartida = new Partida();
		
		mipartida.ejecutar();
	}

}

class Partida{
	
	private int [] casillas_ocupadas;
	
	public int jugador;
	
	//private final int COMBINACIONES [][]= new int[8][3];
	
	private final int [][] COMBINACIONES = {
			{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}
			};
	
	public Partida() {
		
		casillas_ocupadas = new int[9];

        for (int i = 0 ; i < 9; i++){

            casillas_ocupadas[i]=0;
        }
        
       
        jugador = 1;
	}
	
	
	public void ejecutar() {
		 
		casillas_ocupadas[4] = 1;
		casillas_ocupadas[8] = 2;
		casillas_ocupadas[1] = 1;
		casillas_ocupadas[6] = 2;
		casillas_ocupadas[7] = 1;
		for(int i=0; i<COMBINACIONES.length; i++) {
			
			for(int pos: COMBINACIONES[i]) {
				
				System.out.println("Valor en posición: " + i + " " + casillas_ocupadas[pos]);
			}
		}
		
		
	}
	
}