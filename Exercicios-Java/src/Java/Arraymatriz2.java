package Java;

import java.util.Scanner;

public class Arraymatriz2 {

	public static void main(String[] args) {

		double[][] matriz1 = new double[2][2];
		double[][] matriz2 = new double[2][2];
		double[][] matriz3 = new double[2][2];
		int constante, op;

		Scanner leia = new Scanner(System.in);

		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {

				System.out.println("Digite o valor da primeira matriz : ");
				matriz1[l][c] = leia.nextDouble();
				System.out.println("Digite o valor da segunda  matriz : ");
				matriz2[l][c] = leia.nextDouble();

			}

		}
		System.out.println("Digite o valor da constante: ");
		constante = leia.nextInt();
		System.out.println("\n1-> Somar as matrizes!! ");
		System.out.println("\n2-> Subtrair a primeira matriz da segunda!! ");
		System.out.println("\n3-> Adicionar uma constante as duas matrizes ");
		System.out.println("\n4-> Imprimir as matrizes ");
		System.out.println("\n5-> Sair");
		System.out.println("\n Qual opção você deseja :)");
		op = leia.nextInt();

		while (op < 1 || op > 5) {
			System.out.println("\n1-> Somar as matrizes!! ");
			System.out.println("\n2-> Subtrair a primeira matriz da segunda!! ");
			System.out.println("\n3-> Adicionar uma constante as duas matrizes ");
			System.out.println("\n4-> Imprimir as matrizes ");
			System.out.println("\n5-> Sair");
			System.out.println("\n Qual opção você deseja :)");
			op = leia.nextInt();

		}
		if (op != 5) {
			switch (op) {
			case 1:
				for (int l = 0; l < 2; l++) {
					for (int c = 0; c < 2; c++) {
						matriz3[l][c] = matriz1[l][c] + matriz2[l][c];
						System.out.println("\nA soma é: " + matriz3[l][c]);
					}
					break;
				}
			case 2:
				for (int l = 0; l < 2; l++) {
					for (int c = 0; c < 2; c++) {
						matriz3[l][c] = matriz2[l][c] - matriz1[l][c];
						System.out.println("\nA subtração é: " + matriz3[l][c]);
					}
					break;

				}
			case 3:
				for (int l = 0; l < 2; l++) {
					for (int c = 0; c < 2; c++) {

						matriz1[l][c] = matriz1[l][c] + constante;
						matriz2[l][c] = matriz2[l][c] + constante;
						System.out.println("\n Matriz1:" + matriz1[l][c] + "\t\tMatriz2" + matriz2[l][c]);

					}
				}

				break;
			case 4:
				for (int l = 0; l < 2; l++) {
					for (int c = 0; c < 2; c++) {

						System.out.println("\n Matriz1:" + matriz1[l][c] + "\t\tmatriz2: " + matriz2[l][c]);
					}
				}
				break;
			}
		}

		else {

			System.out.println("Finalizado!!!");

		}

	}

}