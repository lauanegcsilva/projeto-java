package ecommerce;

import java.util.ArrayList;
import java.util.Iterator;

public class Produto {

	private static ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

	private String nomeProduto;
	private int quantidadeProduto;
	private float precoProduto;

	public Produto(String nomeProduto, int quantidadeProduto, float precoProduto) {
		this.nomeProduto = nomeProduto;
		this.quantidadeProduto = quantidadeProduto;
		this.precoProduto = precoProduto;
	}

	public static ArrayList<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public static void setListaProdutos(ArrayList<Produto> listaProdutos) {
		Produto.listaProdutos = listaProdutos;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}

	public float getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(float precoProduto) {
		this.precoProduto = precoProduto;
	}

	public static void cadastrarProduto(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("Produto cadastrado com sucesso!");
	}

	public static void listarProdutos() {
		for (Produto produto : listaProdutos) {
			produto.visualizarProduto();
		}
	}

	public static void excluirProduto(String nomeProduto) {
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

	public static void atualizarProduto(String nomeProduto, int novaQuantidade, float novoPreco) {
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
