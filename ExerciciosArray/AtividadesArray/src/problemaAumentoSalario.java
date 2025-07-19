import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import Entidades.Funcionario;

public class problemaAumentoSalario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//criação da lista de funcionarios
		List <Funcionario> funcionarios = new ArrayList<Funcionario>();

		//leitura
		System.out.print("Funcionario a serem lidos: ");
		int x = sc.nextInt() + 1;
		
		for (int i = 1; i < x; i++) {
			System.out.println("Funcionario #" + i);
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			Funcionario funcionario =  new Funcionario(id, nome, salario);
			funcionarios.add(funcionario);
		};
		
		System.out.print("Id do funcionario para aumento: ");
		int idAumento = sc.nextInt();
		System.out.print("Porcentagem: ");
		double porcentagem = sc.nextDouble();
		
		//filtro os resultados apenas para o id
		Funcionario funcionarioAumentoSalarial = funcionarios.stream()
			    .filter(funcionario -> funcionario.getId() == idAumento)
			    .findFirst()
			    .orElse(null);

		
		//ajuste salarial
		if(funcionarioAumentoSalarial == null) {
			System.out.println("Funcionario não existe");
		}else {
			funcionarioAumentoSalarial.aumentoSalarial(porcentagem);
		}
		

		//mostrar
		for(Funcionario individuo:funcionarios){
			System.out.println(individuo);
		}
}

}
