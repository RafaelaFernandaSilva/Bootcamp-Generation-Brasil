package Java;

import java.util.Scanner;

public class Arrayvetor2 {

	public static void main(String[] args) {
		Scanner entre = new Scanner(System.in);

		int[] v = new int[6];
		int somapar = 0, contpar = 0, contaimpar = 0;

		for (int i = 0; i < 6; i++) {

			System.out.println("Digite um número: " + (i + 1) + " ");
			v[i] = entre.nextInt();

			if (v[i] % 2 == 0) {

				somapar = somapar + v[i];

			} else {
				contaimpar++;
			}

		}

		for (int i = 0; i < 6; i++) {

			if (v[i] % 2 == 0) {

				System.out.println(v[i] + "é um número par!! ");

			} else {

				System.out.println(v[i] + "é um número impar!! ");
			}

		}
		System.out.println(" A soma de números pares são: " + somapar);
		System.out.println(" A quantidade de números impares são: " + contaimpar);
	}

}
