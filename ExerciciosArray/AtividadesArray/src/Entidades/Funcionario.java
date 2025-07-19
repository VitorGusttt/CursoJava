package Entidades;

public class Funcionario {
	private int id;
	private String nome;
	private double salario;
	
	public Funcionario(int id, String nome, double salario) {
			setId(id); setNome(nome); this.salario = salario;
	};
	
	@Override
	public String toString() {
		return "Funcionario: " + id + ", " + nome + ", R$" + String.format("%.2f", salario);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void aumentoSalarial(double porcentagem) {
		double aumento = (porcentagem * this.salario) / 100; 
		this.salario += aumento;
	}
	
	
}
