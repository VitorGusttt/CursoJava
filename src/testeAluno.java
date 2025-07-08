import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;

public class testeAluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno aluno;
		aluno = new Aluno();
		
		aluno.nome = sc.nextLine();
		aluno.notaA = sc.nextDouble();
		aluno.notaB = sc.nextDouble();
		aluno.notaC = sc.nextDouble();
		
		System.out.println(aluno);
	
		
	}

}
