import java.util.Locale;
import java.util.Scanner;

import entidades.Construtores;

public class construtores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os dados do produto(nome, preco e quantidade):");

		Construtores a;

		String nome = sc.nextLine();
		double preco = sc.nextDouble();
		int qtd = sc.nextInt();
		a = new Construtores(nome, preco, qtd);
		System.out.println(a);
		a.adcProdNoEst(4);
		a.tiraProdNoEst(2);
		
		
	}
}
