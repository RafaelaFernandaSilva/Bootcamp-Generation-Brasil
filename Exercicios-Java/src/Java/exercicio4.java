package Java;

import java.util.Scanner;
public class exercicio4 {
	
	public static void main(String[] args)
	{
		int valor;
		double res;
		
		Scanner entre = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		valor = entre.nextInt();
		
		if(valor%2==0)
		{
			res = Math.sqrt(valor);
			System.out.println("N�mero � PAR e a sua raiz �: "+res);
		}
		else
		{
			res = Math.pow(valor,2);
			System.out.println("N�mero � �MPAR e a sua potencia �: "+res);
		}
	}
}




