import java.util.Scanner;

public class problemaAbaixoDaMedia {

	public static void main(String[] args) {
		/*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida, 
		mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos 
		os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.*/
		Scanner sc = new Scanner(System.in);
		System.out.print("Numero de elementos: ");
		int n = sc.nextInt(); double[] vetor = new double[n]; double media = 0;
		
		for (int i = 0; i<vetor.length; i++) {
			System.out.printf("numero: ");
			vetor[i] = sc.nextDouble();
			media += vetor[i];
		};
		media /= n;
		
		System.out.printf("media: %.3f%n", media);
		System.out.println("Abaixo da media");
		for (int i = 0; i<vetor.length; i++) {
			if (vetor[i] < media) {
				System.out.println(vetor[i]);
			};
		};
	}
}
