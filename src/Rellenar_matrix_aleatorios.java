
public class Rellenar_matrix_aleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] matrix_aleatorio = new int[150];
		
		for(int i=0 ; i<matrix_aleatorio.length; i++) {
			
			matrix_aleatorio[i] = (int)Math.round(Math.random()*100);
		}
		
		for(int numeros:matrix_aleatorio) {
			
			System.out.print(numeros + " ");			
			
		}
		
	}

}
