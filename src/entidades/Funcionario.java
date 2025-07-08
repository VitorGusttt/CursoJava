package entidades;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public String toString() {
		return nome + ", R$" + String.format("%.2f", this.salarioLiquido());
	};
	public double salarioLiquido() {
		return this.salarioBruto - this.imposto;
	};
	public void aumentoSalario(double porcentagem) {
		this.salarioBruto += this.salarioBruto * (porcentagem / 100);
	};
	
	
}
