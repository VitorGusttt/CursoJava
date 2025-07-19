import java.util.Locale;
import java.util.Scanner;

import Entidades.Estudante;
import Entidades.Quarto;

public class problemaPensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos irao reservar o quarto: " );
		int x = sc.nextInt();
		Estudante[] estudantes = new Estudante[x];
		Quarto[] quartos = new Quarto[10];//cria 10 quartos
		
		for (int i = 0; i<x ; i++) {
			String nome; String email; int quartoReservado;
			System.out.print("Nome: ");
			sc.nextLine();
			nome = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			System.out.print("Numero do quarto: ");
			quartoReservado = sc.nextInt();
			
			estudantes[i] = new Estudante(nome, email);
			quartos[quartoReservado] = new Quarto(estudantes[i], quartoReservado);
		};
		
		for (int i = 0; i<10; i++) {
			if (quartos[i] != null){
				System.out.printf("Nome: %s , Email: %s %nQuarto: %d%n%n", quartos[i].getHospede().getNome(), quartos[i].getHospede().getEmail(), quartos[i].getNumeroQuarto() );
			};
		};
		
	}

}
