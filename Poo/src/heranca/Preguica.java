package heranca;

public class Preguica extends Animal {
	
	public Preguica() {
		super("Preguiça");

	}

	@Override

	public String som() {
		return " iiiiiiiiiiiii ";

	}

	@Override

	public String movimento() {

		return "sobe em arvores";
	}
	

}