import java.util.Scanner;
import java.util.Locale;
public class exerciciosCondicionais {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		//exercicio 1 - negativo ou positivo
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		if (a < 0) {
			System.out.println("Negativo");
		}
		else {
			System.out.println("Positivo");
		};
		
		//exercicio 2 - par ou impar
		int b;
		b = sc.nextInt();
		
		if(b % 2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Impar");
		}
		
		//exercicio 3 -- Multiplos
		int c, d;
		c = sc.nextInt();
		d = sc.nextInt();
		if (c % d == 0  ||  d % c == 0) {
			System.out.println("São Multíplos");
		}
		else {
			System.out.println("Não são");
		};
		
		//exercicios 4 -- horas de um jogo (max 24)
		
		int duracao, inicio, fim;
		inicio = sc.nextInt();
		fim = sc.nextInt();
		if (inicio < fim) {
			duracao = fim - inicio;
		}
		else{
			duracao = 24 - inicio + fim;
		}
		System.out.println(duracao);
		
		//exercicio 5 -- conta de hotdog
		
		int codigo, qtd;
		double totalLanche;
		
		codigo = sc.nextInt();
		qtd = sc.nextInt();
		
		if (codigo == 1) {
			totalLanche = 4 * qtd;
			}
		else if (codigo == 2){
			totalLanche = 4.5 * qtd;
		}
		else if (codigo == 3){
			totalLanche = 5 * qtd;
		}
		else if (codigo == 4){
			totalLanche = 2 * qtd;
		}
		else{
			totalLanche = 1.5 * qtd;
		};
			
		System.out.printf("Total dos lanche: R$%.2f %n", totalLanche);

		//exercicio 6 -- ler intervalo;

		double valorIntervalo = sc.nextDouble();
		if (valorIntervalo > 0 && valorIntervalo < 25) {
			System.out.println("Intervalo [0, 25]");
		}
		else if (valorIntervalo > 25 && valorIntervalo < 50) {
			System.out.println("Intervalo [25, 50]");
		}
		else if (valorIntervalo > 50 && valorIntervalo < 75) {
			System.out.println("Intervalo [50, 75]");
		}
		else if (valorIntervalo > 75 && valorIntervalo < 100) {
			System.out.println("Intervalo [75, 100]");
		}
		else {
			System.out.println("Fora do intervalo");
		}
		
		//exercicio 7 -- cartesiano
		double ponto1,ponto2;
		ponto1 = sc.nextDouble();
		ponto2 = sc.nextDouble();
		
		if (ponto1 == 0 && ponto2 == 0) {
			System.out.println("Origem");
		}
		else if (ponto1 == 0) {
			System.out.println("Eixo x");
		}
		else if (ponto2 == 0) {
			System.out.println("Eixo y");
		}
		else if (ponto1 > 0 && ponto2 > 0) {
			System.out.println("Q1");
		}
		else if (ponto1 > 0 && ponto2 < 0) {
			System.out.println("Q4");
		}
		else if (ponto1 < 0 && ponto2 > 0) {
			System.out.println("Q2");
		}
		else if (ponto1 < 0 && ponto2 < 0) {
			System.out.println("Q3");
		}
		
		//execicio 9 -- IR
		double salario,impostoAPagar;
		
		salario =sc.nextDouble();
		impostoAPagar = 0;
		
		if (salario <= 2000) {
			impostoAPagar = 0;
		}
		else if(salario <= 3000) {
			impostoAPagar = (salario - 2000) * 0.08;
		}
		else if (salario <= 4500) {
			impostoAPagar = (salario - 3000) * 0.18 + 1000 * 0.08;
		}
		else{
			impostoAPagar = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
		};
		
		if (impostoAPagar == 0) {
			System.out.println("isento");
		}
		else {
			System.out.printf("Imposto a pagar: R$%.2f", impostoAPagar);	
		};

		sc.close();
		
	}

}
