package ecommerce;

import java.util.ArrayList;
import java.util.Iterator;

public class Produto extends Modelo implements OperacoesProduto {

	private static ArrayList<Produto> listaProdutos = new ArrayList<>();
	private static int proximoId = 1;

	public Produto(String nomeProduto, int quantidadeProduto, float precoProduto) {
		super(proximoId++, nomeProduto, quantidadeProduto, precoProduto);
	}

	@Override
	public void cadastrarProduto(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("Produto cadastrado com sucesso!");
	}

	@Override
	public void listarProdutos() {
		for (Produto produto : listaProdutos) {
			produto.visualizarProduto();
		}
	}

	@Override
	public void excluirProduto(String nomeProduto) {
		Iterator<Produto> iterator = listaProdutos.iterator();
		while (iterator.hasNext()) {
			Produto produto = iterator.next();
			if (produto.getNomeProduto().equalsIgnoreCase(nomeProduto)) {
				iterator.remove();
				System.out.println("Produto excluído com sucesso!");
				return;
			}
		}
		System.out.println("Produto não encontrado.");
	}

	@Override
	public void atualizarProduto(String nomeProduto, int novaQuantidade, float novoPreco) {
		for (Produto produto : listaProdutos) {
			if (produto.getNomeProduto().equalsIgnoreCase(nomeProduto)) {
				produto.setQuantidadeProduto(novaQuantidade);
				produto.setPrecoProduto(novoPreco);
				System.out.println("Produto atualizado com sucesso!");
				return;
			}
		}
		System.out.println("Produto não encontrado.");
	}

	private void visualizarProduto() {
		System.out.println("\n\n*********************************************************************");
		System.out.println("Dados do Produto:");
		System.out.println("*********************************************************************");
		System.out.println("Nome do Produto: " + this.getNomeProduto());
		System.out.println("Quantidade do Produto: " + this.getQuantidadeProduto());
		System.out.println("Preço do Produto: " + this.getPrecoProduto());
	}
}
