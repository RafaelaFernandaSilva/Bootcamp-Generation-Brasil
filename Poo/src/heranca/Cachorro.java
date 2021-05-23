package heranca;

public class Cachorro extends Animal {

	public Cachorro() {
		super("Cachorro ");

	}

	@Override
	public String som() {
		return " au au au ";

	}

	@Override
	public String movimento() {
		return " Corre ";
	}
}