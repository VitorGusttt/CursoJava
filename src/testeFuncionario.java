import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class testeFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario func;
		func = new Funcionario();
		System.out.print("Nome: ");
		func.nome = sc.nextLine();
		System.out.print("Salario Bruto: ");
		func.salarioBruto = sc.nextDouble();
		System.out.print("Imposto que paga: ");
		func.imposto = sc.nextDouble();
		
		System.out.println(func);
		
		System.out.print("Porcentagem de aumento de salario: ");
		func.aumentoSalario(sc.nextDouble());
		
		System.out.println("atualizado: " +func);
		
		
	}

}
