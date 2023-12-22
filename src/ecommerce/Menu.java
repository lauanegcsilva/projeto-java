package ecommerce;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int opcao, quantidadeProduto;
		float precoProduto;
		String nomeProduto;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                Lauane's Store                       ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Produto                    ");
			System.out.println("            2 - Listar Produtos                      ");
			System.out.println("            3 - Excluir Produto                      ");
			System.out.println("            4 - Atualizar Produto                    ");
			System.out.println("            5 - Cadastrar Pedido                     ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();
			leia.nextLine();

			if (opcao == 6) {
				System.out.println("\nLauane's Store agradece o seu contato!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Cadastrar Produto\n\n");

				leia.nextLine();
				System.out.println("Digite o nome do produto: ");
				nomeProduto = leia.nextLine();
				System.out.println("Digite a quantidade do produto: ");
				quantidadeProduto = leia.nextInt();
				System.out.println("Digite o preço do produto: ");
				precoProduto = leia.nextFloat();

				Produto produto = new Produto(nomeProduto, quantidadeProduto, precoProduto);
				produto.cadastrarProduto(produto);

				keyPress();
				break;
			case 2:
				System.out.println("Listar Produtos\n\n");

				Produto produtoListagem = new Produto("", 0, 0);
				produtoListagem.listarProdutos();

				keyPress();
				break;
			case 3:
				System.out.println("Excluir Produto\n\n");

				Produto produtoExclusao = new Produto("", 0, 0);
				System.out.println("Digite o nome do produto a ser excluído: ");
				nomeProduto = leia.nextLine();
				produtoExclusao.excluirProduto(nomeProduto);

				keyPress();
				break;
			case 4:
				System.out.println("Atualizar Produto\n\n");

				Produto produtoAtualizacao = new Produto("", 0, 0);
				System.out.println("Digite o nome do produto a ser atualizado: ");
				nomeProduto = leia.nextLine();

				System.out.println("Digite a nova quantidade do produto: ");
				quantidadeProduto = leia.nextInt();

				System.out.println("Digite o novo preço do produto: ");
				precoProduto = leia.nextFloat();

				produtoAtualizacao.atualizarProduto(nomeProduto, quantidadeProduto, precoProduto);

				keyPress();
				break;
			case 5:
				System.out.println("Cadastrar Pedido\n\n");

				System.out.println("Digite a quantidade do produto: ");
				quantidadeProduto = leia.nextInt();

				System.out.println("Digite o preço do produto: ");
				precoProduto = leia.nextFloat();
				leia.nextLine();

				System.out.println("Digite o nome do produto: ");
				nomeProduto = leia.nextLine();

				Pedido novoPedido = new Pedido(quantidadeProduto, precoProduto, nomeProduto);

				keyPress();
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Lauane Gonçalves");
		System.out.println("*********************************************************");
	}

	private static void keyPress() {

		try {
			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}

	}

}
