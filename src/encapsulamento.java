import java.util.Scanner;

import entidades.Pessoa;

public class encapsulamento {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Vitor", "111.111.111.11", "1234");
		System.out.println(p1.getNome());
		System.out.println(p1.getCpf());
		System.out.println(p1.getSenha());
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um novo nome: ");
		String novoNome = sc.nextLine();
		System.out.print("Digite um novo cpf: ");
		String novoCpf = sc.nextLine();
		System.out.print("Digite uma nova senha: ");
		String novaSenha = sc.nextLine();
		p1.setNome(novoNome);
		p1.setCpf(novoCpf);
		p1.setSenha(novaSenha);
		System.out.println(p1.getNome());
		System.out.println(p1.getCpf());
		System.out.println(p1.getSenha());
	}

}
