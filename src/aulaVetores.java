import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class aulaVetores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] vector = new double [n];
		
		for(int i = 0; i<n; i++) {
			;
			vector[i] = sc.nextDouble();
		};
		
		double soma = 0;
		for(int i = 0; i<n; i++) {
			soma += vector[i];
		};
		
		double media = soma / n;
		
		System.out.printf("Altura media = %.2fm", media);
		
		
		//fazer array de Produtos
		n = sc.nextInt();
		Produto[] arrayProdutos = new Produto[n];
		
		for (int i = 0; i<n; i++) {
			System.out.print("Produto: ");
			String nome = sc.next();
			System.out.print("Preco: ");
			double preco= sc.nextDouble();
			arrayProdutos[i] = new Produto(nome, preco);
		};
		
		soma = 0;
		for (int i = 0; i<n; i++) {
			Produto prod = arrayProdutos[i];
			soma += prod.preco;
		}
		
		double precoMedio = soma / n;
		
		System.out.printf("Preco medio dos produtos: R$%.2f", precoMedio);
		
		sc.close();
	
	};
		
}
