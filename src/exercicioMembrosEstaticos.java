import java.util.Locale;
import java.util.Scanner;

import util.CalculadoraDollar;

public class exercicioMembrosEstaticos {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double qtdDollar, cotacaoDollar;
		System.out.print("Cotacao do dollar: ");
		cotacaoDollar = sc.nextDouble();
		System.out.print("Quantidade de dollar: ");
		qtdDollar = sc.nextDouble();
		
		
		System.out.printf("Total a pagar: R$%.2f", CalculadoraDollar.valorEmReais(cotacaoDollar, qtdDollar));
	}

}
