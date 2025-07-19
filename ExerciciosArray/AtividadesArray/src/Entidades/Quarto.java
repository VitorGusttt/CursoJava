package Entidades;

public class Quarto {
	private Estudante hospede;
	private int numeroQuarto;
	
	public Quarto(Estudante hospede, int numeroQuarto) {
		this.setHospede(hospede);
		this.setNumeroQuarto(numeroQuarto);
	}
	
	public Estudante getHospede() {
		return hospede;
	}
	public void setHospede(Estudante hospede) {
		this.hospede = hospede;
	}
	public int getNumeroQuarto() {
		return numeroQuarto;
	}
	public void setNumeroQuarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	
	
}
