package ecommerce;

import java.util.List;

public interface OperacoesPedido {

	void cadastrarPedido(Pedido pedido);

	default void listarPedidos(List<Pedido> listaPedidos) {
		for (Pedido pedido : listaPedidos) {
			System.out.println("Nome do Produto: " + pedido.getNomeProduto());
			System.out.println("Quantidade do Produto: " + pedido.getQuantidadeProduto());
			System.out.println("Preço do Produto: " + pedido.getPrecoProduto());
			System.out.println("------------------------");
		}
	}
}
