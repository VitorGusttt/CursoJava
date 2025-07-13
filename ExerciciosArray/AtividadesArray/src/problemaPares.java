import java.util.Scanner;

public class problemaPares {

	public static void main(String[] args) {
		/*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na 
		tela todos os números pares, e também a quantidade de números pares. */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros vai digitar: ");
		int n = sc.nextInt(); 
		int[] numeros = new int[n];
		int pares = 0;
		for (int i  = 0; i<numeros.length; i++) {
			System.out.print("Digite o numero: ");
			numeros[i] = sc.nextInt();
			if (numeros[i] % 2 == 0) {
				pares += 1;
			};
		};
		
		System.out.println("Numeros Pares");
		for (int i  = 0; i<numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.printf("%d ", numeros[i]);
			};
		};
		
	
		System.out.printf("%nQuantidade de pares: %d", pares);
	}

}
