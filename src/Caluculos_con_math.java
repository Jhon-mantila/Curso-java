
public class Caluculos_con_math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num = 9;
		
		double raiz = Math.sqrt(num);
		
		System.out.println("La raiz de : " + num + " es: " + raiz);
		
		float num1 = 5.85f;
		
		int resultado =  Math.round(num1);
		
		System.out.println("# redondeado: " + resultado);
		
		double num2 = 5.85;
		
		//hago una refundición
		int resultado2 = (int)Math.round(num2);
		
		System.out.println("con refundición: "+resultado2);
		
		double base = 9;
		
		double exponente = 2;
		
		int resultado4 = (int) Math.pow(base, exponente);
		
		System.out.println("#:" + base + " elevado: " + exponente + " resultado: " + resultado4);
	}

}
