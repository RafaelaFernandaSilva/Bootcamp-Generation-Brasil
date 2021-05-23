package Java;

import java.util.Scanner;

public class Arraymatriz1 {

	public static void main(String[] args) {

		int[][] matriz = new int[3][3];
		int cont = 0;

		Scanner leia = new Scanner(System.in);

		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.printf("Insira o elemento M [%d] [%d]: ", l + 1, c + 1);
				matriz[l][c] = leia.nextInt();

			}
		}

		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {

				if (matriz[l][c] > 10) {

					cont++;
				}

			}

		}
		System.out.printf("O número da contagem  maior de 10 é: %d ", cont);

	}

}
