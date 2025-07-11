package entidades;

public class Produto {
	// definir os atributos
	public String nome;
	public double preco;
	public int qtd;
	
	public Produto(String nome, double preco, int qtd) {
			this.nome = nome;
			this.preco = preco;
			this.qtd = qtd;
	}
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	

	public String toString() {
		return nome
				+ ", R$"
				+ String.format("%.2f", preco)
				+ ", "
				+ qtd
				+ " unidade(s), R$"
				+ String.format("%.2f", this.totalEstoque())
				+ " no estoque.";
	};

	public double totalEstoque() {
		return preco * qtd;
	}
	public void adcProdNoEst(int x) {
		qtd += x;
		System.out.printf("Dados atualizados: %n%s",this.toString());
	};

	public void tiraProdNoEst(int x) {
		qtd -= x;
		System.out.printf("Update:%nProduto: %s; %nPreco: R$%.2f; %nQuantidade: %d;%nTotal no estoque: R$%.2f%n %n",
				nome, preco, qtd, preco * qtd);
	};


};
