import java.util.Locale;
import java.util.Scanner;

import entidades.ExerciciosConstrutores;

public class exercicioConstrutores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ExerciciosConstrutores conta;
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();		
		System.out.print("Numero Conta: ");
		int numeroConta = sc.nextInt();
		
		System.out.print("Deposito Inicial (S/N): ");
		char resposta = sc.next().charAt(0);
		if (resposta == 's' || resposta == 'S') {
			System.out.print("Deposito Inicial: R$");
			double depositoInicial = sc.nextDouble();
			conta = new ExerciciosConstrutores(numeroConta, nome, depositoInicial);		
		}else {
			conta = new ExerciciosConstrutores(numeroConta, nome);	
		};
		
		System.out.println(conta);
		
		System.out.print("Deposito: ");
		double deposito = sc.nextDouble();
		conta.deposito(deposito);
		
		System.out.printf("Dados atualizados: %n");
		System.out.println(conta);
		
		System.out.print("Saque: ");
		double saque = sc.nextDouble();
		conta.saque(saque);
		
		System.out.printf("Dados atualizados: %n");
		System.out.println(conta);

		
	}

}
