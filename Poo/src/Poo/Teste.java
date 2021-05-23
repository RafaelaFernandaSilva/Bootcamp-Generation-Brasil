package Poo;

public class Teste {

	public static void main(String[] args) {
		
	  Cliente cliente1 = new Cliente("Rafaela Fernanda","Feminino","28/09/93","4","1028394095");
	  Cliente cliente2 = new Cliente("Shofia Silva","Neutro","19/06/99","7","1119734754");
	  Cliente cliente3 = new Cliente("Jose Silveira","masculino","20/12/97","2","1239874301");
	
      
      cliente1.setNome("Maria silva");
      cliente1.printInfo();
      cliente2.printInfo();
      cliente3.printInfo();
}
}