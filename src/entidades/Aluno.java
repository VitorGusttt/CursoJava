package entidades;

public class Aluno {
	public String nome;
	public double notaA;
	public double notaB;
	public double notaC;
	
	public double somaNotas() {
		return notaA + notaB + notaC;
	}
	
	public String toString() {
		if (this.somaNotas() >= 60) {
			return "Nota final: "
					+ this.somaNotas()
					+" -- Aprovado";
		}
		else{
			double faltou = 60 - this.somaNotas();
			return "Nota final: "
					+ this.somaNotas()
					+" -- Reprovado -- Faltou: "
					+ faltou 
					+ " pontos";
		}
	};
}
