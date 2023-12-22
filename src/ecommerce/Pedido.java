package ecommerce;

import java.util.ArrayList;

public class Pedido extends Modelo implements OperacoesPedido {

	private static ArrayList<Pedido> listaPedidos = new ArrayList<>();
	private static int numeroPedido = 1;

	public Pedido(int quantidadeProduto, float precoProduto, String nomeProduto) {
	    super(numeroPedido, quantidadeProduto, precoProduto, nomeProduto);
	    numeroPedido++;
	    cadastrarPedido(this);
	}

	@Override
	public void cadastrarPedido(Pedido pedido) {
		listaPedidos.add(pedido);
		System.out.println("Pedido cadastrado com sucesso!");
	}
}