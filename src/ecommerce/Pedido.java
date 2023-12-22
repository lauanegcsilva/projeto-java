package ecommerce;

import java.util.ArrayList;

public class Pedido extends Modelo {

	private ArrayList<Produto> produtos;

	public Pedido(String nome, int quantidade, float preco) {
		super(nome, quantidade, preco);
		this.produtos = new ArrayList<>();
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
	}
}
