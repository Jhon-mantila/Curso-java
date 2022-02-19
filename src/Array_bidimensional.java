
public class Array_bidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]  numeros = new int[4][5];
		
		// Primera posicion 1/4
		numeros[0][0] = 15;
		numeros[0][1] = 16;
		numeros[0][2] = 22;
		numeros[0][3] = 64;
		numeros[0][4] = 30;
		
		// Segunda posicion 2/4
		numeros[1][0] = 51;
		numeros[1][1] = 61;
		numeros[1][2] = 96;
		numeros[1][3] = 46;
		numeros[1][4] = 98;

		// tercera posicion 3/4
		numeros[2][0] = 19;
		numeros[2][1] = 26;
		numeros[2][2] = 35;
		numeros[2][3] = 78;
		numeros[2][4] = 96;

		// tercera posicion 4/4
		numeros[3][0] = 78;
		numeros[3][1] = 64;
		numeros[3][2] = 58;
		numeros[3][3] = 73;
		numeros[3][4] = 88;
		
		//System.out.println(numeros[2][0]);
		
		for(int i = 0 ; i<4 ; i++) {
			
			System.out.println();
			
			for(int j = 0 ; j<5 ; j++) {
				
				System.out.print(numeros[i][j] + " ");
			}
		}
		
		
	System.out.println();
	
	int[][] matrix = {
			
			{10,12,15,16,20},
			{11,16,25,66,80},
			{69,25,15,15,99},
			{45,75,54,73,31},
	}; 
	
	for(int[]filas:matrix) {
		
		System.out.println();
		
		for(int z: filas) {
			
			System.out.print(z + " ");
		}
		
	}
		
	}

}
