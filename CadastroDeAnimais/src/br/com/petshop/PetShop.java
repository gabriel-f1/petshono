package br.com.petshop;

import java.util.ArrayList;
import java.util.Scanner;

public class PetShop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Animal> animais = new ArrayList<>();
		int opcao;

		do {
			System.out.println("\n======================\n CADASTRO DE ANIMAIS\n======================\n");
			System.out.println("[1] - CADASTRAR CACHORRO");
			System.out.println("[2] - CADASTRAR GATO");
			System.out.println("[3] - CADASTRAR PÁSSAROS");
			System.out.println("[4] - EXIBIR CADASTROS");
			System.out.println("[5] - SAIR\n");
			System.out.print("Escolha uma opção:");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				String nomeCachorro = Validacao.validarS(scanner, "NOME: ");
				String raca = Validacao.validarS(scanner, "RAÇA: ");
				int idadeCachorro = Validacao.validarI(scanner, "IDADE: ");

				animais.add(new Cachorro(nomeCachorro, idadeCachorro, raca));
				System.out.print("CACHORRO CADASTRADO.");
				break;
			case 2:
				String nomeGato = Validacao.validarS(scanner, "NOME: ");
				String corPelo = Validacao.validarS(scanner, "COR DO PELO: ");
				int idadeGato = Validacao.validarI(scanner, "IDADE: ");
				animais.add(new Gato(nomeGato, idadeGato, corPelo));
				System.out.print("GATO CADASTRADO.");
				break;
			case 3:
				String nomePassaro = Validacao.validarS(scanner, "NOME: ");
				String racap = Validacao.validarS(scanner, "RAÇA:");
				int idadePassaro = Validacao.validarI(scanner, "IDADE: ");
				animais.add(new Passaro(nomePassaro, idadePassaro, racap));
				System.out.print("PÁSSARO CADASTRADO.");
				break;		
				
			case 4:
				System.out.println("\n===  LISTA DE CADASTROS  ===");
				for (Animal animal : animais) {
					animal.exibirInfo();
					System.out.println();
				}
				break;
			case 5:
				System.out.println("ENCERRANDO...");
				break;
			default:
				System.out.println("OPÇÃO INVÁLIDA. TENTE NOVAMENTE.");
				break;
			}
		} while (opcao != 5);
		scanner.close();

	}

	
	
}
