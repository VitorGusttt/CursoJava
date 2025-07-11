import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class problemaSomaVetor {

	public static void main(String[] args) {
		/* Faça um programa que leia N números reais e armazene-os 
		 * em um vetor. Em seguida:
		 *  - Imprimir todos os elementos do vetor 
		 *  - Mostrar na tela a soma e a média dos elementos do vetor */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.printf("Quantos numeros vai digitar nego: ");
		int n = sc.nextInt();
		double[] array = new double[n];
		double media = 0;
		double soma = 0;
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("Numero: ");
			array[i] = sc.nextInt();
		};
		
		String valores = Arrays.toString(array);
		
		valores = valores.replace("[", "");
		valores = valores.replace("]", "");
		
		System.out.println("Valores: " + valores);
		
		for (int i = 0; i<array.length; i++) {
			soma += array[i];
		};
		
		System.out.printf("Soma: %.2f%n", soma);
		System.out.printf("Media: %.2f%n", soma / array.length);
		
		
	}

}
