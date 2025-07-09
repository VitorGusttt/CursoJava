package entidades;

public class Construtores {
	public String nome;
	public double preco;
	public int qtd;
	
	public Construtores(String nome, double preco, int qtd) {
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}

	public String toString() {
		return nome + ", R$" + String.format("%.2f", preco) + ", " + qtd + " unidade(s), R$"
				+ String.format("%.2f", this.totalEstoque()) + " no estoque.";
	};

	public double totalEstoque() {
		return preco * qtd;
	}

	public void adcProdNoEst(int x) {
		qtd += x;
		System.out.printf("Dados atualizados: %n%s", this.toString());
	};

	public void tiraProdNoEst(int x) {
		qtd -= x;
		System.out.printf("Dados atualizados: %n%s", this.toString());
	};
}
