import java.util.Scanner;

public class problemaSomaVetores {

	public static void main(String[] args) {
		/*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um 
		terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima 
		o vetor C gerado.*/
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] vetor = new int[n]; int[] vetor2 = new int[n]; int[] vetor3 = new int[n];

		System.out.println("Vetor 1: ");
		for(int i = 0; i<vetor.length; i++) {
			System.out.print("Numero: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("Vetor 2: ");
		for(int i = 0; i<vetor2.length; i++) {
			System.out.print("Numero: ");
			vetor2[i] = sc.nextInt();
		}
		
		System.out.println("Vetor 3: ");
		for(int i = 0; i<vetor3.length; i++) {
			vetor3[i] = vetor[i] + vetor2[i];
			System.out.println(vetor3[i]);
		}
		
	}
	

}
