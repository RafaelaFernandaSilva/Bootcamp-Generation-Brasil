package Java;

import java.util.Scanner;

public class Dowhile1 {

	public static void main(String[] args) {
		int num, soma = 0, cont = 0;
		Scanner entre = new Scanner(System.in);
		do {

			System.out.println("Digite um número inteiro: ");
			num = entre.nextInt();

			if (num != 0) {
                 cont ++;
				soma = soma + num;
			}

		}

		while (num > 0);
		{
			System.out.println("A soma dos números inteiros é: " + soma);
		}
	}
}
