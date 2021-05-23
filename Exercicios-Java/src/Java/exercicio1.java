package Java;

import java.util.Scanner;

public class exercicio1 {
	
	public static void main(String[] args) {
		
		int n1,n2,n3;
		
		Scanner entre = new Scanner (System.in);
		
		System.out.println("Digite o primeiro valor  ");
		n1 = entre.nextInt();
		System.out.println("Digite o segundo valor  ");
		n2 = entre.nextInt();
		System.out.println("Digite o terceiro valor ");
		n3= entre.nextInt();
		
		if(n1>=n2 && n1>=n3)
		{
			System.out.println("\n O maior valor foi: "+n1);
		}
		else if(n2>=n1 && n2>=n3)
		{
			System.out.println("\n O maior valor foi: "+n2);
		}
		else
		{
			System.out.println("\n O maior valor foi: "+n3);
		}
		
	}

}
