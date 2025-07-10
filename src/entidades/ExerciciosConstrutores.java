package entidades;

public class ExerciciosConstrutores {
	private int numeroConta;
	private String nomeTitular;
	private double saldo;
	
	

	public String toString() {
		return "Conta: " + numeroConta + ", Titular = " + nomeTitular + ", Saldo: R$"
				+ String.format("%.2f", saldo);
	}

	public ExerciciosConstrutores(int numeroConta, String nomeTitular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.deposito(depositoInicial);
	}
	
	public ExerciciosConstrutores(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void deposito(double  deposito) {
		this.saldo += deposito;
	}
	public void saque(double saque) {
		this.saldo -= saque + 5;
	}
	
	
	
}
