import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class produtosNoEstoque {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os dados do produto(nome, preco e quantidade):");
		
		Produto a;
		a = new Produto();
		a.nome = sc.nextLine();
		a.preco = sc.nextDouble();
		a.qtd = sc.nextInt();
		System.out.println(a);
		a.adcProdNoEst(4);
		a.tiraProdNoEst(2);
		
	}

}
