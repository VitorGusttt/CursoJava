
import java.util.Scanner;

public class exerciciosFor {

	public static void main(String[] args) {
		// exercicio 1
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			;
		}
		;

		// exercicio 2
		x = sc.nextInt();
		int y, in, out;
		in = 0;
		out = 0;
		for (int i = 0; i < x; i++) {
			y = sc.nextInt();
			if (y >= 10 && y <= 20) {
				in += 1;
			} else {
				out += 1;
			}
			;
		}
		;
		System.out.println("in " + in);
		System.out.println("out " + out);

		// exercicio 3
		x = sc.nextInt();
		for (int i = 0; i < x; i++) {
			double a, b, c, media;
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			media = ((a * 2) + (b * 3) + (c * 5)) / 10;
			System.out.printf("media = %.1f %n", media);
		}
		;
		//exercicio 4
		x = sc.nextInt();
		for (int i = 1; i < x + 1; i++) {
			double num1 = sc.nextInt();
			double num2 = sc.nextInt();
			double divisao = num1/num2;
			
			if (num2 != 0) {
				System.out.println(divisao);	
			}
			else {
				System.out.println("Divisão impossivel");
			};
		};
		
		//exercicio 5
		x = sc.nextInt();
		int fator;
		fator = 0;
		for (int i = x-1; i > 0 ; i--) {
			fator += x * i;
		};
		System.out.println(fator);
		// exercicio 6
		x = sc.nextInt();
		for (int i = 1; i < x + 1; i++) {
			if (x%i == 0) {
				System.out.println(i);	
			};
		};
		
		//execicio 7 
		x = sc.nextInt();
		for (int i = 1; i < x + 1; i++) {
			int quadrado = (int) Math.pow(i, 2);
			int cubo = (int) Math.pow(i, 3);
			System.out.printf("%d %d %d %n", i ,quadrado ,cubo);
		};
	};
};
