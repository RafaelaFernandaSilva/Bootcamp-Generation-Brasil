package heranca;

public class Cavalo extends Animal {

	public Cavalo() {
		super("Cavalo");

	}

	@Override

	public String som() {
		return " hi hi hi ";

	}

	@Override

	public String movimento() {

		return "corre";
	}

}
