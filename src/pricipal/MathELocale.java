package principal;

import java.util.Scanner;

public class MathELocale {

	public static void main(String[] args) {
		
		//atalho pra importar : ctrl+shift+o
		final locale ponto = new Locale("en" , "us");
		Scanner leia = new Scanner(System.in);
	
		
		double altura = 0;
	System.out.println("Entre com sua altura");
	altura= leia.userlocale(ponto).nextDouble();
	
	System.out.println("A altura digitada foi: " + altura);

	leia.close();
	}

}
