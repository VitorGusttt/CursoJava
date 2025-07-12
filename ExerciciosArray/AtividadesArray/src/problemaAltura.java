import java.util.Locale;
import java.util.Scanner;

import Entidades.Pessoa;

public class problemaAltura {

	public static void main(String[] args) {
		/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na 
			tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, 
			bem como os nomes dessas pessoas caso houver.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas: ");
		int numeroPessoasLidas = sc.nextInt();
		double alturaMedia = 0; int menoresIdade = 0; int porcentagemMenores;
		Pessoa[] pessoas = new Pessoa[numeroPessoasLidas];
		
		for (int i = 0; i < pessoas.length ; i++) {
			System.out.printf("Dados da %da pessoa: %n", i + 1);
			pessoas[i] = new Pessoa();
			System.out.print("Nome: ");
			sc.nextLine();
			pessoas[i].setNome(sc.nextLine());
			System.out.print("Idade: ");
			pessoas[i].setIdade(sc.nextInt());
			System.out.print("Altura: ");
			pessoas[i].setAltura(sc.nextDouble());
		};
		
		for (int i = 0 ; i<pessoas.length; i++) {
			alturaMedia += pessoas[i].getAltura();
			if (pessoas[i].getIdade() < 16) {
				menoresIdade += 1;
			};
		};
		
		Pessoa[] pessoasMenoresIdade = new Pessoa[menoresIdade];
		
		int index = 0;
		for (int i = 0 ; i < pessoas.length; i++) {
			if (pessoas[i].getIdade() < 16) {
				pessoasMenoresIdade[index] = new Pessoa();
				pessoasMenoresIdade[index].setNome(pessoas[i].getNome());
				pessoasMenoresIdade[index].setIdade(pessoas[i].getIdade());
				pessoasMenoresIdade[index].setAltura(pessoas[i].getAltura());
				index++;
			}
		}

		
		porcentagemMenores = (100 * pessoasMenoresIdade.length) / pessoas.length; 
		
		System.out.printf("Altura media: %.2f%n",alturaMedia / pessoas.length);
		System.out.println("Pessoas menores de 16 anos: " + porcentagemMenores + "%");
		for (int i = 0; i < pessoasMenoresIdade.length; i++) {
			System.out.println(pessoasMenoresIdade[i].getNome());
		}
		
		
		
		
	}

}
