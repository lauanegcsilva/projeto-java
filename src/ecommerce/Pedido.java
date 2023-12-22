package ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Pedido extends Modelo implements OperacoesPedido {

	private static List<Pedido> listaPedidos = new ArrayList<>();
	private int numeroPedido;

	public Pedido(String nomeProduto, int quantidadeProduto, float precoProduto) {
		super(0, nomeProduto, quantidadeProduto, precoProduto);
		this.numeroPedido = listaPedidos.size() + 1;
		cadastrarPedido(this);
	}

	@Override
	public void cadastrarPedido(Pedido pedido) {
		listaPedidos.add(pedido);
		System.out.println("Pedido cadastrado com sucesso!");
	}

	public int getQuantidadeProduto() {
		return super.getQuantidadeProduto();
	}

	public float getPrecoProduto() {
		return super.getPrecoProduto();
	}

	public String getNomeProduto() {
		return super.getNomeProduto();
	}

	public void listarPedidos() {
		for (Pedido pedido : listaPedidos) {
			System.out.println("Nome do Produto: " + pedido.getNomeProduto());
			System.out.println("Quantidade do Produto: " + pedido.getQuantidadeProduto());
			System.out.println("Preço do Produto: " + pedido.getPrecoProduto());
			System.out.println("------------------------");
		}
	}

}