import java.util.Scanner;

public class problemaNegativos {

	public static void main(String[] args) {
		/*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros 
		e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos*/
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros vai digitar nego: ");
		int n = sc.nextInt();
		int[] arrayInteiros = new int[n];
		
	
		
		for (int i = 0; i < arrayInteiros.length; i++) {
			System.out.print("Numero: ");
			arrayInteiros[i] = sc.nextInt();
		};
		
		System.out.println("Numeros Negativos");
		for (int i = 0; i < arrayInteiros.length; i++) {
			if(arrayInteiros[i] < 0) {
				System.out.println(arrayInteiros[i]);
			}
		};
		sc.close();
	}

}
