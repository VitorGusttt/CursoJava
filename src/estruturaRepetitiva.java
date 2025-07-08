

import java.util.Scanner;

public class estruturaRepetitiva {

	public static void main(String[] args) {
		int x, soma;
		soma = 0;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		while (x != 0) {
			soma += x;
			x = sc.nextInt();
		};
		System.out.println(soma);
		
		
		int numRepet = sc.nextInt();
		int total, numConta;
		total = 0;
		for (int i = 0; i < numRepet ; i++)//Basicamente, começamos com i = 0 e enquanto ele for menor que 4, a cada repetição, vamos somar ele 
			{
			numConta = sc.nextInt();
			total += numConta;
		};
		System.out.println(total);
	}


}
