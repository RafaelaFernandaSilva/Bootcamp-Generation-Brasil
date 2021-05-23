package Poo;

public class Cliente {// classe
	// declaração dos atributos da classe

	private String nome;
	private String genero;
	private String dataNascimento;
	private String registroCompra;
	private String rg;

	// metodo construtor
	// deve ter o mesmo nome da classe
	// deve ter o mesmo formato e
	public Cliente(String nome, String genero, String dataNascimento, String registroCompra, String rg) {
		// this faz referencia ao proprio objeto
		this.nome = nome;
		this.genero = genero;
		this.dataNascimento = dataNascimento;
		this.registroCompra = registroCompra;
		this.rg = rg;

	}

	// criação do metodos da classe Cliente
	public void printInfo() {
		System.out.println("**************************************");
		System.out.println("Cliente: " + nome + "\n" + registroCompra + " registro de compras \nNascida em "
				+ dataNascimento + "\nRG: " + rg + "\nÉ um(a)(e) exelente cliente!!!!");

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroCompra() {
		return registroCompra;
	}

	public void setRegistroCompra(String registroCompra) {
		this.registroCompra = registroCompra;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

}
