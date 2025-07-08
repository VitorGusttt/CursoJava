package entidades;

public class Retangulo {
	public double altura;
	public double largura;
	
	public String toString() {
		return "Retangulo com altura: "
				+ altura + " largura: "
				+ largura + " area: "
				+ this.area()
				+ " perimetro:"
				+ this.perimetro()
				+ " diagonal: "
				+ this.diagonal();
	}
	public double area(){
		return altura * largura;
	};
	public double perimetro() {
		return 2 * (altura + largura);
	};
	public double diagonal() {
		return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
	}

}
