package Java;

import java.util.Scanner;
public class exercicio4 {
	
	public static void main(String[] args)
	{
		int valor;
		double res;
		
		Scanner entre = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		valor = entre.nextInt();
		
		if(valor%2==0)
		{
			res = Math.sqrt(valor);
			System.out.println("Número é PAR e a sua raiz é: "+res);
		}
		else
		{
			res = Math.pow(valor,2);
			System.out.println("Número é ÍMPAR e a sua potencia é: "+res);
		}
	}
}




