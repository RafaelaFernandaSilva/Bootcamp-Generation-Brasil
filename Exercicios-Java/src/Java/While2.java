package Java;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {

		int idade, genero, ps, pc, pn, pa, pessoas = 1;
		int contc = 0, contmn = 0, contha = 0, contoc = 0, cont40 = 0, cont18 = 0;

		Scanner leia = new Scanner(System.in);

		while (pessoas <= 150) {

			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			System.out.println("\nOpção 1-feminino \nOpção 2-masculina \nOpção 3-outros\nDigite seu Genero:");
			genero = leia.nextInt();
			System.out.println("\nOpção 1-calma \nOpção 2-nervosa \nOpção 3-agressiva \nDigite sua condição atual: ");
			ps = leia.nextInt();

			if (ps == 1) {

				contc++;
			}

			if (genero == 1 && ps == 2) {

				contmn++;
			}

			if (genero == 2 && ps == 3) {

				contha++;

			}

			if (genero == 3 && ps == 1) {

				contoc++;
			}

			if (pessoas > 40 && ps == 2) {

				cont40++;
			}

			if (pessoas < 18 && ps == 1) {

				cont18++;

			}

			pessoas++;
		}

		System.out.println(" \nNúmero de pessoas calmas: " + contc);
		System.out.println(" \nNúmero de mulheres nervosas: " + contmn);
		System.out.println("\nNúmero de homens agressivos:  " + contha);
		System.out.println(" \nNúmero de outros calmos:  " + contoc);
		System.out.println(" \nNúmero de pessoas nervosas com mais de 40 anos:  " + cont40);
		System.out.println(" \nNúmero de pessoas calmas com menos de 18 anos:  " + cont18);

	}

}
