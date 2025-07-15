import java.util.Scanner;

public class problemaMediaPares {

	public static void main(String[] args) {
		/*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média 
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for 
digitado, mostrar a mensagem "NENHUM NUMERO PAR".*/
		Scanner sc = new Scanner(System.in);
		System.out.print("Numero de elementos: ");
		int n = sc.nextInt(); double[] vetor = new double[n]; int pares = 0;double media = 0; int qtdPares = 0;
		
		for (int i = 0; i<vetor.length; i++) {
			System.out.printf("numero: ");
			vetor[i] = sc.nextDouble();
			if(vetor[i] %2 == 0) {
				media += vetor[i];
				qtdPares++;
			};
		};
		
		media /= qtdPares;;
	
		if (media == 0) {
			System.out.println("Nenhum par");
		}else {
			System.out.println("Media pares: " + media);
		}
	}
}
