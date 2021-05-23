package Java;
import java.util.Scanner;
public class exercicio2 {

	public static void main(String[] args) {
		
		int n1,n2,n3;
		
		Scanner entre = new Scanner (System.in);
		
		System.out.println("Digite o primeiro valor: ");
		n1= entre.nextInt();
		System.out.println("Digite o segundo valor:  ");
		n2 = entre.nextInt();
		System.out.println("Digite o terceiro valor: ");
		n3 = entre.nextInt();
		
		if(n1<=n2 && n2<=n3)
		{
			System.out.println("\nOrdem crescente: "+n1+", "+n2+" e "+n3);
		}
		else if(n1<=n3 && n3<=n2)
		{
			System.out.println("\nOrdem crescente: "+n1+", "+n3+" e "+n2);
		}
		else if(n2<=n1 && n1<=n3)
		{
			System.out.println("\nOrdem crescente: "+n2+", "+n1+" e "+n3);
		}
		else if(n2<=n3 && n3<=n1)
		{
			System.out.println("\nOrdem crescente: "+n2+", "+n3+" e "+n1);
		}
		else if(n3<=n1 && n1<=n2)
		{
			System.out.println("\nOrdem crescente: "+n3+", "+n1+" e "+n2);
		}
		else
		{
			 System.out.println("\nOrdem crescente: "+n3+", "+n2+" e "+n1);
		}
		
	}

}







