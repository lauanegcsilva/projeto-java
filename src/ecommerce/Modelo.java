package ecommerce;

public abstract class Modelo {

	private int opcao;
	private String nomeProduto;
	private int quantidadeProduto;
	private float precoProduto;

	public Modelo(int opcao, String nomeProduto, int quantidadeProduto, float precoProduto) {
		this.opcao = opcao;
		this.nomeProduto = nomeProduto;
		this.quantidadeProduto = quantidadeProduto;
		this.precoProduto = precoProduto;

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

	public int getNumero() {
		return opcao;
	}
}
