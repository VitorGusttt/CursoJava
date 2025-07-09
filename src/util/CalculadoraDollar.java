package util;

public class CalculadoraDollar {
	public static double imposto = 0.06;
	
	public static double valorEmReais(double cotacao ,double qtdDollars) {
		double total = (cotacao * qtdDollars);
		total += total * imposto;
		return total;
	};
}
