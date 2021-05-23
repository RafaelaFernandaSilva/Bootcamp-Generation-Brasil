package heranca;

public abstract class Animal {
	private String nome;
	private int idade;
	private String tipo;

	public Animal(String tipo) {
		this.tipo = tipo;

	}

	abstract public String som();

	abstract public String movimento();

	public void printinfo() {

		 System.out.println("O animal é "+ getTipo()+"\nSeu nome é "+getNome()+"\nE sua idade é "+ getIdade()+" anos");
		 System.out.println(" :)".concat(som()));
		 System.out.println(" :)".concat(movimento()));
		 System.out.println("*************************************************************************************");
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
