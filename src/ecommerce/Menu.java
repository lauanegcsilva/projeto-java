package ecommerce;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                Lauane's Store                       ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Cliente                    ");
			System.out.println("            2 - Cadastrar Produto                    ");
			System.out.println("            3 - Listar Produtos                      ");
			System.out.println("            4 - Excluir Produto                      ");
			System.out.println("            5 - Atualizar Produto                    ");
			System.out.println("            6 - Cadastrar Pedido                     ");
			System.out.println("            7 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 7) {
				System.out.println("\nLauane's Store agradece o seu contato!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Cadastrar Cliente\n\n");
				  cadastrarNovoCliente();
				break;
			case 2:
				System.out.println("Cadastrar Produto\n\n");

				break;
			case 3:
				System.out.println("Listar Produtos\n\n");

				break;
			case 4:
				System.out.println("Excluir Produto\n\n");

				break;
			case 5:
				System.out.println("Atualizar Produto\n\n");

				break;
			case 6:
				System.out.println("Cadastrar Pedido\n\n");

				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				break;
			}
		}
	}

	private static void cadastrarNovoCliente() {
		// TODO Auto-generated method stub
		
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Lauane Gonçalves");
		System.out.println("*********************************************************");
	}

}
