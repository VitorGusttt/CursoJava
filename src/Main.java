
public class Main {

	public static void main(String[] args) {
		//definir var
		String produto = "Desktop";
		String produto2 = "Mesa de escritorio";
		
		int idade = 18;
		int codigo = 2950;
		char genero = 'M';
		
		double preco = 2500.99;
		double preco2 = 400.25;
		double medida = 60.24503212321;
		
		//mostrar
		System.out.println("Produtos:");
		System.out.printf("%s, seu preço é R$%.2f %n", produto, preco);
		System.out.printf("%s, seu preço é R$%.2f %n %n", produto2, preco2);
		System.out.printf("Registro: %d anos, código %d e genêro: %s %n", idade, codigo, genero);
		System.out.printf("Medida com 8 casas decimais: %.8f %n", medida);
		System.out.printf("Medida com 3 casas decimais: %.3f %n", medida);
	}

}
