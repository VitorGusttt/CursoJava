import java.util.Locale;
import java.util.Scanner;

public class exerciciosAtribuicao {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// Primeiro exercicio
		System.out.println("Primeiro exercicio");
		int a, b, soma;
		// ler
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		// somar
		soma = a + b;
		// mostrar
		System.out.printf("%d + %d = %d %n", a, b, soma);

		// segundo exercicio
		System.out.println("Segundo exercicio");
		// ler, iniciar valores
		double raio, area, pi;
		pi = 3.14159;

		raio = sc.nextDouble();
		// Area
		area = pi * Math.pow(raio, 2);
		// mostrar
		System.out.printf("Area: %.4f %n", area);

		// terceiro execicio
		System.out.println("Terceiro exercicio");
		// ler 4 valores
		int q, w, e, r, dif;
		q = sc.nextInt();
		w = sc.nextInt();
		e = sc.nextInt();
		r = sc.nextInt();
		// diferenca
		dif = q * w - e * r;
		// mostrar
		System.out.println("Diferença: " + dif);

		// quarto execicio
		System.out.println("Quarto exercicio");

		// ler 4 valores
		int numF, horasF;
		double salarioF, valorHora;

		numF = sc.nextInt();
		horasF = sc.nextInt();
		valorHora = sc.nextDouble();
		// conta
		salarioF = valorHora * horasF;
		// mostrar
		System.out.println("Numero: " + numF);
		System.out.printf("Salario: R$%.2f %n", salarioF);

		//quinto exercicio
		System.out.println("Quinto exercicio");

		// ler valores
		int codigoProd1, quantidadeProd1, codigoProd2, quantidadeProd2;
		double valorProd1, valorProd2, total;
		
		codigoProd1 = sc.nextInt();
		quantidadeProd1 = sc.nextInt();
		valorProd1 = sc.nextDouble();
		codigoProd2 = sc.nextInt();
		quantidadeProd2 = sc.nextInt();
		valorProd2 = sc.nextDouble();
		//conta
		total = (valorProd1 * quantidadeProd1) + (valorProd2 * quantidadeProd2);
		// mostrar
		System.out.printf("Valor a pagar: R$%.2f %n", total);
		
		//sexto exeracicio
		System.out.println("Sexto exercicio");
		double j,k,l, triangulo, circulo, trapezio, quadrado, retangulo;
		j = sc.nextDouble();
		k = sc.nextDouble();
		l = sc.nextDouble();
		
		triangulo = j * l / 2;
		circulo = pi * Math.pow(l, 2);
		trapezio = (j + k) * l / 2;
		quadrado = k * k;
		retangulo = j * k;
		
		System.out.printf("TRIANGULO: %.3f %n", triangulo);
		System.out.printf("CIRCULO: %.3f %n", circulo);
		System.out.printf("TRAPEZIO: %.3f %n", trapezio);
		System.out.printf("QUADRADO: %.3f %n", quadrado);
		System.out.printf("RETANGULO: %.3f %n", retangulo);

		
	
		sc.close();
	}
}
