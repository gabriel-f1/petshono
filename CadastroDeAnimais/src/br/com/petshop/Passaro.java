package br.com.petshop;

public class Passaro extends Animal {
	private String raca;

	public Passaro(String nome, int idade, String raca) {
		super(nome, idade);
		this.raca = raca;

	}

	public void cantar() {
		System.out.println(getNome() + " está cantarolando!");
	}

	public void exibirInfo() {
		System.out.println("\nPássaro");
		super.exibirInfo();
		System.out.println("Raça: " + raca);
		cantar();

	}

}
