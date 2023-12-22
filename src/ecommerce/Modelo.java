package ecommerce;

public abstract class Modelo {

	private int opcao;
	private int quantidadeProduto;
	private float precoProduto;
	private String nomeProduto;

	public Modelo(int opcao, int quantidadeProduto, float precoProduto, String nomeProduto) {
		this.opcao = opcao;
		this.quantidadeProduto = quantidadeProduto;
		this.precoProduto = precoProduto;
		this.nomeProduto = nomeProduto;
	}

	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
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

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
}
