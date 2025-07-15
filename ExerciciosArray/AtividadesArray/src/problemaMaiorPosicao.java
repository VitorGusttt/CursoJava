import java.util.Scanner;

public class problemaMaiorPosicao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double maiorNumero = 0; int posicaoMaior = 0;
		double[] numeros = new double[n];
		for (int i = 0 ; i<n; i++) {
			numeros[i] = sc.nextInt();
		};
		
		for (int i = 0; i<numeros.length; i++) {
			if (numeros[i] > maiorNumero) {
				maiorNumero = numeros[i];
				posicaoMaior = i;
			};
		};
		
		System.out.println("Maior valor: " + maiorNumero);
		System.out.println("Posicao: " + posicaoMaior);
		
	}

}
