package Java;

import java.util.Scanner;

public class Arrayvetor2 {

	public static void main(String[] args) {
		Scanner entre = new Scanner(System.in);

		int[] v = new int[6];
		int somapar = 0, contpar = 0, contaimpar = 0;

		for (int i = 0; i < 6; i++) {

			System.out.println("Digite um n�mero: " + (i + 1) + " ");
			v[i] = entre.nextInt();

			if (v[i] % 2 == 0) {

				somapar = somapar + v[i];

			} else {
				contaimpar++;
			}

		}

		for (int i = 0; i < 6; i++) {

			if (v[i] % 2 == 0) {

				System.out.println(v[i] + "� um n�mero par!! ");

			} else {

				System.out.println(v[i] + "� um n�mero impar!! ");
			}

		}
		System.out.println(" A soma de n�meros pares s�o: " + somapar);
		System.out.println(" A quantidade de n�meros impares s�o: " + contaimpar);
	}

}
