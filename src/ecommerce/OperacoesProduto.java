package ecommerce;

public interface OperacoesProduto {
	void cadastrarProduto(Produto produto);

	void listarProdutos();

	void excluirProduto(String nomeProduto);

	void atualizarProduto(String nomeProduto, int novaQuantidade, float novoPreco);
}
