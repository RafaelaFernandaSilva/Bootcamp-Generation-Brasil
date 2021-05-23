package Java;

import java.util.Scanner;

public class Dowhile2 {
	public static void main(String[] args) {
		int num, soma = 0, cont = 0;
		float media = 0;
		Scanner entre = new Scanner(System.in);
		do {

			System.out.println("Digite um número inteiro: ");
			num = entre.nextInt();

			if (num % 3 == 0) {
				cont++;
				soma = soma + num;
			}

		}

		while (num != 0);
		{
			media = soma / cont;
			System.out.println("A Media dos numeros é : " + media);
		}
	}
}
