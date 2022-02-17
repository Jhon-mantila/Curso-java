
public class Uso_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] mi_matrix = new int[5];
		
		mi_matrix[0] = 1; 
		mi_matrix[1] = 10; 
		mi_matrix[2] = 22; 
		mi_matrix[3] = 33;
		mi_matrix[4] = 44; 
		
		int [] mi_matrix2 = {33,54,12,45,12,43,23,88,43,90,78,45,12,43};
		
		//System.out.println(mi_matrix[0]);
		
		//Recorro la matrix
		for (int i = 0; i<5; i++) {
			
			System.out.println("Posición matrix:" + i + " Valor de la matrix: " + mi_matrix[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i<mi_matrix2.length; i++) {
			
			System.out.println("Posición matrix:" + i + " Valor de la matrix: " + mi_matrix2[i]);
		}
	}

}
