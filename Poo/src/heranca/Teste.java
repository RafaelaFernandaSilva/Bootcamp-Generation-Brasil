package heranca;

public class Teste {

	public static void main(String[] args) {

		Cachorro dog = new Cachorro();
		Preguica pregui = new Preguica();
		Cavalo cav = new Cavalo();

		dog.setNome("Maju");
		dog.setIdade(1);
		
		pregui.setNome("Tom");
		pregui.setIdade(10);
		
		cav.setNome("Garanão");
		cav.setIdade(1);
		
		dog.printinfo();
		pregui.printinfo();
		cav.printinfo();
		

		
	}

}
