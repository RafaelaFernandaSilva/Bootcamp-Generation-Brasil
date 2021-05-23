package Java;

public class Arrayvetor1 {

	public static void main(String[] args) {

		int soma = 0;

		int[] A = { 1, 0, 5, -2, -5, 7 };

		A[4] = 100;

		soma = A[0] + A[1] + A[5];

		for (int i = 0; i <= 5; i++) {

			System.out.println("O valor dos vetores " + i + " é: " + A[i]);

		}
		System.out.println("O valor da soma é :" + soma);
	}

}
