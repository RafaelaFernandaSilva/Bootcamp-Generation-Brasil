package Java;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {

		int par = 0, impar = 0, num;

		Scanner leia = new Scanner(System.in);

		for (int x = 1; x <= 10; x++) {

			System.out.println("Digite um valor inteiro: ");
			num = leia.nextInt();

			if (num % 2 == 0) {

				par = par + 1;
			}

			else {
				impar = impar + 1;

			}

		}

		System.out.println("/nA quantidade de n�meros pares s�o " + par + " \nA quantidade de n�meros impar s�o : " + impar);
	}

}
